package fr.jmini.empoa.simple.internal.models.media;

import org.eclipse.microprofile.openapi.models.media.Content;

public class ContentImpl implements Content {

    private java.util.Map<String, org.eclipse.microprofile.openapi.models.media.MediaType> _mediaTypes;

    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.media.MediaType> getMediaTypes() {
        if (_mediaTypes == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(_mediaTypes);
    }

    @Override
    public void setMediaTypes(java.util.Map<String, org.eclipse.microprofile.openapi.models.media.MediaType> mediaTypes) {
        if (mediaTypes == null) {
            _mediaTypes = null;
        } else {
            _mediaTypes = new java.util.LinkedHashMap<>();
            _mediaTypes.putAll(mediaTypes);
        }
    }

    @Override
    public Content addMediaType(String key, org.eclipse.microprofile.openapi.models.media.MediaType mediaType) {
        if (_mediaTypes == null) {
            _mediaTypes = new java.util.LinkedHashMap<>();
        }
        _mediaTypes.put(key, mediaType);
        return this;
    }

    @Override
    public void removeMediaType(String key) {
        if (_mediaTypes != null) {
            _mediaTypes.remove(key);
        }
    }

}
