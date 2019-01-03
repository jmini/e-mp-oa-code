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
        sb.append(" implements " + simpleName);
        sb.append(" {\n");
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
            Member refMember = new MapMember(null, "extensions", "Object", false, true, false);
            generateMember(sb, refMember);
        }
        for (IMember member : element.members) {
            if (member instanceof Member) {
                generateMember(sb, (Member) member);
            } else if (member instanceof AdditionalMethod) {
                generateAdditionalMethod(sb, ((AdditionalMethod) member).type);
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    private void generateMember(StringBuilder sb, Member member) {
        boolean isMapMember = member instanceof MapMember;
        boolean isListMember = member instanceof ListMember;
        String varName = StringUtil.decapitalize(member.name);
        String memberName = "_" + StringUtil.decapitalize(member.name);
        if (member.hasMemberDeclaration) {
            sb.append("    private " + member.fqType + " " + memberName + ";\n");
            sb.append("\n");
        }
        if (member.hasGetter) {
            sb.append("    @Override\n");
            sb.append("    public " + member.fqType + " " + member.getterName + "() {\n");
            if (isMapMember || isListMember) {
                sb.append("        if (" + memberName + " == null) {\n");
                sb.append("            return null;\n");
                sb.append("        }\n");
                if (isMapMember) {
                    sb.append("        return " + java.util.Collections.class.getCanonicalName() + ".unmodifiableMap(" + memberName + ");\n");
                }
                if (isListMember) {
                    sb.append("        return " + java.util.Collections.class.getCanonicalName() + ".unmodifiableList(" + memberName + ");\n");
                }
            } else {
                sb.append("        return " + memberName + ";\n");
            }
            sb.append("    }\n");
            sb.append("\n");

        }
        if (member.hasSetter) {
            sb.append("    @Override\n");
            sb.append("    public void " + member.setterName + "(" + member.fqType + " " + varName + ") {\n");
            if (isMapMember || isListMember) {
                sb.append("        if (" + varName + " == null) {\n");
                sb.append("            " + memberName + " = null;\n");
                sb.append("        } else {\n");
                if (isMapMember) {
                    sb.append("            " + memberName + " = new java.util.LinkedHashMap<>();\n");
                    sb.append("            " + memberName + ".putAll(" + varName + ");\n");
                }
                if (isListMember) {
                    sb.append("            " + memberName + " = new java.util.ArrayList<>();\n");
                    sb.append("            " + memberName + ".addAll(" + varName + ");\n");
                }
                sb.append("        }\n");
            } else {
                sb.append("        " + memberName + " = " + varName + ";\n");
            }
            sb.append("    }\n");
            sb.append("\n");
        }
        if (isMapMember) {
            MapMember mapMember = (MapMember) member;
            if (mapMember.hasAdd) {
                String itemVarName = StringUtil.decapitalize(StringUtil.computeSimpleName(mapMember.valueFqType));
                String returnType = (mapMember.addReturnsVoid) ? "void" : simpleName;
                sb.append("    @Override\n");
                sb.append("    public " + returnType + " " + mapMember.addName + "(String key, " + mapMember.valueFqType + " " + itemVarName + ") {\n");
                sb.append("        if (" + itemVarName + " == null) {\n");
                sb.append("            throw new " + IllegalArgumentException.class.getSimpleName() + "(\"Null value for key '\" + key + \"' is not allowed\");\n");
                sb.append("        } else {\n");
                sb.append("            if (" + memberName + " == null) {\n");
                sb.append("                " + memberName + " = new java.util.LinkedHashMap<>();\n");
                sb.append("            }\n");
                sb.append("            " + memberName + ".put(key, " + itemVarName + ");\n");
                sb.append("        }\n");
                if (!mapMember.addReturnsVoid) {
                    sb.append("        return this;\n");
                }
                sb.append("    }\n");
                sb.append("\n");
            }
            sb.append("    @Override\n");
            sb.append("    public void " + mapMember.removeName + "(String key) {\n");
            sb.append("        if (" + memberName + " != null) {\n");
            sb.append("            " + memberName + ".remove(key);\n");
            sb.append("        }\n");
            sb.append("    }\n");
            sb.append("\n");
        } else if (isListMember) {
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
            sb.append("        return getAPIResponse(DEFAULT);\n");
            sb.append("    }\n");
            sb.append("\n");
            break;
        case APIResponses_setDefaultValue:
            sb.append("    @Override\n");
            sb.append("    public void setDefaultValue(" + org.eclipse.microprofile.openapi.models.responses.APIResponse.class.getCanonicalName() + " defaultValue) {\n");
            sb.append("        if (defaultValue == null) {\n");
            sb.append("            removeAPIResponse(DEFAULT);\n");
            sb.append("        } else {\n");
            sb.append("            addAPIResponse(DEFAULT, defaultValue);\n");
            sb.append("        }\n");
            sb.append("    }\n");
            sb.append("\n");
            break;
        default:
            throw new IllegalArgumentException("Unexpected type " + type);
        }

    }

    public void writeFile() throws IOException {
        FileUtil.writeJavaClass(input.srcFolder, implPackageName, implClassName, generateContent());
    }
}
