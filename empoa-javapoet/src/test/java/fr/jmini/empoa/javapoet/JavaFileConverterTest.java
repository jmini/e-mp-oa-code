package fr.jmini.empoa.javapoet;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.assertj.core.api.Assertions;
import org.eclipse.microprofile.openapi.models.OpenAPI;
import org.testng.annotations.Test;

import com.squareup.javapoet.JavaFile;

import fr.jmini.empoa.extended.tck.AbstractSpecTest;
import fr.jmini.empoa.extended.tck.specs.HelloSpec;
import fr.jmini.empoa.extended.tck.specs.PingSpec;
import fr.jmini.empoa.extended.tck.specs.TodoappSpec;

public class JavaFileConverterTest extends AbstractSpecTest {

    @Override
    protected void runTest(Specs spec) throws Exception {
        String packageName = "fr.jmini.empoa.extended.tck.specs";
        String className = toClassName(spec);

        OpenAPI openAPI = createOpenAPI(spec);
        JavaFile javaFile = JavaFileConverter.createOpenAPI(openAPI, packageName, className);

        Path file = toFile(Paths.get("../empoa-extended-tck/src/main/java"), packageName, className);
        String content = new String(Files.readAllBytes(file));

        Assertions.assertThat(javaFile.toString())
                .isEqualToNormalizingWhitespace(content);
    }

    private String toClassName(Specs spec) {
        switch (spec) {
        case PING:
            return PingSpec.class.getSimpleName();
        case HELLO:
            return HelloSpec.class.getSimpleName();
        case TODOAPP:
            return TodoappSpec.class.getSimpleName();
        default:
            throw new IllegalArgumentException("Unknown spec: " + spec);
        }
    }

    public static Path toFile(Path srcFolder, String packageName, String className) {
        Path file = srcFolder.resolve(packageName.replace(".", "/") + "/" + className + ".java");
        return file;
    }

    @Test
    public void detect() throws Exception {
        // This is requested by the gradle build to detect this test class, see https://docs.gradle.org/current/userguide/java_testing.html#sec:test_detection
    }
}
