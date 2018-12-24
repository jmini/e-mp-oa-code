package fr.jmini.empoa.javapoet;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.assertj.core.api.Assertions;
import org.eclipse.microprofile.openapi.models.OpenAPI;
import org.testng.annotations.Test;

import com.squareup.javapoet.JavaFile;

import fr.jmini.empoa.extended.tck.specs.PingSpec;

public class JavaFileConverterTest {

    @Test
    public void testPingSpec() throws Exception {
        String packageName = "fr.jmini.empoa.extended.tck.specs";
        String className = "PingSpec";

        OpenAPI openAPI = PingSpec.create();
        JavaFile javaFile = JavaFileConverter.createOpenAPI(openAPI, packageName, className);

        Path file = toFile(Paths.get("../empoa-extended-tck/src/main/java"), packageName, className);
        String content = new String(Files.readAllBytes(file));

        Assertions.assertThat(javaFile.toString())
                .isEqualToNormalizingWhitespace(content);
    }

    public static Path toFile(Path srcFolder, String packageName, String className) {
        Path file = srcFolder.resolve(packageName.replace(".", "/") + "/" + className + ".java");
        return file;
    }
}
