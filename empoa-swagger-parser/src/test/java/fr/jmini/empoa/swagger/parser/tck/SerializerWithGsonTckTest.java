package fr.jmini.empoa.swagger.parser.tck;

import org.eclipse.microprofile.openapi.models.OpenAPI;
import org.testng.annotations.Test;

import com.google.gson.Gson;

import fr.jmini.empoa.extended.tck.AbstractSerializerTest;
import fr.jmini.empoa.gson.OASGsonSerializer;

public class SerializerWithGsonTckTest extends AbstractSerializerTest {

    @Override
    protected String convertToJson(OpenAPI openAPI) {
        Gson gson = OASGsonSerializer.instance();
        return gson.toJson(openAPI);
    }

    @Test
    public void detect() throws Exception {
        // This is requested by the gradle build to detect this test class, see https://docs.gradle.org/current/userguide/java_testing.html#sec:test_detection
    }
}
