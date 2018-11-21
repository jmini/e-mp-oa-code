package fr.jmini.empoa.gson.intermal.serializers.info;
import java.lang.reflect.Type;

import org.eclipse.microprofile.openapi.models.info.Info;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class InfoSerializer implements JsonSerializer<Info> {

    @Override
    public JsonElement serialize(Info src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        if (src.getTitle() != null) {
            object.add("title", context.serialize(src.getTitle()));
        }
        if (src.getDescription() != null) {
            object.add("description", context.serialize(src.getDescription()));
        }
        if (src.getTermsOfService() != null) {
            object.add("termsOfService", context.serialize(src.getTermsOfService()));
        }
        if (src.getContact() != null) {
            object.add("contact", context.serialize(src.getContact()));
        }
        if (src.getLicense() != null) {
            object.add("license", context.serialize(src.getLicense()));
        }
        if (src.getVersion() != null) {
            object.add("version", context.serialize(src.getVersion()));
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
