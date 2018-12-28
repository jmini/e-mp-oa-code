package fr.jmini.empoa.gson.intermal.serializers.parameters;
import java.lang.reflect.Type;

import org.eclipse.microprofile.openapi.models.parameters.Parameter;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class ParameterSerializer implements JsonSerializer<Parameter> {

    @Override
    public JsonElement serialize(Parameter src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        if(src.getRef() != null) {
            object.addProperty("$ref", src.getRef());
        } else {
            
            if (src.getName() != null) {
                object.add("name", context.serialize(src.getName()));
            }
            if (src.getIn() != null) {
                object.add("in", context.serialize(src.getIn().toString()));
            }
            if (src.getDescription() != null) {
                object.add("description", context.serialize(src.getDescription()));
            }
            if (src.getRequired() != null) {
                object.add("required", context.serialize(src.getRequired()));
            }
            if (src.getDeprecated() != null) {
                object.add("deprecated", context.serialize(src.getDeprecated()));
            }
            if (src.getAllowEmptyValue() != null) {
                object.add("allowEmptyValue", context.serialize(src.getAllowEmptyValue()));
            }
            if (src.getStyle() != null) {
                object.add("style", context.serialize(src.getStyle().toString()));
            }
            if (src.getExplode() != null) {
                object.add("explode", context.serialize(src.getExplode()));
            }
            if (src.getAllowReserved() != null) {
                object.add("allowReserved", context.serialize(src.getAllowReserved()));
            }
            if (src.getSchema() != null) {
                object.add("schema", context.serialize(src.getSchema()));
            }
            if (src.getExamples() != null) {
                object.add("examples", context.serialize(src.getExamples()));
            }
            if (src.getExample() != null) {
                object.add("example", context.serialize(src.getExample()));
            }
            if (src.getContent() != null) {
                object.add("content", context.serialize(src.getContent()));
            }
            if (src.getExtensions() != null) {
                for (java.util.Map.Entry<String, Object> extension : src.getExtensions()
                        .entrySet()) {
                    object.add(extension.getKey(), context.serialize(extension.getValue()));
                }
            }
        }
        return object;
    }

}
