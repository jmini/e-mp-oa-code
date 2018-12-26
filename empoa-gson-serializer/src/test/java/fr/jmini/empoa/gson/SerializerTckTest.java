package fr.jmini.empoa.gson;

import org.eclipse.microprofile.openapi.models.OpenAPI;

import com.google.gson.Gson;

import fr.jmini.empoa.extended.tck.AbstractSerializerTest;

public class SerializerTckTest extends AbstractSerializerTest {

    @Override
    protected String convertToJson(OpenAPI openAPI) {
        Gson gson = OASGsonSerializer.instance();
        return gson.toJson(openAPI);
    }
}
