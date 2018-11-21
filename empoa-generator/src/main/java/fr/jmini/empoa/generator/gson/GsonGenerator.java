package fr.jmini.empoa.generator.gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

import fr.jmini.empoa.generator.Input;
import fr.jmini.empoa.specs.Element;
import fr.jmini.empoa.specs.IMember;
import fr.jmini.empoa.specs.MapMember;
import fr.jmini.empoa.specs.Member;
import fr.jmini.empoa.util.StringUtil;

public class GsonGenerator {

    private Element element;
    private Input input;
    private String simpleName;
    private String serializerClassName;
    private String serializerPackageName;

    public GsonGenerator(Element element, Input input) {
        this.element = element;
        this.input = input;
        init();
    }

    private void init() {
        simpleName = StringUtil.computeSimpleName(element.fqName);
        serializerClassName = StringUtil.computeSimpleName(element.fqName) + "Serializer";
        serializerPackageName = StringUtil.computePackage(element.fqName)
                .replace("org.eclipse.microprofile.openapi.models", input.rootPackage);
    }

    public String generateContent() {
        StringBuilder sb = new StringBuilder();
        sb.append("package " + serializerPackageName + ";\n");
        sb.append("import java.lang.reflect.Type;\n");
        sb.append("\n");
        sb.append("import " + element.fqName + ";\n");
        sb.append("\n");
        sb.append("import com.google.gson.JsonElement;\n");
        sb.append("import com.google.gson.JsonObject;\n");
        sb.append("import com.google.gson.JsonSerializationContext;\n");
        sb.append("import com.google.gson.JsonSerializer;\n");
        sb.append("\n");
        sb.append("public class " + serializerClassName);
        sb.append(" implements JsonSerializer<" + simpleName + ">");
        sb.append(" {\n");
        sb.append("\n");
        sb.append("    @Override\n");
        sb.append("    public JsonElement serialize(" + simpleName + " src, Type typeOfSrc, JsonSerializationContext context) {\n");
        sb.append("        JsonObject object = new JsonObject();\n");
        String prefix;
        if (element.referenceable) {
            sb.append("        if(src.getRef() != null) {\n");
            sb.append("            object.addProperty(\"$ref\", src.getRef());\n");
            sb.append("        } else {\n");
            sb.append("            \n");
            prefix = "            ";
        } else {
            prefix = "        ";
        }
        MapMember singleMap = findSingleMapMember(element);
        if (singleMap == null) {
            for (IMember imember : element.members) {
                if (imember instanceof Member) {
                    Member member = (Member) imember;
                    String getter = "src." + member.getterName + "()";
                    String oasProperty = computeOASPropertyName(member);
                    sb.append(prefix + "if (" + getter + " != null) {\n");
                    sb.append(prefix + "    object.add(\"" + oasProperty + "\", context.serialize(" + getter + "));\n");
                    sb.append(prefix + "}\n");
                }
            }
        } else {
            String getter = "src." + singleMap.getterName + "()";
            sb.append(prefix + "if (!" + getter + ".isEmpty()) {\n");
            sb.append(prefix + "    for (java.util.Map.Entry<String, " + singleMap.valueFqType + "> entry : " + getter + ".entrySet()) {\n");
            sb.append(prefix + "        object.add(entry.getKey(), context.serialize(entry.getValue()));\n");
            sb.append(prefix + "    }\n");
            sb.append(prefix + "}\n");
        }
        if (element.extensible) {
            sb.append(prefix + "if (src.getExtensions() != null) {\n");
            sb.append(prefix + "    for (java.util.Map.Entry<String, Object> extension : src.getExtensions()\n");
            sb.append(prefix + "            .entrySet()) {\n");
            sb.append(prefix + "        object.add(extension.getKey(), context.serialize(extension.getValue()));\n");
            sb.append(prefix + "    }\n");
            sb.append(prefix + "}\n");
        }
        if (element.referenceable) {
            sb.append("        }\n");
        }

        sb.append("        return object;\n");
        sb.append("    }\n");
        sb.append("\n");
        sb.append("}\n");
        return sb.toString();
    }

    private static MapMember findSingleMapMember(Element e) {
        switch (e.type) {
        case Paths:
        case Callback:
        case Content:
        case APIResponses:
        case Scopes:
        case SecurityRequirement:
        case ServerVariables:
            List<MapMember> list = e.members.stream()
                    .filter(m -> m instanceof MapMember)
                    .map(m -> (MapMember) m)
                    .collect(Collectors.toList());
            if (list.size() != 1) {
                throw new IllegalStateException("Expecting only one MapMember, got " + list.size());
            }
            return list.get(0);
        default:
            return null;
        }
    }

    private String computeOASPropertyName(Member member) {
        String name = member.getterName.replace("get", "");
        if (name.toUpperCase()
                .equals(name)) {
            return name.toLowerCase();
        }
        return StringUtil.decapitalize(name);
    }

    public void writeFile() throws IOException {
        Path file = input.srcFolder.resolve(serializerPackageName.replace(".", "/") + "/" + serializerClassName + ".java");
        Files.createDirectories(file.getParent());
        Files.write(file, generateContent().getBytes());
    }

}
