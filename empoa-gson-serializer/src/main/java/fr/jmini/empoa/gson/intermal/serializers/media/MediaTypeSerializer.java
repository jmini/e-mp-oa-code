package fr.jmini.empoa.gson.intermal.serializers.media;
import java.lang.reflect.Type;

import org.eclipse.microprofile.openapi.models.media.MediaType;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class MediaTypeSerializer implements JsonSerializer<MediaType> {

    @Override
    public JsonElement serialize(MediaType src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        if (src.getSchema() != null) {
            object.add("schema", context.serialize(src.getSchema()));
        }
        if (src.getExamples() != null) {
            object.add("examples", context.serialize(src.getExamples()));
        }
        if (src.getExample() != null) {
            object.add("example", context.serialize(src.getExample()));
        }
        if (src.getEncoding() != null) {
            object.add("encoding", context.serialize(src.getEncoding()));
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
