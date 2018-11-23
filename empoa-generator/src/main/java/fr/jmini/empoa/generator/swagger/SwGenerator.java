package fr.jmini.empoa.generator.swagger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import fr.jmini.empoa.generator.Input;
import fr.jmini.empoa.specs.AdditionalMethod;
import fr.jmini.empoa.specs.AdditionalMethod.Type;
import fr.jmini.empoa.specs.Element;
import fr.jmini.empoa.specs.IMember;
import fr.jmini.empoa.specs.ListMember;
import fr.jmini.empoa.specs.MapMember;
import fr.jmini.empoa.specs.Member;
import fr.jmini.empoa.specs.swagger.SwElement;
import fr.jmini.empoa.util.StringUtil;

public class SwGenerator {

    private SwElement swElement;
    private Element mpElement;
    private Input input;
    private String simpleName;
    private String implClassName;
    private String implPackageName;
    private String swVarName;

    public SwGenerator(SwElement swElement, Input input) {
        this.swElement = swElement;
        this.mpElement = swElement.oaElement;
        this.input = input;
        init();
    }

    private void init() {
        simpleName = StringUtil.computeSimpleName(mpElement.fqName);
        swVarName = "sw" + simpleName;
        implClassName = "Sw" + simpleName;
        implPackageName = StringUtil.computePackage(mpElement.fqName)
                .replace("org.eclipse.microprofile.openapi", input.rootPackage);
    }

    public String generateContent() {
        StringBuilder sb = new StringBuilder();
        sb.append("package " + implPackageName + ";\n");
        sb.append("\n");
        sb.append("import " + mpElement.fqName + ";\n");
        sb.append("\n");
        sb.append("public class " + implClassName);
        sb.append(" implements " + simpleName);
        sb.append(" {\n");
        sb.append("\n");
        sb.append("    private " + swElement.swFqName + " " + swVarName + ";\n");
        sb.append("\n");
        sb.append("    public " + implClassName + "() {\n");
        sb.append("        " + swVarName + " = new " + swElement.swFqName + "();\n");
        sb.append("    }\n");
        sb.append("\n");
        sb.append("    public " + implClassName + "(" + swElement.swFqName + " " + swVarName + ") {\n");
        sb.append("        this." + swVarName + " = " + swVarName + ";\n");
        sb.append("    }\n");
        sb.append("\n");
        if (mpElement.referenceable) {
            Member refMember = new Member(null, "ref", "String", true, true, false, true);
            generateMember(sb, refMember);

            String varName = "ref";
            sb.append("    @Override\n");
            sb.append("    public void setRef(String " + varName + ") {\n");
            sb.append("    }\n");
            sb.append("\n");
        }
        if (mpElement.extensible) {
            Member refMember = new MapMember(null, "extensions", "Object", false, true, false);
            generateMember(sb, refMember);
        }
        for (IMember member : mpElement.members) {
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
        if (member.hasGetter) {
            String var = "result";
            sb.append("    @Override\n");
            sb.append("    public " + member.fqType + " " + member.getterName + "() {\n");
            if (isMapMember || isListMember /* || needsConversion */) {
                // TODO Swagger type instead of `member.fqType`
                sb.append("        " + member.fqType + " " + var + " = " + swVarName + "." + member.getterName + "();\n");
                sb.append("        if (" + var + " == null) {\n");
                sb.append("            return null;\n");
                sb.append("        }\n");
                if (isMapMember) {
                    // TODO: transform
                    sb.append("        return java.util.Collections.unmodifiableMap(" + var + ");\n");
                } else if (isListMember) {
                    // TODO: transform
                    sb.append("        return java.util.Collections.unmodifiableList(" + var + ");\n");
                } else {
                    // TODO: transform
                    sb.append("        return " + var + ";\n");
                }
            } else {
                sb.append("        return " + swVarName + "." + member.getterName + "();\n");
            }
            sb.append("    }\n");
            sb.append("\n");

        }
        if (member.hasSetter) {
            sb.append("    @Override\n");
            sb.append("    public void " + member.setterName + "(" + member.fqType + " " + varName + ") {\n");
            if (isMapMember || isListMember /* || needsConversion */) {
                if (isMapMember || isListMember) {
                    sb.append("        " + swVarName + "." + member.setterName + "(null);\n");
                }
                sb.append("        if (" + varName + " != null) {\n");
                if (isMapMember) {
                    MapMember mapMember = (MapMember) member;
                    sb.append("            for (" + member.fqType.replace("Map<", "Map.Entry<") + " e : " + varName + ".entrySet()) {\n");
                    sb.append("                this." + mapMember.addName + "(e.getKey(), e.getValue());\n");
                    sb.append("            }\n");
                } else if (isListMember) {
                    ListMember listMember = (ListMember) member;
                    sb.append("            for (" + listMember.itemFqType + " e : " + varName + ") {\n");
                    sb.append("                this." + listMember.addName + "(e);\n");
                    sb.append("            }\n");
                } else {
                    // TODO: transform
                    sb.append("        " + swVarName + "." + member.setterName + "(" + varName + ");\n");
                    sb.append("        } else {\n");
                    sb.append("        " + swVarName + "." + member.setterName + "(null);\n");

                }
                sb.append("        }\n");
            } else {
                sb.append("        " + swVarName + "." + member.setterName + "(" + varName + ");\n");
            }
            sb.append("    }\n");
            sb.append("\n");
        }
        if (isMapMember) {
            MapMember mapMember = (MapMember) member;
            if (mapMember.hasAdd) {
                String itemVarName = StringUtil.decapitalize(StringUtil.computeSimpleName(mapMember.valueFqType));
                sb.append("    @Override\n");
                sb.append("    public " + simpleName + " " + mapMember.addName + "(String key, " + mapMember.valueFqType + " " + itemVarName + ") {\n");
                // TODO: transform `itemVarName`
                sb.append("        " + swVarName + "." + mapMember.addName + "(key, " + itemVarName + ");\n");
                sb.append("        return this;\n");
                sb.append("    }\n");
                sb.append("\n");
            }
            sb.append("    @Override\n");
            sb.append("    public void " + mapMember.removeName + "(String key) {\n");
            sb.append("    }\n");
            sb.append("\n");
        } else if (isListMember) {
            ListMember listMember = (ListMember) member;
            String itemVarName = StringUtil.decapitalize(StringUtil.computeSimpleName(listMember.itemFqType));
            sb.append("    @Override\n");
            sb.append("    public " + simpleName + " " + listMember.addName + "(" + listMember.itemFqType + " " + itemVarName + ") {\n");
            // TODO: transform `e`;
            sb.append("        " + swVarName + "." + listMember.addName + "(e);\n");
            sb.append("        return this;\n");
            sb.append("    }\n");
            sb.append("\n");
            sb.append("    @Override\n");
            sb.append("    public void " + listMember.removeName + "(" + listMember.itemFqType + " " + itemVarName + ") {\n");
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
