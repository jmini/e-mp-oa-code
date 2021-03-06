package fr.jmini.empoa.gson.intermal.serializers.callbacks;
import java.lang.reflect.Type;

import org.eclipse.microprofile.openapi.models.callbacks.Callback;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class CallbackSerializer implements JsonSerializer<Callback> {

    @Override
    public JsonElement serialize(Callback src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        if(src.getRef() != null) {
            object.addProperty("$ref", src.getRef());
        } else {
            
            if (!src.isEmpty()) {
                for (java.util.Map.Entry<String, org.eclipse.microprofile.openapi.models.PathItem> entry : src.entrySet()) {
                    object.add(entry.getKey(), context.serialize(entry.getValue()));
                }
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
