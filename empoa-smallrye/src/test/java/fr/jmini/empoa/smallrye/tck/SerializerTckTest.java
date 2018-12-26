package fr.jmini.empoa.smallrye.tck;

import java.io.IOException;

import org.eclipse.microprofile.openapi.models.OpenAPI;

import fr.jmini.empoa.extended.tck.AbstractSerializerTest;
import io.smallrye.openapi.runtime.io.OpenApiSerializer;
import io.smallrye.openapi.runtime.io.OpenApiSerializer.Format;

public class SerializerTckTest extends AbstractSerializerTest {

    @Override
    protected String convertToJson(OpenAPI openAPI) throws IOException {
        return OpenApiSerializer.serialize(openAPI, Format.JSON);
    }
}
