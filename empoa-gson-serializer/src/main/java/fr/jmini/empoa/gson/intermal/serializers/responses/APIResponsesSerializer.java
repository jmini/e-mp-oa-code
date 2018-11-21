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
        if (!src.getAPIResponses().isEmpty()) {
            for (java.util.Map.Entry<String, org.eclipse.microprofile.openapi.models.responses.APIResponse> entry : src.getAPIResponses().entrySet()) {
                object.add(entry.getKey(), context.serialize(entry.getValue()));
            }
        }
        if (src.getExtensions() != null) {
            for (java.util.Map.Entry<String, Object> extension : src.getExtensions()
                    .entrySet()) {
                object.add(extension.getKey(), context.serialize(extension.getValue()));
            }
        }
        return object;
    }

}
