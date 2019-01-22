package fr.jmini.empoa.jackson;

import static org.assertj.core.api.Assertions.assertThat;

import org.eclipse.microprofile.openapi.models.OpenAPI;
import org.testng.annotations.Test;

import fr.jmini.empoa.extended.tck.AbstractSpecTest;

public class OpenAPISerializerToYamlTest extends AbstractSpecTest {

    @Override
    protected void runTest(Specs spec) throws Exception {
        OpenAPI openAPI = createOpenAPI(spec);
        assertThat(openAPI).isNotNull();

        String expected = readFromResource(toResourceName(spec));
        String yaml = OpenAPISerializer.serialize(openAPI, OpenAPISerializer.Format.YAML);

        assertThat(yaml).isEqualToIgnoringNewLines(expected);
    }

    private String toResourceName(Specs spec) {
        switch (spec) {
        case PING:
            return "/jackson-serializer/yaml/ping.yaml";
        case HELLO:
            return "/jackson-serializer/yaml/hello.yaml";
        case TODOAPP:
            return "/jackson-serializer/yaml/todoapp.yaml";
        default:
            throw new IllegalArgumentException("Unknown spec: " + spec);
        }
    }

    @Test
    public void detect() throws Exception {
        // This is requested by the gradle build to detect this test class, see https://docs.gradle.org/current/userguide/java_testing.html#sec:test_detection
    }
}
