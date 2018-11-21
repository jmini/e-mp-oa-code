package fr.jmini.empoa.gson.intermal.serializers.security;
import java.lang.reflect.Type;

import org.eclipse.microprofile.openapi.models.security.SecurityRequirement;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class SecurityRequirementSerializer implements JsonSerializer<SecurityRequirement> {

    @Override
    public JsonElement serialize(SecurityRequirement src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        if (!src.getSchemes().isEmpty()) {
            for (java.util.Map.Entry<String, java.util.List<String>> entry : src.getSchemes().entrySet()) {
                object.add(entry.getKey(), context.serialize(entry.getValue()));
            }
        }
        return object;
    }

}
