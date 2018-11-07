package fr.jmini.empoa.gson.intermal.serializers.responses;
import java.lang.reflect.Type;

import org.eclipse.microprofile.openapi.models.responses.APIResponse;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class APIResponseSerializer implements JsonSerializer<APIResponse> {

    @Override
    public JsonElement serialize(APIResponse src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        return object;
    }

}
