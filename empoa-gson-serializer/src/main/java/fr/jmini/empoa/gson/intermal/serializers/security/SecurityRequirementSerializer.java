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
        return object;
    }

}
