package fr.jmini.empoa.swagger.core.tck;

import java.io.IOException;
import java.util.List;

import org.eclipse.microprofile.openapi.models.OpenAPI;
import org.eclipse.microprofile.openapi.models.parameters.Parameter;
import org.testng.annotations.Test;

import com.google.gson.Gson;

import fr.jmini.empoa.extended.tck.AbstractSerializerTest;
import fr.jmini.empoa.gson.OASGsonSerializer;
import fr.jmini.empoa.swagger.core.internal.SwAdapter;
import io.swagger.parser.OpenAPIParser;
import io.swagger.v3.parser.core.models.ParseOptions;
import io.swagger.v3.parser.core.models.SwaggerParseResult;

public class ParserAndSerializerWithGsonTckTest extends AbstractSerializerTest {

    @Override
    protected OpenAPI createOpenAPI(Specs spec) throws IOException {
        String json = readExpectedFromResource(spec);

        OpenAPIParser openApiParser = new OpenAPIParser();
        ParseOptions options = new ParseOptions();

        SwaggerParseResult parserResult = openApiParser.readContents(json, null, options);

        // tag::usage[]
        io.swagger.v3.oas.models.OpenAPI swaggerOpenAPI = parserResult.getOpenAPI();
        OpenAPI openAPI = SwAdapter.toOpenAPI(swaggerOpenAPI);
        // end::usage[]

        // Swagger-Parser is adding some values (probably some default that make sense) that are not desirable for this test:
        if (Specs.HELLO == spec) {
            List<Parameter> parameters = openAPI.getPaths()
                    .getPathItem("/hello/{name}")
                    .getGET()
                    .getParameters();
            Parameter nameParameter = parameters.get(0);
            nameParameter.setExplode(null);
            nameParameter.setStyle(null);
            Parameter languageParameter = parameters.get(1);
            languageParameter.setExplode(null);
            languageParameter.setRequired(null);
            languageParameter.setStyle(null);
        }
        return openAPI;
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
