package fr.jmini.empoa.generator.gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import fr.jmini.empoa.generator.Input;
import fr.jmini.empoa.specs.Element;
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
        sb.append("        return object;\n");
        sb.append("    }\n");
        sb.append("\n");
        sb.append("}\n");
        return sb.toString();
    }

    public void writeFile() throws IOException {
        Path file = input.srcFolder.resolve(serializerPackageName.replace(".", "/") + "/" + serializerClassName + ".java");
        Files.createDirectories(file.getParent());
        Files.write(file, generateContent().getBytes());
    }

}
