package fr.jmini.empoa.gson.intermal.serializers.security;
import java.lang.reflect.Type;

import org.eclipse.microprofile.openapi.models.security.Scopes;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class ScopesSerializer implements JsonSerializer<Scopes> {

    @Override
    public JsonElement serialize(Scopes src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        if (!src.isEmpty()) {
            for (java.util.Map.Entry<String, String> entry : src.entrySet()) {
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
