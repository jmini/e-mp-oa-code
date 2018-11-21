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
        if(src.getRef() != null) {
            object.addProperty("$ref", src.getRef());
        } else {
            
            if (src.getDescription() != null) {
                object.add("description", context.serialize(src.getDescription()));
            }
            if (src.getHeaders() != null) {
                object.add("headers", context.serialize(src.getHeaders()));
            }
            if (src.getContent() != null) {
                object.add("content", context.serialize(src.getContent()));
            }
            if (src.getLinks() != null) {
                object.add("links", context.serialize(src.getLinks()));
            }
            if (src.getExtensions() != null) {
                for (java.util.Map.Entry<String, Object> extension : src.getExtensions()
                        .entrySet()) {
                    object.add(extension.getKey(), context.serialize(extension.getValue()));
                }
            }
        }
        return object;
    }

}
