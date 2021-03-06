package fr.jmini.empoa.simple.internal.models.responses;

import org.eclipse.microprofile.openapi.models.responses.APIResponse;

public class APIResponseImpl implements APIResponse {

    private String _ref;

    @Override
    public String getRef() {
        return _ref;
    }

    @Override
    public APIResponse ref(String ref) {
        setRef(ref);
        return this;
    }

    @Override
    public void setRef(String ref) {
        if (ref != null && !ref.contains("#") && !ref.contains("/")) {
            _ref = "#/components/responses/" + ref;
        } else {
            _ref = ref;
        }
    }

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

    private String _description;

    @Override
    public String getDescription() {
        return _description;
    }

    @Override
    public void setDescription(String description) {
        _description = description;
    }

    @Override
    public APIResponse description(String description) {
        setDescription(description);
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
    public APIResponse headers(java.util.Map<String, org.eclipse.microprofile.openapi.models.headers.Header> headers) {
        setHeaders(headers);
        return this;
    }

    @Override
    public APIResponse addHeader(String key, org.eclipse.microprofile.openapi.models.headers.Header header) {
        if (_headers == null) {
            _headers = new java.util.LinkedHashMap<>();
        }
        _headers.put(key, header);
        return this;
    }

    private org.eclipse.microprofile.openapi.models.media.Content _content;

    @Override
    public org.eclipse.microprofile.openapi.models.media.Content getContent() {
        return _content;
    }

    @Override
    public void setContent(org.eclipse.microprofile.openapi.models.media.Content content) {
        _content = content;
    }

    @Override
    public APIResponse content(org.eclipse.microprofile.openapi.models.media.Content content) {
        setContent(content);
        return this;
    }

    private java.util.Map<String, org.eclipse.microprofile.openapi.models.links.Link> _links;

    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.links.Link> getLinks() {
        return _links;
    }

    @Override
    public void setLinks(java.util.Map<String, org.eclipse.microprofile.openapi.models.links.Link> links) {
        _links = links;
    }

    @Override
    public APIResponse links(java.util.Map<String, org.eclipse.microprofile.openapi.models.links.Link> links) {
        setLinks(links);
        return this;
    }

    @Override
    public APIResponse addLink(String key, org.eclipse.microprofile.openapi.models.links.Link link) {
        if (_links == null) {
            _links = new java.util.LinkedHashMap<>();
        }
        _links.put(key, link);
        return this;
    }

}
