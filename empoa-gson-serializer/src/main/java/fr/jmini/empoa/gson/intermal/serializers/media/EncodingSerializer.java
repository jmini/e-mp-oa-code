package fr.jmini.empoa.gson.intermal.serializers.media;
import java.lang.reflect.Type;

import org.eclipse.microprofile.openapi.models.media.Encoding;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class EncodingSerializer implements JsonSerializer<Encoding> {

    @Override
    public JsonElement serialize(Encoding src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        if (src.getContentType() != null) {
            object.add("contentType", context.serialize(src.getContentType()));
        }
        if (src.getHeaders() != null) {
            object.add("headers", context.serialize(src.getHeaders()));
        }
        if (src.getStyle() != null) {
            object.add("style", context.serialize(src.getStyle()));
        }
        if (src.getExplode() != null) {
            object.add("explode", context.serialize(src.getExplode()));
        }
        if (src.getAllowReserved() != null) {
            object.add("allowReserved", context.serialize(src.getAllowReserved()));
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
