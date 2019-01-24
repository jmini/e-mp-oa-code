package fr.jmini.empoa.generator.swagger;

import java.nio.file.Paths;

import fr.jmini.empoa.generator.Input;
import fr.jmini.empoa.specs.swagger.SwElement;
import fr.jmini.empoa.specs.swagger.SwSpec;

public class SwGeneratorMain {

    public static void main(String[] args) throws Exception {
        Input input = new Input(Paths.get("../empoa-swagger-core/src/main/java"), "fr.jmini.empoa.swagger.core.internal");
        for (SwElement element : SwSpec.elements()) {
            SwGenerator generator = new SwGenerator(element, input);
            generator.writeFile();
        }
    }

}
