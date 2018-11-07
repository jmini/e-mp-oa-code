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
        return object;
    }

}
