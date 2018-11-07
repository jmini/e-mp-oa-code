package fr.jmini.empoa.gson.intermal.serializers.headers;
import java.lang.reflect.Type;

import org.eclipse.microprofile.openapi.models.headers.Header;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class HeaderSerializer implements JsonSerializer<Header> {

    @Override
    public JsonElement serialize(Header src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        return object;
    }

}
