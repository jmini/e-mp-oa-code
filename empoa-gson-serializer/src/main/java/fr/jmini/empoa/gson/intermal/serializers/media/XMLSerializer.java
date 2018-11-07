package fr.jmini.empoa.gson.intermal.serializers.media;
import java.lang.reflect.Type;

import org.eclipse.microprofile.openapi.models.media.XML;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class XMLSerializer implements JsonSerializer<XML> {

    @Override
    public JsonElement serialize(XML src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        return object;
    }

}
