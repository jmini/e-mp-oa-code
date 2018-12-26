package fr.jmini.empoa.swagger.parser.tck;

import static org.assertj.core.api.Assertions.*;

import java.io.IOException;

import org.eclipse.microprofile.openapi.models.OpenAPI;

import fr.jmini.empoa.extended.tck.AbstractSerializerTest;
import fr.jmini.empoa.swagger.parser.internal.models.SwOpenAPI;

public class SerializerWithSwaggerTckTest extends AbstractSerializerTest {

    @Override
    protected String convertToJson(OpenAPI openAPI) throws IOException {
        assertThat(openAPI).isInstanceOf(SwOpenAPI.class);
        io.swagger.v3.oas.models.OpenAPI swaggerOpenAPI = ((SwOpenAPI) openAPI).getSw();

        return io.swagger.v3.core.util.Json.mapper()
                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(swaggerOpenAPI);
    }
}
