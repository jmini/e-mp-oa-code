package fr.jmini.empoa.generator.javapoet;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.eclipse.microprofile.openapi.models.media.Schema;

import fr.jmini.empoa.specs.Element;
import fr.jmini.empoa.specs.IMember;
import fr.jmini.empoa.specs.ListMember;
import fr.jmini.empoa.specs.MapMember;
import fr.jmini.empoa.specs.Member;
import fr.jmini.empoa.specs.MemberType;
import fr.jmini.empoa.specs.OpenAPISpec;
import fr.jmini.empoa.util.FileUtil;
import fr.jmini.empoa.util.StringUtil;

public class JavaPoetGeneratorMain {

    private static final String SRC_FOLDER = "../empoa-javapoet/src/main/java";
    private static final String PACKAGE_NAME = "fr.jmini.empoa.javapoet";
    private static final String CLASS_NAME = "CodeBlockConverter";

    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        sb.append("package ");
        sb.append(PACKAGE_NAME);
        sb.append(";\n");
        sb.append("\n");
        sb.append("import java.util.ArrayList;\n");
        sb.append("import java.util.List;\n");
        sb.append("\n");
        sb.append("import com.squareup.javapoet.CodeBlock;\n");
        sb.append("\n");
        sb.append("public class ");
        sb.append(CLASS_NAME);
        sb.append(" {\n");
        for (Element element : OpenAPISpec.elements()) {
            String varName = StringUtil.decapitalize(StringUtil.computeSimpleName(element.fqName));
            sb.append("\n");
            sb.append("    public static CodeBlock " + toCreateMethodName(element.fqName) + "(" + element.fqName + " " + varName + ") {\n");
            sb.append("        List<CodeBlock> list = new ArrayList<>();\n");
            sb.append("        list.add(CodeBlock.of(\"createObject($T.class)\", " + element.fqName + ".class));\n");
            if (element.mapOfItemFq != null) {
                String entryVarName = "entry";
                sb.append("        for (java.util.Map.Entry<String, " + element.mapOfItemFq + "> " + entryVarName + " : " + varName + ".entrySet()) {\n");
                if (isString(element.mapOfItemFq)) {
                    sb.append("            list.add(CodeBlock.of(\"" + element.mapAddName + "($S, $S)\", " + entryVarName + ".getKey(), " + entryVarName + ".getValue()));\n");
                } else if (isSimpleLitteral(element.mapOfItemFq)) {
                    sb.append("            list.add(CodeBlock.of(\"" + element.mapAddName + "($S, $L)\", " + entryVarName + ".getKey(), " + entryVarName + ".getValue()));\n");
                } else if (isMp(element.mapOfItemFq)) {
                    sb.append("            list.add(CodeBlock.of(\"" + element.mapAddName + "(\\n$S, $L\\n)\", " + entryVarName + ".getKey(), " + toCreateMethodName(element.mapOfItemFq) + "(" + entryVarName
                            + ".getValue())));\n");
                } else {
                    sb.append("            if (" + entryVarName + ".getValue()\n");
                    sb.append("                    .isEmpty()) {\n");
                    sb.append("                list.add(CodeBlock.of(\"addScheme($S)\", " + entryVarName + ".getKey()));\n");
                    sb.append("            } else if (" + entryVarName + ".getValue()\n");
                    sb.append("                    .size() == 1) {\n");
                    sb.append("                list.add(CodeBlock.of(\"addScheme($S, $S)\", " + entryVarName + ".getKey(), " + entryVarName + ".getValue()\n");
                    sb.append("                        .get(0)));\n");
                    sb.append("            } else {\n");
                    sb.append("                list.add(CodeBlock.of(\"addScheme(\\n$S, $T.asList(\\n$L\\n)\\n)\", " + entryVarName + ".getKey(), " + Arrays.class.getCanonicalName() + ".class, CodeBlock.join(" + entryVarName
                            + ".getValue()\n");
                    sb.append("                        .stream()\n");
                    sb.append("                        .map(s -> CodeBlock.of(\"$S\", s))\n");
                    sb.append("                        .collect(" + Collectors.class.getCanonicalName() + ".toList()), \",\\n\")));\n");
                    sb.append("            }\n");
                }
                sb.append("        }\n");
            }
            if (element.referenceable) {
                String getterName = "getRef";
                sb.append("        if (" + varName + "." + getterName + "() != null) {\n");
                sb.append("            list.add(CodeBlock.of(\"ref($S)\", " + varName + "." + getterName + "()));\n");
                sb.append("        }\n");
            }
            for (IMember m : element.members) {
                if (m instanceof Member) {
                    Member member = (Member) m;
                    if (member.type != MemberType.Schema_AdditionalProperties_Schema && member.type != MemberType.Schema_AdditionalProperties_Boolean) {
                        sb.append("        if (" + varName + "." + member.getterName + "() != null) {\n");
                        if (member.type == MemberType.Schema_AdditionalProperties_Object) {
                            sb.append("            if (schema.getAdditionalProperties() instanceof Boolean) {\n");
                            sb.append("                list.add(CodeBlock.of(\"additionalProperties($L)\", schema.getAdditionalProperties()));\n");
                            sb.append("            } else if (schema.getAdditionalProperties() instanceof " + Schema.class.getCanonicalName() + ") {\n");
                            sb.append("                list.add(CodeBlock.of(\"additionalProperties($L\\n)\", createSchema((" + Schema.class.getCanonicalName() + ") schema.getAdditionalProperties())));\n");
                            sb.append("            }");
                        } else if (isString(member.fqType)) {
                            sb.append("            list.add(CodeBlock.of(\"" + member.builderName + "($S)\", " + varName + "." + member.getterName + "()));\n");
                        } else if (isSimpleLitteral(member.fqType)) {
                            sb.append("            list.add(CodeBlock.of(\"" + member.builderName + "($L)\", " + varName + "." + member.getterName + "()));\n");
                        } else if (isMpEnum(member.fqType)) {
                            sb.append("            list.add(CodeBlock.of(\"" + member.builderName + "($T.$L)\", " + member.fqType + ".class, " + varName + "." + member.getterName + "().name()));\n");
                        } else if (isMp(member.fqType)) {
                            sb.append("            list.add(CodeBlock.of(\"" + member.builderName + "(\\n$L\\n)\", " + toCreateMethodName(member.fqType) + "(" + varName + "." + member.getterName + "())));\n");
                        } else if (isObject(member.fqType)) {
                            sb.append("            if(" + varName + "." + member.getterName + "() instanceof String) {\n");
                            sb.append("                list.add(CodeBlock.of(\"" + member.builderName + "($S)\", " + varName + "." + member.getterName + "()));\n");
                            sb.append("            } else {\n");
                            sb.append("                list.add(CodeBlock.of(\"" + member.builderName + "($L)\", " + varName + "." + member.getterName + "()));\n");
                            sb.append("            }\n");
                        } else if (member instanceof ListMember) {
                            ListMember listMember = (ListMember) member;
                            String itemVarName = "item";
                            sb.append("            for (" + listMember.itemFqType + " " + itemVarName + " : " + varName + "." + member.getterName + "()) {\n");
                            if (isString(listMember.itemFqType)) {
                                sb.append("                list.add(CodeBlock.of(\"" + listMember.addName + "($S)\", " + itemVarName + "));\n");
                            } else if (isSimpleLitteral(listMember.itemFqType)) {
                                sb.append("                list.add(CodeBlock.of(\"" + listMember.addName + "($L)\", " + itemVarName + "));\n");
                            } else if (isMp(listMember.itemFqType)) {
                                sb.append("                list.add(CodeBlock.of(\"" + listMember.addName + "(\\n$L\\n)\", " + toCreateMethodName(listMember.itemFqType) + "(" + itemVarName + ")));\n");
                            } else if (isObject(listMember.itemFqType)) {
                                sb.append("                if(" + itemVarName + " instanceof String) {\n");
                                sb.append("                    list.add(CodeBlock.of(\"" + listMember.addName + "($S)\", " + itemVarName + "));\n");
                                sb.append("                } else {\n");
                                sb.append("                    list.add(CodeBlock.of(\"" + listMember.addName + "($L)\", " + itemVarName + "));\n");
                                sb.append("                }\n");
                            }
                            sb.append("            }\n");
                        } else if (member instanceof MapMember) {
                            MapMember mapMember = (MapMember) member;
                            String entryVarName = "entry";
                            sb.append("            for (java.util.Map.Entry<String, " + mapMember.valueFqType + "> " + entryVarName + " : " + varName + "." + member.getterName + "().entrySet()) {\n");
                            if (isString(mapMember.valueFqType)) {
                                sb.append("                list.add(CodeBlock.of(\"" + mapMember.addName + "($S, $S)\", " + entryVarName + ".getKey(), " + entryVarName + ".getValue()));\n");
                            } else if (isSimpleLitteral(mapMember.valueFqType)) {
                                sb.append("                list.add(CodeBlock.of(\"" + mapMember.addName + "($S, $L)\", " + entryVarName + ".getKey(), " + entryVarName + ".getValue()));\n");
                            } else if (isMp(mapMember.valueFqType)) {
                                sb.append("                list.add(CodeBlock.of(\"" + mapMember.addName + "(\\n$S, $L\\n)\", " + entryVarName + ".getKey(), " + toCreateMethodName(mapMember.valueFqType) + "(" + entryVarName
                                        + ".getValue())));\n");
                            } else if (isObject(mapMember.valueFqType)) {
                                sb.append("                if(" + entryVarName + ".getValue() instanceof String) {\n");
                                sb.append("                    list.add(CodeBlock.of(\"" + mapMember.addName + "($S, $S)\", " + entryVarName + ".getKey(), " + entryVarName + ".getValue()));\n");
                                sb.append("                } else {\n");
                                sb.append("                    list.add(CodeBlock.of(\"" + mapMember.addName + "($S, $L)\", " + entryVarName + ".getKey(), " + entryVarName + ".getValue()));\n");
                                sb.append("                }\n");
                            }
                            sb.append("            }\n");
                        } else {
                            throw new IllegalStateException("Not expected type: " + member.fqType + "for type: " + member.type);
                        }
                        sb.append("        }\n");
                    }
                }
            }
            if (element.extensible) {
                String entryVarName = "entry";
                String getterName = "getExtensions";
                String addName = "addExtension";
                sb.append("        if (" + varName + "." + getterName + "() != null) {\n");
                sb.append("            for (java.util.Map.Entry<String, Object> " + entryVarName + " : " + varName + "." + getterName + "().entrySet()) {\n");
                sb.append("                if(" + entryVarName + ".getValue() instanceof String) {\n");
                sb.append("                    list.add(CodeBlock.of(\"" + addName + "($S, $S)\", " + entryVarName + ".getKey(), " + entryVarName + ".getValue()));\n");
                sb.append("                } else {\n");
                sb.append("                    list.add(CodeBlock.of(\"" + addName + "($S, $L)\", " + entryVarName + ".getKey(), " + entryVarName + ".getValue()));\n");
                sb.append("                }\n");
                sb.append("            }\n");
                sb.append("        }\n");
            }
            sb.append("        return CodeBlock.join(list, \"\\n.\");\n");
            sb.append("    }\n");
        }
        sb.append("}");
        FileUtil.writeJavaClass(Paths.get(SRC_FOLDER), PACKAGE_NAME, CLASS_NAME, sb.toString());
    }

    private static boolean isMp(String fqType) {
        return fqType.startsWith("org.eclipse.microprofile");
    }

    private static boolean isMpEnum(String fqType) {
        return isMp(fqType) && (fqType.endsWith("In") || fqType.endsWith("Style") || fqType.endsWith("Type"));
    }

    private static boolean isSimpleLitteral(String fqType) {
        return fqType.endsWith("Boolean") || fqType.endsWith("Integer") || fqType.endsWith("BigDecimal");
    }

    private static boolean isString(String fqType) {
        return fqType.endsWith("String");
    }

    private static boolean isObject(String fqType) {
        return fqType.endsWith("Object");
    }

    /**
     * @param fqName
     * @return
     */
    private static String toCreateMethodName(String fqName) {
        return "create" + StringUtil.computeSimpleName(fqName);
    }
}
