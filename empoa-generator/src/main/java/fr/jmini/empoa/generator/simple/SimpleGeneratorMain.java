package fr.jmini.empoa.generator.simple;

import java.nio.file.Paths;

import fr.jmini.empoa.generator.Input;
import fr.jmini.empoa.specs.Element;
import fr.jmini.empoa.specs.OpenAPISpec;

public class SimpleGeneratorMain {

    public static void main(String[] args) throws Exception {
        Input input = new Input(Paths.get("../empoa-simple-models-impl/src/main/java"), "fr.jmini.empoa.simple.internal");
        for (Element element : OpenAPISpec.elements()) {
            SimpleGenerator generator = new SimpleGenerator(element, input);
            generator.writeFile();
        }
    }

}
