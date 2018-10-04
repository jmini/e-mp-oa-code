package fr.jmini.empoa.internal.models.media;

import org.eclipse.microprofile.openapi.models.media.Encoding;

public class EncodingImpl implements Encoding {

    private java.util.Map<String, Object> _extensions;

    @Override
    public java.util.Map<String, Object> getExtensions() {
        return _extensions;
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        _extensions = extensions;
    }

    @Override
    public Encoding addExtension(String key, Object object) {
        if (_extensions == null) {
            _extensions = new java.util.LinkedHashMap<>();
        }
        _extensions.put(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
        if (_extensions != null) {
            _extensions.remove(key);
        }
    }

    private String _contentType;

    @Override
    public String getContentType() {
        return _contentType;
    }

    @Override
    public void setContentType(String contentType) {
        _contentType = contentType;
    }

    private java.util.Map<String, org.eclipse.microprofile.openapi.models.headers.Header> _headers;

    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.headers.Header> getHeaders() {
        return _headers;
    }

    @Override
    public void setHeaders(java.util.Map<String, org.eclipse.microprofile.openapi.models.headers.Header> headers) {
        _headers = headers;
    }

    @Override
    public Encoding addHeader(String key, org.eclipse.microprofile.openapi.models.headers.Header header) {
        if (_headers == null) {
            _headers = new java.util.LinkedHashMap<>();
        }
        _headers.put(key, header);
        return this;
    }

    @Override
    public void removeHeader(String key) {
        if (_headers != null) {
            _headers.remove(key);
        }
    }

    private org.eclipse.microprofile.openapi.models.media.Encoding.Style _style;

    @Override
    public org.eclipse.microprofile.openapi.models.media.Encoding.Style getStyle() {
        return _style;
    }

    @Override
    public void setStyle(org.eclipse.microprofile.openapi.models.media.Encoding.Style style) {
        _style = style;
    }

    private Boolean _explode;

    @Override
    public Boolean getExplode() {
        return _explode;
    }

    @Override
    public void setExplode(Boolean explode) {
        _explode = explode;
    }

    private Boolean _allowReserved;

    @Override
    public Boolean getAllowReserved() {
        return _allowReserved;
    }

    @Override
    public void setAllowReserved(Boolean allowReserved) {
        _allowReserved = allowReserved;
    }

}
