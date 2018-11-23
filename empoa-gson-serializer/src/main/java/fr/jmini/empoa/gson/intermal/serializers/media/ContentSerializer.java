package fr.jmini.empoa.gson.intermal.serializers.media;
import java.lang.reflect.Type;

import org.eclipse.microprofile.openapi.models.media.Content;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class ContentSerializer implements JsonSerializer<Content> {

    @Override
    public JsonElement serialize(Content src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        if (!src.getMediaTypes().isEmpty()) {
            for (java.util.Map.Entry<String, org.eclipse.microprofile.openapi.models.media.MediaType> entry : src.getMediaTypes().entrySet()) {
                object.add(entry.getKey(), context.serialize(entry.getValue()));
            }
        }
        return object;
    }

}
