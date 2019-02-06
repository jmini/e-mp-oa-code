/*******************************************************************************
 * Copyright 2019 Jeremie Bresson
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package fr.jmini.empoa.generator.simple;

import java.io.IOException;

import fr.jmini.empoa.generator.Input;
import fr.jmini.empoa.specs.AdditionalMethod;
import fr.jmini.empoa.specs.AdditionalMethod.Type;
import fr.jmini.empoa.specs.Element;
import fr.jmini.empoa.specs.IMember;
import fr.jmini.empoa.specs.ListMember;
import fr.jmini.empoa.specs.MapMember;
import fr.jmini.empoa.specs.Member;
import fr.jmini.empoa.util.FileUtil;
import fr.jmini.empoa.util.StringUtil;

public class SimpleGenerator {

    private Element element;
    private Input input;
    private String simpleName;
    private String implClassName;
    private String implPackageName;

    public SimpleGenerator(Element element, Input input) {
        this.element = element;
        this.input = input;
        init();
    }

    private void init() {
        simpleName = StringUtil.computeSimpleName(element.fqName);
        implClassName = StringUtil.computeSimpleName(element.fqName) + "Impl";
        implPackageName = StringUtil.computePackage(element.fqName)
                .replace("org.eclipse.microprofile.openapi", input.rootPackage);
    }

    public String generateContent() {
        StringBuilder sb = new StringBuilder();
        sb.append("package " + implPackageName + ";\n");
        sb.append("\n");
        sb.append("import " + element.fqName + ";\n");
        sb.append("\n");
        sb.append("public class " + implClassName);
        if (element.mapOfItemFq != null) {
            sb.append(" extends java.util.LinkedHashMap<String, " + element.mapOfItemFq + ">");
        }
        sb.append(" implements " + simpleName);
        sb.append(" {\n");
        if (element.mapOfItemFq != null) {
            sb.append("    private static final long serialVersionUID = 1L;\n");
        }
        sb.append("\n");
        if (element.referenceable) {
            Member refMember = new Member(null, "ref", "String", true, true, false, true);
            generateMember(sb, refMember);

            String memberName = "_ref";
            String varName = "ref";
            String elementPath;
            if (simpleName.startsWith("API")) {
                elementPath = StringUtil.decapitalize(StringUtil.plural(simpleName.substring(3)));
            } else {
                elementPath = StringUtil.decapitalize(StringUtil.plural(simpleName));
            }
            sb.append("    @Override\n");
            sb.append("    public void setRef(String " + varName + ") {\n");
            sb.append("        if (ref != null && !ref.contains(\"#\") && !ref.contains(\"/\")) {\n");
            sb.append("            " + memberName + " = \"#/components/" + elementPath + "/\" + " + varName + ";\n");
            sb.append("        } else {\n");
            sb.append("            " + memberName + " = " + varName + ";\n");
            sb.append("        }\n");
            sb.append("    }\n");
            sb.append("\n");
        }
        if (element.extensible) {
            Member refMember = new MapMember(null, "extensions", "Object", false, true, true);
            generateMember(sb, refMember);
        }
        for (IMember member : element.members) {
            if (member instanceof Member) {
                generateMember(sb, (Member) member);
            } else if (member instanceof AdditionalMethod) {
                generateAdditionalMethod(sb, ((AdditionalMethod) member).type);
            }
        }
        if (element.mapOfItemFq != null) {
            String itemVarName = StringUtil.decapitalize(StringUtil.computeSimpleName(element.mapOfItemFq));
            sb.append("    @Override\n");
            sb.append("    public " + simpleName + " " + element.mapAddName + "(String key, " + element.mapOfItemFq + " " + itemVarName + ") {\n");
            sb.append("        this.put(key, " + itemVarName + ");\n");
            sb.append("        return this;\n");
            sb.append("    }\n");
            sb.append("\n");
        }
        sb.append("}\n");
        return sb.toString();
    }

    private void generateMember(StringBuilder sb, Member member) {
        String varName = StringUtil.decapitalize(member.name);
        String memberName = "_" + StringUtil.decapitalize(member.name);
        if (member.hasMemberDeclaration) {
            sb.append("    private " + member.fqType + " " + memberName + ";\n");
            sb.append("\n");
        }
        if (member.hasGetter) {
            sb.append("    @Override\n");
            sb.append("    public " + member.fqType + " " + member.getterName + "() {\n");
            sb.append("        return " + memberName + ";\n");
            sb.append("    }\n");
            sb.append("\n");
        }
        if (member.hasSetter) {
            sb.append("    @Override\n");
            sb.append("    public void " + member.setterName + "(" + member.fqType + " " + varName + ") {\n");
            sb.append("        " + memberName + " = " + varName + ";\n");
            sb.append("    }\n");
            sb.append("\n");
        }
        if (member.hasBuilder) {
            sb.append("    @Override\n");
            sb.append("    public " + simpleName + " " + member.builderName + "(" + member.fqType + " " + varName + ") {\n");
            sb.append("        " + member.setterName + "(" + varName + ");\n");
            sb.append("        return this;\n");
            sb.append("    }\n");
            sb.append("\n");
        }
        if (member instanceof MapMember) {
            MapMember mapMember = (MapMember) member;
            if (mapMember.hasAdd) {
                String itemVarName = StringUtil.decapitalize(StringUtil.computeSimpleName(mapMember.valueFqType));
                String returnType = (mapMember.addReturnsVoid) ? "void" : simpleName;
                sb.append("    @Override\n");
                sb.append("    public " + returnType + " " + mapMember.addName + "(String key, " + mapMember.valueFqType + " " + itemVarName + ") {\n");
                sb.append("        if (" + memberName + " == null) {\n");
                sb.append("            " + memberName + " = new java.util.LinkedHashMap<>();\n");
                sb.append("        }\n");
                sb.append("        " + memberName + ".put(key, " + itemVarName + ");\n");
                if (!mapMember.addReturnsVoid) {
                    sb.append("        return this;\n");
                }
                sb.append("    }\n");
                sb.append("\n");
            }
        }
        if (member instanceof ListMember) {
            ListMember listMember = (ListMember) member;
            String itemVarName = StringUtil.decapitalize(StringUtil.computeSimpleName(listMember.itemFqType));
            sb.append("    @Override\n");
            sb.append("    public " + simpleName + " " + listMember.addName + "(" + listMember.itemFqType + " " + itemVarName + ") {\n");
            sb.append("        if (" + memberName + " == null) {\n");
            sb.append("            " + memberName + " = new java.util.ArrayList<>();\n");
            sb.append("        }\n");
            sb.append("        " + memberName + ".add(" + itemVarName + ");\n");
            sb.append("        return this;\n");
            sb.append("    }\n");
            sb.append("\n");
        }
    }

    private void generateAdditionalMethod(StringBuilder sb, Type type) {
        switch (type) {
        case PathItem_readOperations:
            sb.append("    @Override\n");
            sb.append("    public java.util.List<org.eclipse.microprofile.openapi.models.Operation> readOperations() {\n");
            sb.append("        java.util.List<org.eclipse.microprofile.openapi.models.Operation> list = new java.util.ArrayList<>();\n");
            sb.append("        if (getGET() != null) {\n");
            sb.append("            list.add(getGET());\n");
            sb.append("        }\n");
            sb.append("        if (getPUT() != null) {\n");
            sb.append("            list.add(getPUT());\n");
            sb.append("        }\n");
            sb.append("        if (getPOST() != null) {\n");
            sb.append("            list.add(getPOST());\n");
            sb.append("        }\n");
            sb.append("        if (getDELETE() != null) {\n");
            sb.append("            list.add(getDELETE());\n");
            sb.append("        }\n");
            sb.append("        if (getOPTIONS() != null) {\n");
            sb.append("            list.add(getOPTIONS());\n");
            sb.append("        }\n");
            sb.append("        if (getHEAD() != null) {\n");
            sb.append("            list.add(getHEAD());\n");
            sb.append("        }\n");
            sb.append("        if (getPATCH() != null) {\n");
            sb.append("            list.add(getPATCH());\n");
            sb.append("        }\n");
            sb.append("        if (getTRACE() != null) {\n");
            sb.append("            list.add(getTRACE());\n");
            sb.append("        }\n");
            sb.append("        return java.util.Collections.unmodifiableList(list);\n");
            sb.append("    }\n");
            sb.append("\n");
            break;
        case PathItem_readOperationsMap:
            sb.append("    @Override\n");
            sb.append("    public java.util.Map<HttpMethod, org.eclipse.microprofile.openapi.models.Operation> readOperationsMap() {\n");
            sb.append("        java.util.Map<HttpMethod, org.eclipse.microprofile.openapi.models.Operation> map = new java.util.LinkedHashMap<>();\n");
            sb.append("        if (getGET() != null) {\n");
            sb.append("            map.put(HttpMethod.GET, getGET());\n");
            sb.append("        }\n");
            sb.append("        if (getPUT() != null) {\n");
            sb.append("            map.put(HttpMethod.PUT, getPUT());\n");
            sb.append("        }\n");
            sb.append("        if (getPOST() != null) {\n");
            sb.append("            map.put(HttpMethod.POST, getPOST());\n");
            sb.append("        }\n");
            sb.append("        if (getDELETE() != null) {\n");
            sb.append("            map.put(HttpMethod.DELETE, getDELETE());\n");
            sb.append("        }\n");
            sb.append("        if (getOPTIONS() != null) {\n");
            sb.append("            map.put(HttpMethod.OPTIONS, getOPTIONS());\n");
            sb.append("        }\n");
            sb.append("        if (getHEAD() != null) {\n");
            sb.append("            map.put(HttpMethod.HEAD, getHEAD());\n");
            sb.append("        }\n");
            sb.append("        if (getPATCH() != null) {\n");
            sb.append("            map.put(HttpMethod.PATCH, getPATCH());\n");
            sb.append("        }\n");
            sb.append("        if (getTRACE() != null) {\n");
            sb.append("            map.put(HttpMethod.TRACE, getTRACE());\n");
            sb.append("        }\n");
            sb.append("        return java.util.Collections.unmodifiableMap(map);\n");
            sb.append("    }\n");
            sb.append("\n");
            break;
        case OpenAPI_path:
            sb.append("    @Override\n");
            sb.append("    public OpenAPI path(String name, org.eclipse.microprofile.openapi.models.PathItem path) {\n");
            sb.append("        if(getPaths() == null) {\n");
            sb.append("            setPaths(new PathsImpl());\n");
            sb.append("        }\n");
            sb.append("        getPaths().addPathItem(name, path);\n");
            sb.append("        return this;\n");
            sb.append("    }\n");
            sb.append("\n");
            break;
        case SecurityRequirement_addScheme_singleton:
            sb.append("    @Override\n");
            sb.append("    public SecurityRequirement addScheme(String key, String scope) {\n");
            sb.append("        java.util.List<String> list = new java.util.ArrayList<>();\n");
            sb.append("        list.add(scope);\n");
            sb.append("        return addScheme(key, list);\n");
            sb.append("    }\n");
            sb.append("\n");
            break;
        case SecurityRequirement_addScheme_empty:
            sb.append("    @Override\n");
            sb.append("    public SecurityRequirement addScheme(String key) {\n");
            sb.append("        return addScheme(key, new java.util.ArrayList<>());\n");
            sb.append("    }\n");
            sb.append("\n");
            sb.append("");
            break;
        default:
            throw new IllegalArgumentException("Unexpected type " + type);
        }

    }

    public void writeFile() throws IOException {
        FileUtil.writeJavaClass(input.srcFolder, implPackageName, implClassName, generateContent());
    }
}
