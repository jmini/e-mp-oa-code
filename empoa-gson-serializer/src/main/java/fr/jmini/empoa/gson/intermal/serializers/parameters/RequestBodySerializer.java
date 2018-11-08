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
        if(src.getRef() != null) {
            object.addProperty("$ref", src.getRef());
        } else {
            
            if (src.getDescription() != null) {
                object.add("description", context.serialize(src.getDescription()));
            }
            if (src.getContent() != null) {
                object.add("content", context.serialize(src.getContent()));
            }
            if (src.getRequired() != null) {
                object.add("required", context.serialize(src.getRequired()));
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
