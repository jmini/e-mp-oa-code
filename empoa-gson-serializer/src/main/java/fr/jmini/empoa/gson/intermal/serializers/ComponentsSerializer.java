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
        if (src.getSchemas() != null) {
            object.add("schemas", context.serialize(src.getSchemas()));
        }
        if (src.getResponses() != null) {
            object.add("responses", context.serialize(src.getResponses()));
        }
        if (src.getParameters() != null) {
            object.add("parameters", context.serialize(src.getParameters()));
        }
        if (src.getExamples() != null) {
            object.add("examples", context.serialize(src.getExamples()));
        }
        if (src.getRequestBodies() != null) {
            object.add("requestBodies", context.serialize(src.getRequestBodies()));
        }
        if (src.getHeaders() != null) {
            object.add("headers", context.serialize(src.getHeaders()));
        }
        if (src.getSecuritySchemes() != null) {
            object.add("securitySchemes", context.serialize(src.getSecuritySchemes()));
        }
        if (src.getLinks() != null) {
            object.add("links", context.serialize(src.getLinks()));
        }
        if (src.getCallbacks() != null) {
            object.add("callbacks", context.serialize(src.getCallbacks()));
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
