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
        return object;
    }

}
