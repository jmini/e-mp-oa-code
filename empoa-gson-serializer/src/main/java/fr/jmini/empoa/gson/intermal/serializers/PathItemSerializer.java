package fr.jmini.empoa.gson.intermal.serializers;
import java.lang.reflect.Type;

import org.eclipse.microprofile.openapi.models.PathItem;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class PathItemSerializer implements JsonSerializer<PathItem> {

    @Override
    public JsonElement serialize(PathItem src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        if(src.getRef() != null) {
            object.addProperty("$ref", src.getRef());
        } else {
            
            if (src.getSummary() != null) {
                object.add("summary", context.serialize(src.getSummary()));
            }
            if (src.getDescription() != null) {
                object.add("description", context.serialize(src.getDescription()));
            }
            if (src.getGET() != null) {
                object.add("gET", context.serialize(src.getGET()));
            }
            if (src.getPUT() != null) {
                object.add("pUT", context.serialize(src.getPUT()));
            }
            if (src.getPOST() != null) {
                object.add("pOST", context.serialize(src.getPOST()));
            }
            if (src.getDELETE() != null) {
                object.add("dELETE", context.serialize(src.getDELETE()));
            }
            if (src.getOPTIONS() != null) {
                object.add("oPTIONS", context.serialize(src.getOPTIONS()));
            }
            if (src.getHEAD() != null) {
                object.add("hEAD", context.serialize(src.getHEAD()));
            }
            if (src.getPATCH() != null) {
                object.add("pATCH", context.serialize(src.getPATCH()));
            }
            if (src.getTRACE() != null) {
                object.add("tRACE", context.serialize(src.getTRACE()));
            }
            if (src.getServers() != null) {
                object.add("servers", context.serialize(src.getServers()));
            }
            if (src.getParameters() != null) {
                object.add("parameters", context.serialize(src.getParameters()));
            }
            if (src.getExtensions() != null) {
                for (java.util.Map.Entry<String, Object> extension : src.getExtensions()
                        .entrySet()) {
                    object.add(extension.getKey(), context.serialize(extension.getValue()));
                }
            }
        }
        return object;
    }

}
