package fr.jmini.empoa.gson.intermal.serializers.callbacks;
import java.lang.reflect.Type;

import org.eclipse.microprofile.openapi.models.callbacks.Callback;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class CallbackSerializer implements JsonSerializer<Callback> {

    @Override
    public JsonElement serialize(Callback src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        return object;
    }

}
