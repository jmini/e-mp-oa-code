package fr.jmini.empoa.gson.intermal.serializers.responses;
import java.lang.reflect.Type;

import org.eclipse.microprofile.openapi.models.responses.APIResponses;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class APIResponsesSerializer implements JsonSerializer<APIResponses> {

    @Override
    public JsonElement serialize(APIResponses src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        return object;
    }

}
