package fr.jmini.empoa.javapoet;

import org.eclipse.microprofile.openapi.models.OpenAPI;
import org.testng.annotations.Test;

import com.squareup.javapoet.JavaFile;

import fr.jmini.empoa.extended.tck.specs.PingSpec;

public class JavaFileConverterTest {

    @Test
    public void testName() throws Exception {
        OpenAPI openAPI = PingSpec.create();
        JavaFile javaFile = JavaFileConverter.createOpenAPI(openAPI, "com.example", "PingSpec");
        javaFile.writeTo(System.out);
    }
}
