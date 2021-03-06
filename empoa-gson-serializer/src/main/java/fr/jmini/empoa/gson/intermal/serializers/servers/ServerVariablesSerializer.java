package fr.jmini.empoa.gson.intermal.serializers.servers;
import java.lang.reflect.Type;

import org.eclipse.microprofile.openapi.models.servers.ServerVariables;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class ServerVariablesSerializer implements JsonSerializer<ServerVariables> {

    @Override
    public JsonElement serialize(ServerVariables src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        if (!src.isEmpty()) {
            for (java.util.Map.Entry<String, org.eclipse.microprofile.openapi.models.servers.ServerVariable> entry : src.entrySet()) {
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
