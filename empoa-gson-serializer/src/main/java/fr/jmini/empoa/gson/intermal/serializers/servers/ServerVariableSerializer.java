package fr.jmini.empoa.gson.intermal.serializers.servers;
import java.lang.reflect.Type;

import org.eclipse.microprofile.openapi.models.servers.ServerVariable;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class ServerVariableSerializer implements JsonSerializer<ServerVariable> {

    @Override
    public JsonElement serialize(ServerVariable src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        if (src.getEnumeration() != null) {
            object.add("enumeration", context.serialize(src.getEnumeration()));
        }
        if (src.getDefaultValue() != null) {
            object.add("defaultValue", context.serialize(src.getDefaultValue()));
        }
        if (src.getDescription() != null) {
            object.add("description", context.serialize(src.getDescription()));
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
