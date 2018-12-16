package fr.jmini.empoa.simple.internal.models.media;

import org.eclipse.microprofile.openapi.models.media.Content;

public class ContentImpl extends java.util.LinkedHashMap<String, org.eclipse.microprofile.openapi.models.media.MediaType> implements Content {
    private static final long serialVersionUID = 1L;

    @Override
    public Content addMediaType(String key, org.eclipse.microprofile.openapi.models.media.MediaType mediaType) {
        this.put(key, mediaType);
        return this;
    }

    @Override
    public void removeMediaType(String key) {
        this.remove(key);
    }

    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.media.MediaType> getMediaTypes() {
        return java.util.Collections.unmodifiableMap(this);
    }

    @Override
    public void setMediaTypes(java.util.Map<String, org.eclipse.microprofile.openapi.models.media.MediaType> items) {
        this.clear();
        if (items != null) {
            items.entrySet()
                    .stream()
                    .forEach(e -> this.put(e.getKey(), e.getValue()));
        }
    }

    @Override
    public boolean hasMediaType(String key) {
        return this.containsKey(key);
    }

    @Override
    public org.eclipse.microprofile.openapi.models.media.MediaType getMediaType(String key) {
        return this.get(key);
    }

}
