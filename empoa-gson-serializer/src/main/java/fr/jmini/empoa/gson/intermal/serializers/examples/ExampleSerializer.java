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
        return object;
    }

}
