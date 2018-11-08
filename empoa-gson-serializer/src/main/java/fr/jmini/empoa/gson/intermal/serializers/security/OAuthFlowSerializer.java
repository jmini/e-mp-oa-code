package fr.jmini.empoa.gson.intermal.serializers.security;
import java.lang.reflect.Type;

import org.eclipse.microprofile.openapi.models.security.OAuthFlow;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class OAuthFlowSerializer implements JsonSerializer<OAuthFlow> {

    @Override
    public JsonElement serialize(OAuthFlow src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        if (src.getAuthorizationUrl() != null) {
            object.add("authorizationUrl", context.serialize(src.getAuthorizationUrl()));
        }
        if (src.getTokenUrl() != null) {
            object.add("tokenUrl", context.serialize(src.getTokenUrl()));
        }
        if (src.getRefreshUrl() != null) {
            object.add("refreshUrl", context.serialize(src.getRefreshUrl()));
        }
        if (src.getScopes() != null) {
            object.add("scopes", context.serialize(src.getScopes()));
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
