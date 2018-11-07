package fr.jmini.empoa.gson.intermal.serializers.links;
import java.lang.reflect.Type;

import org.eclipse.microprofile.openapi.models.links.Link;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class LinkSerializer implements JsonSerializer<Link> {

    @Override
    public JsonElement serialize(Link src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        return object;
    }

}
