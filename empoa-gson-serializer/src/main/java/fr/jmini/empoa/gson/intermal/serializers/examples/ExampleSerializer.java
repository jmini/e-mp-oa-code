package fr.jmini.empoa.gson.intermal.serializers.examples;
import java.lang.reflect.Type;

import org.eclipse.microprofile.openapi.models.examples.Example;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class ExampleSerializer implements JsonSerializer<Example> {

    @Override
    public JsonElement serialize(Example src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        if(src.getRef() != null) {
            object.addProperty("$ref", src.getRef());
        } else {
            
            if (src.getSummary() != null) {
                object.add("summary", context.serialize(src.getSummary()));
            }
            if (src.getDescription() != null) {
                object.add("description", context.serialize(src.getDescription()));
            }
            if (src.getValue() != null) {
                object.add("value", context.serialize(src.getValue()));
            }
            if (src.getExternalValue() != null) {
                object.add("externalValue", context.serialize(src.getExternalValue()));
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
