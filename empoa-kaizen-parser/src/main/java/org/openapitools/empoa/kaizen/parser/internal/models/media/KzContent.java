package org.openapitools.empoa.kaizen.parser.internal.models.media;

import org.eclipse.microprofile.openapi.models.media.Content;

public class KzContent implements Content {

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
        if (mediaType == null) {
            throw new IllegalArgumentException("Null value for key '" + key + "' is not allowed");
        } else {
            if (_mediaTypes == null) {
                _mediaTypes = new java.util.LinkedHashMap<>();
            }
            _mediaTypes.put(key, mediaType);
        }
        return this;
    }

    @Override
    public void removeMediaType(String key) {
        if (_mediaTypes != null) {
            _mediaTypes.remove(key);
        }
    }

}
