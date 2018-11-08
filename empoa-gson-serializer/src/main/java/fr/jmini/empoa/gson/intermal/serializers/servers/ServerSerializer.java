package fr.jmini.empoa.gson.intermal.serializers.servers;
import java.lang.reflect.Type;

import org.eclipse.microprofile.openapi.models.servers.Server;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class ServerSerializer implements JsonSerializer<Server> {

    @Override
    public JsonElement serialize(Server src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        if (src.getUrl() != null) {
            object.add("url", context.serialize(src.getUrl()));
        }
        if (src.getDescription() != null) {
            object.add("description", context.serialize(src.getDescription()));
        }
        if (src.getVariables() != null) {
            object.add("variables", context.serialize(src.getVariables()));
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
