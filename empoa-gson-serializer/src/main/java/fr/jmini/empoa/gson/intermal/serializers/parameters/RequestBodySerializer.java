package fr.jmini.empoa.gson.intermal.serializers.parameters;
import java.lang.reflect.Type;

import org.eclipse.microprofile.openapi.models.parameters.RequestBody;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class RequestBodySerializer implements JsonSerializer<RequestBody> {

    @Override
    public JsonElement serialize(RequestBody src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        return object;
    }

}
