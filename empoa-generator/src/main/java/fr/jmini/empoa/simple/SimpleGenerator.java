package fr.jmini.empoa.simple;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import fr.jmini.empoa.specs.AdditionalMethod;
import fr.jmini.empoa.specs.AdditionalMethod.Type;
import fr.jmini.empoa.specs.Element;
import fr.jmini.empoa.specs.IMember;
import fr.jmini.empoa.specs.ListMember;
import fr.jmini.empoa.specs.MapMember;
import fr.jmini.empoa.specs.Member;
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
            Member refMember = new Member("ref", "String", true, true, false, true);
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
            Member refMember = new MapMember("extensions", "Object", false, true, false);
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
            sb.append("    @Override\n");
            sb.append("    public void " + listMember.removeName + "(" + listMember.itemFqType + " " + itemVarName + ") {\n");
            sb.append("        if (" + memberName + " != null) {\n");
            sb.append("            " + memberName + ".remove(" + itemVarName + ");\n");
            sb.append("        }\n");
            sb.append("    }\n");
            sb.append("\n");
        }
    }

    private void generateAdditionalMethod(StringBuilder sb, Type type) {
        switch (type) {
        case PathItem_getOperations:
            sb.append("    @Override\n");
            sb.append("    public java.util.Map<HttpMethod, " + org.eclipse.microprofile.openapi.models.Operation.class.getCanonicalName() + "> getOperations() {\n");
            sb.append("        java.util.Map<HttpMethod, " + org.eclipse.microprofile.openapi.models.Operation.class.getCanonicalName() + "> map = new java.util.LinkedHashMap<>();\n");
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
            sb.append("    public " + org.eclipse.microprofile.openapi.models.OpenAPI.class.getSimpleName() + " path(String name, org.eclipse.microprofile.openapi.models.PathItem path) {\n");
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
            sb.append("    public " + org.eclipse.microprofile.openapi.models.security.SecurityRequirement.class.getSimpleName() + " addScheme(String key, String scope) {\n");
            sb.append("        java.util.List<String> list = new java.util.ArrayList<>();\n");
            sb.append("        list.add(scope);\n");
            sb.append("        return addScheme(key, list);\n");
            sb.append("    }\n");
            sb.append("\n");
            break;
        case SecurityRequirement_addScheme_empty:
            sb.append("    @Override\n");
            sb.append("    public " + org.eclipse.microprofile.openapi.models.security.SecurityRequirement.class.getSimpleName() + " addScheme(String key) {\n");
            sb.append("        return addScheme(key, new java.util.ArrayList<>());\n");
            sb.append("    }\n");
            sb.append("\n");
            break;
        case Schema_setAdditionalPropertiesBoolean:
            sb.append("    @Override\n");
            sb.append("    public void setAdditionalPropertiesSchema(" + org.eclipse.microprofile.openapi.models.media.Schema.class.getSimpleName() + " additionalProperties) {\n");
            sb.append("        _additionalPropertiesBoolean = null;\n");
            sb.append("        _additionalPropertiesSchema = additionalProperties;\n");
            sb.append("    }\n");
            sb.append("\n");
            break;
        case Schema_setAdditionalPropertiesSchema:
            sb.append("    @Override\n");
            sb.append("    public void setAdditionalPropertiesBoolean(Boolean additionalProperties) {\n");
            sb.append("        _additionalPropertiesSchema = null;\n");
            sb.append("        _additionalPropertiesBoolean = additionalProperties;\n");
            sb.append("    }\n");
            sb.append("\n");
            break;
        case APIResponses_getDefaultValue:
            sb.append("    @Override\n");
            sb.append("    public " + org.eclipse.microprofile.openapi.models.responses.APIResponse.class.getCanonicalName() + " getDefaultValue() {\n");
            sb.append("        return get(DEFAULT);\n");
            sb.append("    }\n");
            sb.append("\n");
            break;
        case APIResponses_setDefaultValue:
            sb.append("    @Override\n");
            sb.append("    public void setDefaultValue(" + org.eclipse.microprofile.openapi.models.responses.APIResponse.class.getCanonicalName() + " defaultValue) {\n");
            sb.append("        addAPIResponse(DEFAULT, defaultValue);\n");
            sb.append("    }\n");
            sb.append("\n");
            break;
        default:
            throw new IllegalArgumentException("Unexpected type " + type);
        }

    }

    public void writeFile() throws IOException {
        Path file = input.srcFolder.resolve(implPackageName.replace(".", "/") + "/" + implClassName + ".java");
        Files.createDirectories(file.getParent());
        Files.write(file, generateContent().getBytes());
    }

}
