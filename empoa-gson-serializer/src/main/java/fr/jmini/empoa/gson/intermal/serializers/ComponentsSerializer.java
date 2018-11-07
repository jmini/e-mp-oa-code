package fr.jmini.empoa.gson.intermal.serializers;
import java.lang.reflect.Type;

import org.eclipse.microprofile.openapi.models.Components;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class ComponentsSerializer implements JsonSerializer<Components> {

    @Override
    public JsonElement serialize(Components src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        return object;
    }

}
