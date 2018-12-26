package fr.jmini.empoa.smallrye.tck;

import java.io.IOException;

import org.eclipse.microprofile.openapi.models.OpenAPI;
import org.testng.annotations.Test;

import fr.jmini.empoa.extended.tck.AbstractSerializerTest;
import io.smallrye.openapi.runtime.io.OpenApiSerializer;
import io.smallrye.openapi.runtime.io.OpenApiSerializer.Format;

public class SerializerTckTest extends AbstractSerializerTest {

    @Override
    protected String convertToJson(OpenAPI openAPI) throws IOException {
        return OpenApiSerializer.serialize(openAPI, Format.JSON);
    }

    @Test
    public void detect() throws Exception {
        // This is requested by the gradle build to detect this test class, see https://docs.gradle.org/current/userguide/java_testing.html#sec:test_detection
    }
}
