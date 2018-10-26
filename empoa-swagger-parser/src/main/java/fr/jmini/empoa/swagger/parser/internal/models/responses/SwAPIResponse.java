package fr.jmini.empoa.swagger.parser.internal.models.responses;

import org.eclipse.microprofile.openapi.models.responses.APIResponse;

public class SwAPIResponse implements APIResponse {

    private io.swagger.v3.oas.models.responses.ApiResponse swAPIResponse;

    public SwAPIResponse() {
        swAPIResponse = new io.swagger.v3.oas.models.responses.ApiResponse();
    }

    public SwAPIResponse(io.swagger.v3.oas.models.responses.ApiResponse swAPIResponse) {
        this.swAPIResponse = swAPIResponse;
    }

    @Override
    public String getRef() {
        return swAPIResponse.getRef();
    }

    @Override
    public void setRef(String ref) {
    }

    @Override
    public java.util.Map<String, Object> getExtensions() {
        java.util.Map<String, Object> result = swAPIResponse.getExtensions();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        swAPIResponse.setExtensions(null);
        if (extensions != null) {
            for (java.util.Map.Entry<String, Object> e : extensions.entrySet()) {
                this.addExtension(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public APIResponse addExtension(String key, Object object) {
        swAPIResponse.addExtension(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
    }

    @Override
    public String getDescription() {
        return swAPIResponse.getDescription();
    }

    @Override
    public void setDescription(String description) {
        swAPIResponse.setDescription(description);
    }

    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.headers.Header> getHeaders() {
        java.util.Map<String, org.eclipse.microprofile.openapi.models.headers.Header> result = swAPIResponse.getHeaders();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setHeaders(java.util.Map<String, org.eclipse.microprofile.openapi.models.headers.Header> headers) {
        swAPIResponse.setHeaders(null);
        if (headers != null) {
            for (java.util.Map.Entry<String, org.eclipse.microprofile.openapi.models.headers.Header> e : headers.entrySet()) {
                this.addHeader(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public APIResponse addHeader(String key, org.eclipse.microprofile.openapi.models.headers.Header header) {
        swAPIResponse.addHeader(key, header);
        return this;
    }

    @Override
    public void removeHeader(String key) {
    }

    @Override
    public org.eclipse.microprofile.openapi.models.media.Content getContent() {
        return swAPIResponse.getContent();
    }

    @Override
    public void setContent(org.eclipse.microprofile.openapi.models.media.Content content) {
        swAPIResponse.setContent(content);
    }

    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.links.Link> getLinks() {
        java.util.Map<String, org.eclipse.microprofile.openapi.models.links.Link> result = swAPIResponse.getLinks();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setLinks(java.util.Map<String, org.eclipse.microprofile.openapi.models.links.Link> links) {
        swAPIResponse.setLinks(null);
        if (links != null) {
            for (java.util.Map.Entry<String, org.eclipse.microprofile.openapi.models.links.Link> e : links.entrySet()) {
                this.addLink(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public APIResponse addLink(String key, org.eclipse.microprofile.openapi.models.links.Link link) {
        swAPIResponse.addLink(key, link);
        return this;
    }

    @Override
    public void removeLink(String key) {
    }

}
