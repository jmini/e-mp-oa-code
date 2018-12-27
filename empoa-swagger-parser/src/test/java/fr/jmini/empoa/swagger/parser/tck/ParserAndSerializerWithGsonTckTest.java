package fr.jmini.empoa.swagger.parser.tck;

import java.io.IOException;

import org.eclipse.microprofile.openapi.models.OpenAPI;
import org.testng.annotations.Test;

import com.google.gson.Gson;

import fr.jmini.empoa.extended.tck.AbstractSerializerTest;
import fr.jmini.empoa.gson.OASGsonSerializer;
import fr.jmini.empoa.swagger.parser.internal.models.SwOpenAPI;
import io.swagger.parser.OpenAPIParser;
import io.swagger.v3.parser.core.models.ParseOptions;

public class ParserAndSerializerWithGsonTckTest extends AbstractSerializerTest {

    @Override
    protected OpenAPI createOpenAPI(String specPath) throws IOException {
        String json = readFromResource(specPath);

        OpenAPIParser openApiParser = new OpenAPIParser();
        ParseOptions options = new ParseOptions();

        io.swagger.v3.oas.models.OpenAPI swaggerOpenAPI = openApiParser.readContents(json, null, options)
                .getOpenAPI();

        return new SwOpenAPI(swaggerOpenAPI);
    }

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
