package fr.jmini.empoa.gson.intermal.serializers;

import java.lang.reflect.Type;

import org.eclipse.microprofile.openapi.models.OpenAPI;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class OpenAPISerializer implements JsonSerializer<OpenAPI> {

    @Override
    public JsonElement serialize(OpenAPI src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        object.addProperty("openapi", src.getOpenapi());
        object.add("info", context.serialize(src.getInfo()));
        return object;
    }

}
