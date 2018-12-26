package fr.jmini.empoa.swagger.parser.tck;

import org.eclipse.microprofile.openapi.models.OpenAPI;

import com.google.gson.Gson;

import fr.jmini.empoa.extended.tck.AbstractSerializerTest;
import fr.jmini.empoa.gson.OASGsonSerializer;

public class SerializerWithGsonTckTest extends AbstractSerializerTest {

    @Override
    protected String convertToJson(OpenAPI openAPI) {
        Gson gson = OASGsonSerializer.instance();
        return gson.toJson(openAPI);
    }
}
