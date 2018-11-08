package fr.jmini.empoa.gson.intermal.serializers.info;
import java.lang.reflect.Type;

import org.eclipse.microprofile.openapi.models.info.Contact;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class ContactSerializer implements JsonSerializer<Contact> {

    @Override
    public JsonElement serialize(Contact src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        if (src.getName() != null) {
            object.add("name", context.serialize(src.getName()));
        }
        if (src.getUrl() != null) {
            object.add("url", context.serialize(src.getUrl()));
        }
        if (src.getEmail() != null) {
            object.add("email", context.serialize(src.getEmail()));
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
