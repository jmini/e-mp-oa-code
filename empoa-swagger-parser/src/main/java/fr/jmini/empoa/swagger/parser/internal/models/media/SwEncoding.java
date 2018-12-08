package fr.jmini.empoa.swagger.parser.internal.models.media;

import org.eclipse.microprofile.openapi.models.media.Encoding;

public class SwEncoding implements Encoding {

    private io.swagger.v3.oas.models.media.Encoding _swEncoding;

    public SwEncoding() {
        _swEncoding = new io.swagger.v3.oas.models.media.Encoding();
    }

    public SwEncoding(io.swagger.v3.oas.models.media.Encoding _swEncoding) {
        this._swEncoding = _swEncoding;
    }

    public io.swagger.v3.oas.models.media.Encoding getSw() {
        return _swEncoding;
    }

    @Override
    public java.util.Map<String, Object> getExtensions() {
        java.util.Map<String, Object> result = _swEncoding.getExtensions();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        _swEncoding.setExtensions(null);
        if (extensions != null) {
            for (java.util.Map.Entry<String, Object> e : extensions.entrySet()) {
                this.addExtension(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Encoding addExtension(String key, Object object) {
        _swEncoding.addExtension(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
        if (getExtensions() != null) {
            _swEncoding.getExtensions().remove(key);
        }
    }

    @Override
    public String getContentType() {
        return _swEncoding.getContentType();
    }

    @Override
    public void setContentType(String contentType) {
        _swEncoding.setContentType(contentType);
    }

    private java.util.Map<String,fr.jmini.empoa.swagger.parser.internal.models.headers.SwHeader> _headers;

    private void initHeaders() {
        if (_swEncoding.getHeaders() == null) {
            _headers = null;
        } else {
            _swEncoding.getHeaders()
                    .entrySet()
                    .stream()
                    .collect(java.util.stream.Collectors.toMap(
                        java.util.Map.Entry::getKey,
                        e -> new fr.jmini.empoa.swagger.parser.internal.models.headers.SwHeader(e.getValue()),
                        (k1, k2) -> { throw new IllegalStateException(String.format("Duplicate key %s", k1)); },
                        () -> new java.util.LinkedHashMap()));
        }
    }
    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.headers.Header> getHeaders() {
        initHeaders();
        if (_headers == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(_headers);
    }

    @Override
    public void setHeaders(java.util.Map<String, org.eclipse.microprofile.openapi.models.headers.Header> headers) {
        _swEncoding.setHeaders(null);
        if (headers != null) {
            for (java.util.Map.Entry<String, org.eclipse.microprofile.openapi.models.headers.Header> e : headers.entrySet()) {
                this.addHeader(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Encoding addHeader(String key, org.eclipse.microprofile.openapi.models.headers.Header header) {
        if (!(header instanceof fr.jmini.empoa.swagger.parser.internal.models.headers.SwHeader)) {
            throw new IllegalArgumentException("Unexpected type: " + header);
        }
        fr.jmini.empoa.swagger.parser.internal.models.headers.SwHeader value = (fr.jmini.empoa.swagger.parser.internal.models.headers.SwHeader) header;
        initHeaders();
        if (_headers == null) {
            _headers = new java.util.LinkedHashMap<>();
        _swEncoding.setHeaders(new java.util.LinkedHashMap<>());
        }
        _headers.put(key, value);
        _swEncoding.getHeaders().put(key, value.getSw());
        return this;
    }

    @Override
    public void removeHeader(String key) {
        initHeaders();
        if (_headers != null) {
            _headers.remove(key);
            _swEncoding.getHeaders().remove(key);
        }
    }

    @Override
    public org.eclipse.microprofile.openapi.models.media.Encoding.Style getStyle() {
        if (_swEncoding.getStyle() == null) {
            return null;
        }
        switch (_swEncoding.getStyle()) {
        default:
            throw new IllegalStateException("Unexpected enum value");
        }
    }

    @Override
    public void setStyle(org.eclipse.microprofile.openapi.models.media.Encoding.Style style) {
        _swEncoding.setStyle(style);
    }

    @Override
    public Boolean getExplode() {
        return _swEncoding.getExplode();
    }

    @Override
    public void setExplode(Boolean explode) {
        _swEncoding.setExplode(explode);
    }

    @Override
    public Boolean getAllowReserved() {
        return _swEncoding.getAllowReserved();
    }

    @Override
    public void setAllowReserved(Boolean allowReserved) {
        _swEncoding.setAllowReserved(allowReserved);
    }

}
