package fr.jmini.empoa.gson.intermal.serializers;
import java.lang.reflect.Type;

import org.eclipse.microprofile.openapi.models.ExternalDocumentation;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class ExternalDocumentationSerializer implements JsonSerializer<ExternalDocumentation> {

    @Override
    public JsonElement serialize(ExternalDocumentation src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        if (src.getDescription() != null) {
            object.add("description", context.serialize(src.getDescription()));
        }
        if (src.getUrl() != null) {
            object.add("url", context.serialize(src.getUrl()));
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
