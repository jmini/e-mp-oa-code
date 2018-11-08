package fr.jmini.empoa.gson.intermal.serializers;
import java.lang.reflect.Type;

import org.eclipse.microprofile.openapi.models.OpenAPI;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class OpenAPISerializer implements JsonSerializer<OpenAPI> {

    @Override
    public JsonElement serialize(OpenAPI src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        if (src.getOpenapi() != null) {
            object.add("openapi", context.serialize(src.getOpenapi()));
        }
        if (src.getInfo() != null) {
            object.add("info", context.serialize(src.getInfo()));
        }
        if (src.getExternalDocs() != null) {
            object.add("externalDocs", context.serialize(src.getExternalDocs()));
        }
        if (src.getServers() != null) {
            object.add("servers", context.serialize(src.getServers()));
        }
        if (src.getSecurity() != null) {
            object.add("security", context.serialize(src.getSecurity()));
        }
        if (src.getTags() != null) {
            object.add("tags", context.serialize(src.getTags()));
        }
        if (src.getPaths() != null) {
            object.add("paths", context.serialize(src.getPaths()));
        }
        if (src.getComponents() != null) {
            object.add("components", context.serialize(src.getComponents()));
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
