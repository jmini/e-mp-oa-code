package fr.jmini.empoa.gson.intermal.serializers.tags;
import java.lang.reflect.Type;

import org.eclipse.microprofile.openapi.models.tags.Tag;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class TagSerializer implements JsonSerializer<Tag> {

    @Override
    public JsonElement serialize(Tag src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        return object;
    }

}
