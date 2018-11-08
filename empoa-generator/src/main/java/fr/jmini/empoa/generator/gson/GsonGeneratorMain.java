package fr.jmini.empoa.generator.gson;

import java.nio.file.Paths;

import fr.jmini.empoa.generator.Input;
import fr.jmini.empoa.specs.Element;
import fr.jmini.empoa.specs.OpenAPISpec;

public class GsonGeneratorMain {

    public static void main(String[] args) throws Exception {
        Input input = new Input(Paths.get("../empoa-gson-serializer/src/main/java"), "fr.jmini.empoa.gson.intermal.serializers");
        for (Element element : OpenAPISpec.elements()) {
            GsonGenerator generator = new GsonGenerator(element, input);
            generator.writeFile();
        }
    }

}
