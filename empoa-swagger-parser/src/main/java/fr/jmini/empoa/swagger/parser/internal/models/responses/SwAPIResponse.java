package fr.jmini.empoa.swagger.parser.internal.models.responses;

import org.eclipse.microprofile.openapi.models.responses.APIResponse;

public class SwAPIResponse implements APIResponse {

    private io.swagger.v3.oas.models.responses.ApiResponse _swAPIResponse;

    public SwAPIResponse() {
        _swAPIResponse = new io.swagger.v3.oas.models.responses.ApiResponse();
    }

    public SwAPIResponse(io.swagger.v3.oas.models.responses.ApiResponse _swAPIResponse) {
        this._swAPIResponse = _swAPIResponse;
    }

    public io.swagger.v3.oas.models.responses.ApiResponse getSw() {
        return _swAPIResponse;
    }

    @Override
    public String getRef() {
        return _swAPIResponse.get$ref();
    }

    @Override
    public void setRef(String ref) {
        _swAPIResponse.set$ref(ref);
    }

    @Override
    public java.util.Map<String, Object> getExtensions() {
        java.util.Map<String, Object> result = _swAPIResponse.getExtensions();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        _swAPIResponse.setExtensions(null);
        if (extensions != null) {
            for (java.util.Map.Entry<String, Object> e : extensions.entrySet()) {
                this.addExtension(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public APIResponse addExtension(String key, Object object) {
        _swAPIResponse.addExtension(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
        if (getExtensions() != null) {
            _swAPIResponse.getExtensions()
                    .remove(key);
        }
    }

    @Override
    public String getDescription() {
        return _swAPIResponse.getDescription();
    }

    @Override
    public void setDescription(String description) {
        _swAPIResponse.setDescription(description);
    }

    private java.util.Map<String, fr.jmini.empoa.swagger.parser.internal.models.headers.SwHeader> _headers;

    private void initHeaders() {
        if (_swAPIResponse.getHeaders() == null) {
            _headers = null;
        } else {
            _headers = _swAPIResponse.getHeaders()
                    .entrySet()
                    .stream()
                    .collect(java.util.stream.Collectors.toMap(
                            java.util.Map.Entry::getKey,
                            e -> new fr.jmini.empoa.swagger.parser.internal.models.headers.SwHeader(e.getValue()),
                            (k1, k2) -> {
                                throw new IllegalStateException(String.format("Duplicate key %s", k1));
                            },
                            () -> new java.util.LinkedHashMap<String, fr.jmini.empoa.swagger.parser.internal.models.headers.SwHeader>()));
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
        _swAPIResponse.setHeaders(null);
        if (headers != null) {
            for (java.util.Map.Entry<String, org.eclipse.microprofile.openapi.models.headers.Header> e : headers.entrySet()) {
                this.addHeader(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public APIResponse addHeader(String key, org.eclipse.microprofile.openapi.models.headers.Header header) {
        if (!(header instanceof fr.jmini.empoa.swagger.parser.internal.models.headers.SwHeader)) {
            throw new IllegalArgumentException("Unexpected type: " + header);
        }
        fr.jmini.empoa.swagger.parser.internal.models.headers.SwHeader value = (fr.jmini.empoa.swagger.parser.internal.models.headers.SwHeader) header;
        initHeaders();
        if (_headers == null) {
            _headers = new java.util.LinkedHashMap<>();
            _swAPIResponse.setHeaders(new java.util.LinkedHashMap<>());
        }
        _headers.put(key, value);
        _swAPIResponse.getHeaders()
                .put(key, value.getSw());
        return this;
    }

    @Override
    public void removeHeader(String key) {
        initHeaders();
        if (_headers != null) {
            _headers.remove(key);
            _swAPIResponse.getHeaders()
                    .remove(key);
        }
    }

    private fr.jmini.empoa.swagger.parser.internal.models.media.SwContent _content;

    private void initContent() {
        if (_swAPIResponse.getContent() == null) {
            _content = null;
        } else {
            _content = new fr.jmini.empoa.swagger.parser.internal.models.media.SwContent(_swAPIResponse.getContent());
        }
    }

    @Override
    public org.eclipse.microprofile.openapi.models.media.Content getContent() {
        initContent();
        return _content;
    }

    @Override
    public void setContent(org.eclipse.microprofile.openapi.models.media.Content content) {
        if (content != null) {
            if (!(content instanceof fr.jmini.empoa.swagger.parser.internal.models.media.SwContent)) {
                throw new IllegalArgumentException("Unexpected type: " + content);
            }
            _content = (fr.jmini.empoa.swagger.parser.internal.models.media.SwContent) content;
            _swAPIResponse.setContent(_content.getSw());
        } else {
            _content = null;
            _swAPIResponse.setContent(null);
        }
    }

    private java.util.Map<String, fr.jmini.empoa.swagger.parser.internal.models.links.SwLink> _links;

    private void initLinks() {
        if (_swAPIResponse.getLinks() == null) {
            _links = null;
        } else {
            _links = _swAPIResponse.getLinks()
                    .entrySet()
                    .stream()
                    .collect(java.util.stream.Collectors.toMap(
                            java.util.Map.Entry::getKey,
                            e -> new fr.jmini.empoa.swagger.parser.internal.models.links.SwLink(e.getValue()),
                            (k1, k2) -> {
                                throw new IllegalStateException(String.format("Duplicate key %s", k1));
                            },
                            () -> new java.util.LinkedHashMap<String, fr.jmini.empoa.swagger.parser.internal.models.links.SwLink>()));
        }
    }

    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.links.Link> getLinks() {
        initLinks();
        if (_links == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(_links);
    }

    @Override
    public void setLinks(java.util.Map<String, org.eclipse.microprofile.openapi.models.links.Link> links) {
        _swAPIResponse.setLinks(null);
        if (links != null) {
            for (java.util.Map.Entry<String, org.eclipse.microprofile.openapi.models.links.Link> e : links.entrySet()) {
                this.addLink(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public APIResponse addLink(String key, org.eclipse.microprofile.openapi.models.links.Link link) {
        if (!(link instanceof fr.jmini.empoa.swagger.parser.internal.models.links.SwLink)) {
            throw new IllegalArgumentException("Unexpected type: " + link);
        }
        fr.jmini.empoa.swagger.parser.internal.models.links.SwLink value = (fr.jmini.empoa.swagger.parser.internal.models.links.SwLink) link;
        initLinks();
        if (_links == null) {
            _links = new java.util.LinkedHashMap<>();
            _swAPIResponse.setLinks(new java.util.LinkedHashMap<>());
        }
        _links.put(key, value);
        _swAPIResponse.getLinks()
                .put(key, value.getSw());
        return this;
    }

    @Override
    public void removeLink(String key) {
        initLinks();
        if (_links != null) {
            _links.remove(key);
            _swAPIResponse.getLinks()
                    .remove(key);
        }
    }

}
