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
        this.mpElement = swElement.mpElement;
        this.input = input;
        init();
    }

    private void init() {
        simpleName = StringUtil.computeSimpleName(mpElement.fqName);
        swVarName = "_sw" + simpleName;
        implClassName = toImplClassName(mpElement.fqName);
        implPackageName = toImplPackageName(mpElement.fqName);
    }

    private String toImplClassName(String fqName) {
        return "Sw" + StringUtil.computeSimpleName(fqName);
    }

    private String toImplPackageName(String fqName) {
        return StringUtil.computePackage(fqName)
                .replace("org.eclipse.microprofile.openapi", input.rootPackage);
    }

    private String toImplFqnName(String fqName) {
        return toImplPackageName(fqName) + "." + toImplClassName(fqName);
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
        sb.append("    public " + swElement.swFqName + " getSw() {\n");
        sb.append("        return " + swVarName + ";\n");
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
        String memberName = "_" + StringUtil.decapitalize(member.name);
        String initName = "init" + StringUtil.capitalize(member.name);
        boolean isComplexType;
        String memberFqType, innerFqType;
        if (isMapMember) {
            String fqType = ((MapMember) member).valueFqType;
            isComplexType = fqType.startsWith("org.eclipse.microprofile.openapi");
            innerFqType = toImplFqnName(fqType);
            memberFqType = java.util.Map.class.getCanonicalName() + "<String," + toImplFqnName(fqType) + ">";
        } else if (isListMember) {
            String fqType = ((ListMember) member).itemFqType;
            isComplexType = fqType.startsWith("org.eclipse.microprofile.openapi");
            innerFqType = toImplFqnName(fqType);
            memberFqType = java.util.List.class.getCanonicalName() + "<" + innerFqType + ">";
        } else {
            String fqType = member.fqType;
            isComplexType = fqType.startsWith("org.eclipse.microprofile.openapi") && !fqType.endsWith(".Style") && !fqType.endsWith(".In") && !fqType.endsWith(".Type");
            innerFqType = "/* UNDEFINED */";
            memberFqType = toImplFqnName(fqType);
        }
        boolean isEnumType = member.fqType.startsWith("org.eclipse.microprofile.openapi") && (member.fqType.endsWith(".Style") || member.fqType.endsWith(".In") || member.fqType.endsWith(".Type"));

        if (member.hasMemberDeclaration && isComplexType) {
            sb.append("    private " + memberFqType + " " + memberName + ";\n");
            sb.append("\n");
            sb.append("    private void " + initName + "() {\n");
            sb.append("        if (" + swVarName + "." + member.getterName + "() == null) {\n");
            sb.append("            " + memberName + " = null;\n");
            sb.append("        } else {\n");
            if (isMapMember) {
                sb.append("            " + swVarName + "." + member.getterName + "()\n");
                sb.append("                    .entrySet()\n");
                sb.append("                    .stream()\n");
                sb.append("                    .collect(java.util.stream.Collectors.toMap(\n");
                sb.append("                        java.util.Map.Entry::getKey,\n");
                sb.append("                        e -> new " + innerFqType + "(e.getValue()),\n");
                sb.append("                        (k1, k2) -> { throw new IllegalStateException(String.format(\"Duplicate key %s\", k1)); },\n");
                sb.append("                        () -> new " + java.util.LinkedHashMap.class.getCanonicalName() + "()));\n");
            } else if (isListMember) {
                sb.append("            " + swVarName + "." + member.getterName + "()\n");
                sb.append("                    .stream()\n");
                sb.append("                    .map(" + innerFqType + "::new)\n");
                sb.append("                    .collect(java.util.stream.Collectors.toCollection(java.util.ArrayList::new));\n");
            } else {
                sb.append("            " + memberName + " = new " + memberFqType + "(" + swVarName + "." + member.getterName + "());\n");
            }
            sb.append("        }\n");
            sb.append("    }\n");
        }
        if (member.hasGetter) {
            String var = "result";
            sb.append("    @Override\n");
            sb.append("    public " + member.fqType + " " + member.getterName + "() {\n");
            if (isComplexType) {
                sb.append("        " + initName + "();\n");
                if (isMapMember || isListMember) {
                    sb.append("        if (" + memberName + " == null) {\n");
                    sb.append("            return null;\n");
                    sb.append("        }\n");
                }
                if (isMapMember) {
                    sb.append("        return java.util.Collections.unmodifiableMap(" + memberName + ");\n");
                } else if (isListMember) {
                    sb.append("        return java.util.Collections.unmodifiableList(" + memberName + ");\n");
                } else {
                    sb.append("        return " + memberName + ";\n");
                }
            } else {
                if (isMapMember || isListMember) {
                    // TODO Swagger type instead of `member.fqType`
                    sb.append("        " + member.fqType + " " + var + " = " + swVarName + "." + member.getterName + "();\n");
                    sb.append("        if (" + var + " == null) {\n");
                    sb.append("            return null;\n");
                    sb.append("        }\n");
                }
                if (isMapMember) {
                    sb.append("        return java.util.Collections.unmodifiableMap(" + var + ");\n");
                } else if (isListMember) {
                    sb.append("        return java.util.Collections.unmodifiableList(" + var + ");\n");
                } else if (isEnumType) {
                    sb.append("        if (" + swVarName + "." + member.getterName + "() == null) {\n");
                    sb.append("            return null;\n");
                    sb.append("        }\n");
                    sb.append("        switch (" + swVarName + "." + member.getterName + "()) {\n");
                    sb.append("        default:\n");
                    sb.append("            throw new IllegalStateException(\"Unexpected enum value\");\n");
                    sb.append("        }\n");
                } else {
                    sb.append("        return " + swVarName + "." + member.getterName + "();\n");
                }
            }
            sb.append("    }\n");
            sb.append("\n");

        }
        if (member.hasSetter) {
            sb.append("    @Override\n");
            sb.append("    public void " + member.setterName + "(" + member.fqType + " " + varName + ") {\n");
            if (isMapMember || isListMember || isComplexType) {
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
                    appendTypeCheck(sb, varName, memberName, memberFqType, false, "            ");
                    sb.append("            " + swVarName + "." + member.setterName + "(" + memberName + ".getSw());\n");
                    sb.append("        } else {\n");
                    sb.append("            " + memberName + " = null;\n");
                    sb.append("            " + swVarName + "." + member.setterName + "(null);\n");
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
                if (isComplexType) {
                    String valueName = "value";
                    appendTypeCheck(sb, itemVarName, valueName, innerFqType, true, "        ");
                    sb.append("        " + initName + "();\n");
                    sb.append("        if (" + memberName + " == null) {\n");
                    sb.append("            " + memberName + " = new " + java.util.LinkedHashMap.class.getCanonicalName() + "<>();\n");
                    sb.append("        " + swVarName + "." + mapMember.setterName + "(new " + java.util.LinkedHashMap.class.getCanonicalName() + "<>());\n");
                    sb.append("        }\n");
                    sb.append("        " + memberName + ".put(key, " + valueName + ");\n");
                    sb.append("        " + swVarName + "." + mapMember.getterName + "().put(key, " + valueName + ".getSw());\n");
                    // sb.append(" " + swVarName + "." + mapMember.addName + "(key, " + valueName + ".getSw());\n");
                } else {
                    sb.append("        " + swVarName + "." + mapMember.addName + "(key, " + itemVarName + ");\n");
                }
                sb.append("        return this;\n");
                sb.append("    }\n");
                sb.append("\n");
            }
            sb.append("    @Override\n");
            sb.append("    public void " + mapMember.removeName + "(String key) {\n");
            if (isComplexType) {
                sb.append("        " + initName + "();\n");
                sb.append("        if (" + memberName + " != null) {\n");
                sb.append("            " + memberName + ".remove(key);\n");
                sb.append("            " + swVarName + "." + member.getterName + "().remove(key);\n");
                sb.append("        }\n");
            } else {
                sb.append("        if (" + member.getterName + "() != null) {\n");
                sb.append("            " + swVarName + "." + member.getterName + "().remove(key);\n");
                sb.append("        }\n");
            }
            sb.append("    }\n");
            sb.append("\n");
        } else if (isListMember) {
            ListMember listMember = (ListMember) member;
            String itemVarName = StringUtil.decapitalize(StringUtil.computeSimpleName(listMember.itemFqType));
            sb.append("    @Override\n");
            sb.append("    public " + simpleName + " " + listMember.addName + "(" + listMember.itemFqType + " " + itemVarName + ") {\n");
            if (isComplexType) {
                String valueName = "element";
                appendTypeCheck(sb, itemVarName, valueName, innerFqType, true, "        ");
                sb.append("        " + initName + "();\n");
                sb.append("        if (" + memberName + " == null) {\n");
                sb.append("            " + memberName + " = new " + java.util.ArrayList.class.getCanonicalName() + "<>();\n");
                sb.append("        " + swVarName + "." + listMember.setterName + "(new " + java.util.ArrayList.class.getCanonicalName() + "<>());\n");
                sb.append("        }\n");
                sb.append("        " + memberName + ".add(" + valueName + ");\n");
                sb.append("        " + swVarName + "." + listMember.getterName + "().add(" + valueName + ".getSw());\n");
                // sb.append(" " + swVarName + "." + listMember.addName + "(" + valueName + ".getSw());\n");
            } else {
                sb.append("        " + swVarName + "." + listMember.addName + "(" + itemVarName + ");\n");
            }
            sb.append("        return this;\n");
            sb.append("    }\n");
            sb.append("\n");
            sb.append("    @Override\n");
            sb.append("    public void " + listMember.removeName + "(" + listMember.itemFqType + " " + itemVarName + ") {\n");
            if (isComplexType) {
                String valueName = "element";
                appendTypeCheck(sb, itemVarName, valueName, innerFqType, true, "        ");
                sb.append("        " + initName + "();\n");
                sb.append("        if (" + memberName + " != null) {\n");
                sb.append("            " + memberName + ".remove(" + itemVarName + ");\n");
                sb.append("            " + swVarName + "." + member.getterName + "().remove(element.getSw());\n");
                sb.append("        }\n");
            } else {
                sb.append("        if (" + swVarName + "." + member.getterName + "() != null) {\n");
                sb.append("            " + swVarName + "." + member.getterName + "().remove(" + itemVarName + ");\n");
                sb.append("        }\n");
            }
            sb.append("    }\n");
            sb.append("\n");
        }
    }

    private void appendTypeCheck(StringBuilder sb, String varName, String assignedVarName, String assignedFqType, boolean createAssignedVar, String prefix) {
        sb.append(prefix + "if (!(" + varName + " instanceof " + assignedFqType + ")) {\n");
        sb.append(prefix + "    throw new IllegalArgumentException(\"Unexpected type: \" + " + varName + ");\n");
        sb.append(prefix + "}\n");
        String assignedType = (createAssignedVar) ? assignedFqType + " " : "";
        sb.append(prefix + assignedType + assignedVarName + " = (" + assignedFqType + ") " + varName + ";\n");
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
