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
        return object;
    }

}
