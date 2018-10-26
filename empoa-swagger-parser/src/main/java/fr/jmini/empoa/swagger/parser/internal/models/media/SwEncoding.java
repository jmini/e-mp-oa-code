package fr.jmini.empoa.swagger.parser.internal.models.media;

import org.eclipse.microprofile.openapi.models.media.Encoding;

public class SwEncoding implements Encoding {

    private io.swagger.v3.oas.models.media.Encoding swEncoding;

    public SwEncoding() {
        swEncoding = new io.swagger.v3.oas.models.media.Encoding();
    }

    public SwEncoding(io.swagger.v3.oas.models.media.Encoding swEncoding) {
        this.swEncoding = swEncoding;
    }

    @Override
    public java.util.Map<String, Object> getExtensions() {
        java.util.Map<String, Object> result = swEncoding.getExtensions();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        swEncoding.setExtensions(null);
        if (extensions != null) {
            for (java.util.Map.Entry<String, Object> e : extensions.entrySet()) {
                this.addExtension(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Encoding addExtension(String key, Object object) {
        swEncoding.addExtension(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
    }

    @Override
    public String getContentType() {
        return swEncoding.getContentType();
    }

    @Override
    public void setContentType(String contentType) {
        swEncoding.setContentType(contentType);
    }

    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.headers.Header> getHeaders() {
        java.util.Map<String, org.eclipse.microprofile.openapi.models.headers.Header> result = swEncoding.getHeaders();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setHeaders(java.util.Map<String, org.eclipse.microprofile.openapi.models.headers.Header> headers) {
        swEncoding.setHeaders(null);
        if (headers != null) {
            for (java.util.Map.Entry<String, org.eclipse.microprofile.openapi.models.headers.Header> e : headers.entrySet()) {
                this.addHeader(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Encoding addHeader(String key, org.eclipse.microprofile.openapi.models.headers.Header header) {
        swEncoding.addHeader(key, header);
        return this;
    }

    @Override
    public void removeHeader(String key) {
    }

    @Override
    public org.eclipse.microprofile.openapi.models.media.Encoding.Style getStyle() {
        return swEncoding.getStyle();
    }

    @Override
    public void setStyle(org.eclipse.microprofile.openapi.models.media.Encoding.Style style) {
        swEncoding.setStyle(style);
    }

    @Override
    public Boolean getExplode() {
        return swEncoding.getExplode();
    }

    @Override
    public void setExplode(Boolean explode) {
        swEncoding.setExplode(explode);
    }

    @Override
    public Boolean getAllowReserved() {
        return swEncoding.getAllowReserved();
    }

    @Override
    public void setAllowReserved(Boolean allowReserved) {
        swEncoding.setAllowReserved(allowReserved);
    }

}
