package fr.jmini.empoa.gson.intermal.serializers.media;
import java.lang.reflect.Type;

import org.eclipse.microprofile.openapi.models.media.Discriminator;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class DiscriminatorSerializer implements JsonSerializer<Discriminator> {

    @Override
    public JsonElement serialize(Discriminator src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        return object;
    }

}
