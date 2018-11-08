package fr.jmini.empoa.gson.intermal.serializers.security;
import java.lang.reflect.Type;

import org.eclipse.microprofile.openapi.models.security.OAuthFlows;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class OAuthFlowsSerializer implements JsonSerializer<OAuthFlows> {

    @Override
    public JsonElement serialize(OAuthFlows src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        if (src.getImplicit() != null) {
            object.add("implicit", context.serialize(src.getImplicit()));
        }
        if (src.getPassword() != null) {
            object.add("password", context.serialize(src.getPassword()));
        }
        if (src.getClientCredentials() != null) {
            object.add("clientCredentials", context.serialize(src.getClientCredentials()));
        }
        if (src.getAuthorizationCode() != null) {
            object.add("authorizationCode", context.serialize(src.getAuthorizationCode()));
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
