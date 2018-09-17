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
    public void addExtension(String key, Object object) {
        if (_extensions == null) {
            _extensions = new java.util.LinkedHashMap<>();
        }
        _extensions.put(key, object);
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

    @Override
    public Encoding contentType(String contentType) {
        setContentType(contentType);
        return this;
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
    public Encoding headers(java.util.Map<String, org.eclipse.microprofile.openapi.models.headers.Header> headers) {
        setHeaders(headers);
        return this;
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

    @Override
    public Encoding style(org.eclipse.microprofile.openapi.models.media.Encoding.Style style) {
        setStyle(style);
        return this;
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

    @Override
    public Encoding explode(Boolean explode) {
        setExplode(explode);
        return this;
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

    @Override
    public Encoding allowReserved(Boolean allowReserved) {
        setAllowReserved(allowReserved);
        return this;
    }

}
