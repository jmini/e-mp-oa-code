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
        return object;
    }

}
