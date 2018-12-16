package fr.jmini.empoa.simple.internal.models.media;

import org.eclipse.microprofile.openapi.models.media.Content;

public class ContentImpl extends java.util.LinkedHashMap<String, org.eclipse.microprofile.openapi.models.media.MediaType> implements Content {
    private static final long serialVersionUID = 1L;

    @Override
    public Content addMediaType(String key, org.eclipse.microprofile.openapi.models.media.MediaType mediaType) {
        this.put(key, mediaType);
        return this;
    }

}
