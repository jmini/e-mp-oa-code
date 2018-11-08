package fr.jmini.empoa.gson.intermal.serializers;
import java.lang.reflect.Type;

import org.eclipse.microprofile.openapi.models.Operation;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class OperationSerializer implements JsonSerializer<Operation> {

    @Override
    public JsonElement serialize(Operation src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        if (src.getTags() != null) {
            object.add("tags", context.serialize(src.getTags()));
        }
        if (src.getSummary() != null) {
            object.add("summary", context.serialize(src.getSummary()));
        }
        if (src.getDescription() != null) {
            object.add("description", context.serialize(src.getDescription()));
        }
        if (src.getExternalDocs() != null) {
            object.add("externalDocs", context.serialize(src.getExternalDocs()));
        }
        if (src.getOperationId() != null) {
            object.add("operationId", context.serialize(src.getOperationId()));
        }
        if (src.getParameters() != null) {
            object.add("parameters", context.serialize(src.getParameters()));
        }
        if (src.getRequestBody() != null) {
            object.add("requestBody", context.serialize(src.getRequestBody()));
        }
        if (src.getResponses() != null) {
            object.add("responses", context.serialize(src.getResponses()));
        }
        if (src.getCallbacks() != null) {
            object.add("callbacks", context.serialize(src.getCallbacks()));
        }
        if (src.getDeprecated() != null) {
            object.add("deprecated", context.serialize(src.getDeprecated()));
        }
        if (src.getSecurity() != null) {
            object.add("security", context.serialize(src.getSecurity()));
        }
        if (src.getServers() != null) {
            object.add("servers", context.serialize(src.getServers()));
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
