package fr.jmini.empoa.gson.intermal.serializers.info;

import java.lang.reflect.Type;

import org.eclipse.microprofile.openapi.models.info.Info;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class InfoSerializer implements JsonSerializer<Info> {

    @Override
    public JsonElement serialize(Info src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        object.addProperty("title", src.getTitle());
        return object;
    }

}
