package fr.jmini.empoa.swagger.parser.internal.models.media;

import org.eclipse.microprofile.openapi.models.media.Content;

public class SwContent implements Content {

    private io.swagger.v3.oas.models.media.Content _swContent;

    public SwContent() {
        _swContent = new io.swagger.v3.oas.models.media.Content();
    }

    public SwContent(io.swagger.v3.oas.models.media.Content _swContent) {
        this._swContent = _swContent;
    }

    public io.swagger.v3.oas.models.media.Content getSw() {
        return _swContent;
    }

    private java.util.Map<String, fr.jmini.empoa.swagger.parser.internal.models.media.SwMediaType> _mediaTypes;

    private void initMediaTypes() {
        if (_swContent == null) {
            _mediaTypes = null;
        } else if (_mediaTypes == null) {
            _mediaTypes = _swContent
                    .entrySet()
                    .stream()
                    .collect(java.util.stream.Collectors.toMap(
                            java.util.Map.Entry::getKey,
                            e -> new fr.jmini.empoa.swagger.parser.internal.models.media.SwMediaType(e.getValue()),
                            (k1, k2) -> {
                                throw new IllegalStateException(String.format("Duplicate key %s", k1));
                            },
                            () -> new java.util.LinkedHashMap<String, fr.jmini.empoa.swagger.parser.internal.models.media.SwMediaType>()));
        }
    }

    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.media.MediaType> getMediaTypes() {
        initMediaTypes();
        if (_mediaTypes == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(_mediaTypes);
    }

    @Override
    public void setMediaTypes(java.util.Map<String, org.eclipse.microprofile.openapi.models.media.MediaType> mediaTypes) {
        _swContent.clear();
        if (mediaTypes != null) {
            if (mediaTypes.isEmpty()) {
            } else {
                for (java.util.Map.Entry<String, org.eclipse.microprofile.openapi.models.media.MediaType> e : mediaTypes.entrySet()) {
                    this.addMediaType(e.getKey(), e.getValue());
                }
            }
        }
    }

    @Override
    public Content addMediaType(String key, org.eclipse.microprofile.openapi.models.media.MediaType mediaType) {
        if (!(mediaType instanceof fr.jmini.empoa.swagger.parser.internal.models.media.SwMediaType)) {
            throw new IllegalArgumentException("Unexpected type: " + mediaType);
        }
        fr.jmini.empoa.swagger.parser.internal.models.media.SwMediaType value = (fr.jmini.empoa.swagger.parser.internal.models.media.SwMediaType) mediaType;
        initMediaTypes();
        if (_mediaTypes == null) {
            _mediaTypes = new java.util.LinkedHashMap<>();
        }
        _mediaTypes.put(key, value);
        _swContent.put(key, value.getSw());
        return this;
    }

    @Override
    public void removeMediaType(String key) {
        initMediaTypes();
        if (_mediaTypes != null) {
            _mediaTypes.remove(key);
            _swContent.remove(key);
        }
    }

}
