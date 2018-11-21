package fr.jmini.empoa.gson.intermal.serializers.media;
import java.lang.reflect.Type;

import org.eclipse.microprofile.openapi.models.media.XML;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class XMLSerializer implements JsonSerializer<XML> {

    @Override
    public JsonElement serialize(XML src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        if (src.getName() != null) {
            object.add("name", context.serialize(src.getName()));
        }
        if (src.getNamespace() != null) {
            object.add("namespace", context.serialize(src.getNamespace()));
        }
        if (src.getPrefix() != null) {
            object.add("prefix", context.serialize(src.getPrefix()));
        }
        if (src.getAttribute() != null) {
            object.add("attribute", context.serialize(src.getAttribute()));
        }
        if (src.getWrapped() != null) {
            object.add("wrapped", context.serialize(src.getWrapped()));
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
