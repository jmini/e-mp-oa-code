package fr.jmini.empoa.swagger.parser.internal.models.media;

import org.eclipse.microprofile.openapi.models.media.Content;

public class SwContent implements Content {

    private io.swagger.v3.oas.models.media.Content swContent;

    public SwContent() {
        swContent = new io.swagger.v3.oas.models.media.Content();
    }

    public SwContent(io.swagger.v3.oas.models.media.Content swContent) {
        this.swContent = swContent;
    }

    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.media.MediaType> getMediaTypes() {
        java.util.Map<String, org.eclipse.microprofile.openapi.models.media.MediaType> result = swContent.getMediaTypes();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setMediaTypes(java.util.Map<String, org.eclipse.microprofile.openapi.models.media.MediaType> mediaTypes) {
        swContent.setMediaTypes(null);
        if (mediaTypes != null) {
            for (java.util.Map.Entry<String, org.eclipse.microprofile.openapi.models.media.MediaType> e : mediaTypes.entrySet()) {
                this.addMediaType(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Content addMediaType(String key, org.eclipse.microprofile.openapi.models.media.MediaType mediaType) {
        swContent.addMediaType(key, mediaType);
        return this;
    }

    @Override
    public void removeMediaType(String key) {
    }

}
