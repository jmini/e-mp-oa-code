package fr.jmini.empoa.swagger.parser.internal.models;

import org.eclipse.microprofile.openapi.models.Components;

public class SwComponents implements Components {

    private io.swagger.v3.oas.models.Components _swComponents;

    public SwComponents() {
        _swComponents = new io.swagger.v3.oas.models.Components();
    }

    public SwComponents(io.swagger.v3.oas.models.Components _swComponents) {
        this._swComponents = _swComponents;
    }

    public io.swagger.v3.oas.models.Components getSw() {
        return _swComponents;
    }

    @Override
    public java.util.Map<String, Object> getExtensions() {
        java.util.Map<String, Object> result = _swComponents.getExtensions();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        _swComponents.setExtensions(null);
        if (extensions != null) {
            for (java.util.Map.Entry<String, Object> e : extensions.entrySet()) {
                this.addExtension(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Components addExtension(String key, Object object) {
        _swComponents.addExtension(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
        if (getExtensions() != null) {
            _swComponents.getExtensions().remove(key);
        }
    }

    private java.util.Map<String,fr.jmini.empoa.swagger.parser.internal.models.media.SwSchema> _schemas;

    private void initSchemas() {
        if (_swComponents.getSchemas() == null) {
            _schemas = null;
        } else {
            _swComponents.getSchemas()
                    .entrySet()
                    .stream()
                    .collect(java.util.stream.Collectors.toMap(
                        java.util.Map.Entry::getKey,
                        e -> new fr.jmini.empoa.swagger.parser.internal.models.media.SwSchema(e.getValue()),
                        (k1, k2) -> { throw new IllegalStateException(String.format("Duplicate key %s", k1)); },
                        () -> new java.util.LinkedHashMap()));
        }
    }
    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.media.Schema> getSchemas() {
        initSchemas();
        if (_schemas == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(_schemas);
    }

    @Override
    public void setSchemas(java.util.Map<String, org.eclipse.microprofile.openapi.models.media.Schema> schemas) {
        _swComponents.setSchemas(null);
        if (schemas != null) {
            for (java.util.Map.Entry<String, org.eclipse.microprofile.openapi.models.media.Schema> e : schemas.entrySet()) {
                this.addSchema(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Components addSchema(String key, org.eclipse.microprofile.openapi.models.media.Schema schema) {
        if (!(schema instanceof fr.jmini.empoa.swagger.parser.internal.models.media.SwSchema)) {
            throw new IllegalArgumentException("Unexpected type: " + schema);
        }
        fr.jmini.empoa.swagger.parser.internal.models.media.SwSchema value = (fr.jmini.empoa.swagger.parser.internal.models.media.SwSchema) schema;
        initSchemas();
        if (_schemas == null) {
            _schemas = new java.util.LinkedHashMap<>();
        _swComponents.setSchemas(new java.util.LinkedHashMap<>());
        }
        _schemas.put(key, value);
        _swComponents.getSchemas().put(key, value.getSw());
        return this;
    }

    @Override
    public void removeSchema(String key) {
        initSchemas();
        if (_schemas != null) {
            _schemas.remove(key);
            _swComponents.getSchemas().remove(key);
        }
    }

    private java.util.Map<String,fr.jmini.empoa.swagger.parser.internal.models.responses.SwAPIResponse> _responses;

    private void initResponses() {
        if (_swComponents.getResponses() == null) {
            _responses = null;
        } else {
            _swComponents.getResponses()
                    .entrySet()
                    .stream()
                    .collect(java.util.stream.Collectors.toMap(
                        java.util.Map.Entry::getKey,
                        e -> new fr.jmini.empoa.swagger.parser.internal.models.responses.SwAPIResponse(e.getValue()),
                        (k1, k2) -> { throw new IllegalStateException(String.format("Duplicate key %s", k1)); },
                        () -> new java.util.LinkedHashMap()));
        }
    }
    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.responses.APIResponse> getResponses() {
        initResponses();
        if (_responses == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(_responses);
    }

    @Override
    public void setResponses(java.util.Map<String, org.eclipse.microprofile.openapi.models.responses.APIResponse> responses) {
        _swComponents.setResponses(null);
        if (responses != null) {
            for (java.util.Map.Entry<String, org.eclipse.microprofile.openapi.models.responses.APIResponse> e : responses.entrySet()) {
                this.addResponse(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Components addResponse(String key, org.eclipse.microprofile.openapi.models.responses.APIResponse aPIResponse) {
        if (!(aPIResponse instanceof fr.jmini.empoa.swagger.parser.internal.models.responses.SwAPIResponse)) {
            throw new IllegalArgumentException("Unexpected type: " + aPIResponse);
        }
        fr.jmini.empoa.swagger.parser.internal.models.responses.SwAPIResponse value = (fr.jmini.empoa.swagger.parser.internal.models.responses.SwAPIResponse) aPIResponse;
        initResponses();
        if (_responses == null) {
            _responses = new java.util.LinkedHashMap<>();
        _swComponents.setResponses(new java.util.LinkedHashMap<>());
        }
        _responses.put(key, value);
        _swComponents.getResponses().put(key, value.getSw());
        return this;
    }

    @Override
    public void removeResponse(String key) {
        initResponses();
        if (_responses != null) {
            _responses.remove(key);
            _swComponents.getResponses().remove(key);
        }
    }

    private java.util.Map<String,fr.jmini.empoa.swagger.parser.internal.models.parameters.SwParameter> _parameters;

    private void initParameters() {
        if (_swComponents.getParameters() == null) {
            _parameters = null;
        } else {
            _swComponents.getParameters()
                    .entrySet()
                    .stream()
                    .collect(java.util.stream.Collectors.toMap(
                        java.util.Map.Entry::getKey,
                        e -> new fr.jmini.empoa.swagger.parser.internal.models.parameters.SwParameter(e.getValue()),
                        (k1, k2) -> { throw new IllegalStateException(String.format("Duplicate key %s", k1)); },
                        () -> new java.util.LinkedHashMap()));
        }
    }
    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.parameters.Parameter> getParameters() {
        initParameters();
        if (_parameters == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(_parameters);
    }

    @Override
    public void setParameters(java.util.Map<String, org.eclipse.microprofile.openapi.models.parameters.Parameter> parameters) {
        _swComponents.setParameters(null);
        if (parameters != null) {
            for (java.util.Map.Entry<String, org.eclipse.microprofile.openapi.models.parameters.Parameter> e : parameters.entrySet()) {
                this.addParameter(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Components addParameter(String key, org.eclipse.microprofile.openapi.models.parameters.Parameter parameter) {
        if (!(parameter instanceof fr.jmini.empoa.swagger.parser.internal.models.parameters.SwParameter)) {
            throw new IllegalArgumentException("Unexpected type: " + parameter);
        }
        fr.jmini.empoa.swagger.parser.internal.models.parameters.SwParameter value = (fr.jmini.empoa.swagger.parser.internal.models.parameters.SwParameter) parameter;
        initParameters();
        if (_parameters == null) {
            _parameters = new java.util.LinkedHashMap<>();
        _swComponents.setParameters(new java.util.LinkedHashMap<>());
        }
        _parameters.put(key, value);
        _swComponents.getParameters().put(key, value.getSw());
        return this;
    }

    @Override
    public void removeParameter(String key) {
        initParameters();
        if (_parameters != null) {
            _parameters.remove(key);
            _swComponents.getParameters().remove(key);
        }
    }

    private java.util.Map<String,fr.jmini.empoa.swagger.parser.internal.models.examples.SwExample> _examples;

    private void initExamples() {
        if (_swComponents.getExamples() == null) {
            _examples = null;
        } else {
            _swComponents.getExamples()
                    .entrySet()
                    .stream()
                    .collect(java.util.stream.Collectors.toMap(
                        java.util.Map.Entry::getKey,
                        e -> new fr.jmini.empoa.swagger.parser.internal.models.examples.SwExample(e.getValue()),
                        (k1, k2) -> { throw new IllegalStateException(String.format("Duplicate key %s", k1)); },
                        () -> new java.util.LinkedHashMap()));
        }
    }
    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.examples.Example> getExamples() {
        initExamples();
        if (_examples == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(_examples);
    }

    @Override
    public void setExamples(java.util.Map<String, org.eclipse.microprofile.openapi.models.examples.Example> examples) {
        _swComponents.setExamples(null);
        if (examples != null) {
            for (java.util.Map.Entry<String, org.eclipse.microprofile.openapi.models.examples.Example> e : examples.entrySet()) {
                this.addExample(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Components addExample(String key, org.eclipse.microprofile.openapi.models.examples.Example example) {
        if (!(example instanceof fr.jmini.empoa.swagger.parser.internal.models.examples.SwExample)) {
            throw new IllegalArgumentException("Unexpected type: " + example);
        }
        fr.jmini.empoa.swagger.parser.internal.models.examples.SwExample value = (fr.jmini.empoa.swagger.parser.internal.models.examples.SwExample) example;
        initExamples();
        if (_examples == null) {
            _examples = new java.util.LinkedHashMap<>();
        _swComponents.setExamples(new java.util.LinkedHashMap<>());
        }
        _examples.put(key, value);
        _swComponents.getExamples().put(key, value.getSw());
        return this;
    }

    @Override
    public void removeExample(String key) {
        initExamples();
        if (_examples != null) {
            _examples.remove(key);
            _swComponents.getExamples().remove(key);
        }
    }

    private java.util.Map<String,fr.jmini.empoa.swagger.parser.internal.models.parameters.SwRequestBody> _requestBodies;

    private void initRequestBodies() {
        if (_swComponents.getRequestBodies() == null) {
            _requestBodies = null;
        } else {
            _swComponents.getRequestBodies()
                    .entrySet()
                    .stream()
                    .collect(java.util.stream.Collectors.toMap(
                        java.util.Map.Entry::getKey,
                        e -> new fr.jmini.empoa.swagger.parser.internal.models.parameters.SwRequestBody(e.getValue()),
                        (k1, k2) -> { throw new IllegalStateException(String.format("Duplicate key %s", k1)); },
                        () -> new java.util.LinkedHashMap()));
        }
    }
    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.parameters.RequestBody> getRequestBodies() {
        initRequestBodies();
        if (_requestBodies == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(_requestBodies);
    }

    @Override
    public void setRequestBodies(java.util.Map<String, org.eclipse.microprofile.openapi.models.parameters.RequestBody> requestBodies) {
        _swComponents.setRequestBodies(null);
        if (requestBodies != null) {
            for (java.util.Map.Entry<String, org.eclipse.microprofile.openapi.models.parameters.RequestBody> e : requestBodies.entrySet()) {
                this.addRequestBody(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Components addRequestBody(String key, org.eclipse.microprofile.openapi.models.parameters.RequestBody requestBody) {
        if (!(requestBody instanceof fr.jmini.empoa.swagger.parser.internal.models.parameters.SwRequestBody)) {
            throw new IllegalArgumentException("Unexpected type: " + requestBody);
        }
        fr.jmini.empoa.swagger.parser.internal.models.parameters.SwRequestBody value = (fr.jmini.empoa.swagger.parser.internal.models.parameters.SwRequestBody) requestBody;
        initRequestBodies();
        if (_requestBodies == null) {
            _requestBodies = new java.util.LinkedHashMap<>();
        _swComponents.setRequestBodies(new java.util.LinkedHashMap<>());
        }
        _requestBodies.put(key, value);
        _swComponents.getRequestBodies().put(key, value.getSw());
        return this;
    }

    @Override
    public void removeRequestBody(String key) {
        initRequestBodies();
        if (_requestBodies != null) {
            _requestBodies.remove(key);
            _swComponents.getRequestBodies().remove(key);
        }
    }

    private java.util.Map<String,fr.jmini.empoa.swagger.parser.internal.models.headers.SwHeader> _headers;

    private void initHeaders() {
        if (_swComponents.getHeaders() == null) {
            _headers = null;
        } else {
            _swComponents.getHeaders()
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
        _swComponents.setHeaders(null);
        if (headers != null) {
            for (java.util.Map.Entry<String, org.eclipse.microprofile.openapi.models.headers.Header> e : headers.entrySet()) {
                this.addHeader(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Components addHeader(String key, org.eclipse.microprofile.openapi.models.headers.Header header) {
        if (!(header instanceof fr.jmini.empoa.swagger.parser.internal.models.headers.SwHeader)) {
            throw new IllegalArgumentException("Unexpected type: " + header);
        }
        fr.jmini.empoa.swagger.parser.internal.models.headers.SwHeader value = (fr.jmini.empoa.swagger.parser.internal.models.headers.SwHeader) header;
        initHeaders();
        if (_headers == null) {
            _headers = new java.util.LinkedHashMap<>();
        _swComponents.setHeaders(new java.util.LinkedHashMap<>());
        }
        _headers.put(key, value);
        _swComponents.getHeaders().put(key, value.getSw());
        return this;
    }

    @Override
    public void removeHeader(String key) {
        initHeaders();
        if (_headers != null) {
            _headers.remove(key);
            _swComponents.getHeaders().remove(key);
        }
    }

    private java.util.Map<String,fr.jmini.empoa.swagger.parser.internal.models.security.SwSecurityScheme> _securitySchemes;

    private void initSecuritySchemes() {
        if (_swComponents.getSecuritySchemes() == null) {
            _securitySchemes = null;
        } else {
            _swComponents.getSecuritySchemes()
                    .entrySet()
                    .stream()
                    .collect(java.util.stream.Collectors.toMap(
                        java.util.Map.Entry::getKey,
                        e -> new fr.jmini.empoa.swagger.parser.internal.models.security.SwSecurityScheme(e.getValue()),
                        (k1, k2) -> { throw new IllegalStateException(String.format("Duplicate key %s", k1)); },
                        () -> new java.util.LinkedHashMap()));
        }
    }
    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.security.SecurityScheme> getSecuritySchemes() {
        initSecuritySchemes();
        if (_securitySchemes == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(_securitySchemes);
    }

    @Override
    public void setSecuritySchemes(java.util.Map<String, org.eclipse.microprofile.openapi.models.security.SecurityScheme> securitySchemes) {
        _swComponents.setSecuritySchemes(null);
        if (securitySchemes != null) {
            for (java.util.Map.Entry<String, org.eclipse.microprofile.openapi.models.security.SecurityScheme> e : securitySchemes.entrySet()) {
                this.addSecurityScheme(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Components addSecurityScheme(String key, org.eclipse.microprofile.openapi.models.security.SecurityScheme securityScheme) {
        if (!(securityScheme instanceof fr.jmini.empoa.swagger.parser.internal.models.security.SwSecurityScheme)) {
            throw new IllegalArgumentException("Unexpected type: " + securityScheme);
        }
        fr.jmini.empoa.swagger.parser.internal.models.security.SwSecurityScheme value = (fr.jmini.empoa.swagger.parser.internal.models.security.SwSecurityScheme) securityScheme;
        initSecuritySchemes();
        if (_securitySchemes == null) {
            _securitySchemes = new java.util.LinkedHashMap<>();
        _swComponents.setSecuritySchemes(new java.util.LinkedHashMap<>());
        }
        _securitySchemes.put(key, value);
        _swComponents.getSecuritySchemes().put(key, value.getSw());
        return this;
    }

    @Override
    public void removeSecurityScheme(String key) {
        initSecuritySchemes();
        if (_securitySchemes != null) {
            _securitySchemes.remove(key);
            _swComponents.getSecuritySchemes().remove(key);
        }
    }

    private java.util.Map<String,fr.jmini.empoa.swagger.parser.internal.models.links.SwLink> _links;

    private void initLinks() {
        if (_swComponents.getLinks() == null) {
            _links = null;
        } else {
            _swComponents.getLinks()
                    .entrySet()
                    .stream()
                    .collect(java.util.stream.Collectors.toMap(
                        java.util.Map.Entry::getKey,
                        e -> new fr.jmini.empoa.swagger.parser.internal.models.links.SwLink(e.getValue()),
                        (k1, k2) -> { throw new IllegalStateException(String.format("Duplicate key %s", k1)); },
                        () -> new java.util.LinkedHashMap()));
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
        _swComponents.setLinks(null);
        if (links != null) {
            for (java.util.Map.Entry<String, org.eclipse.microprofile.openapi.models.links.Link> e : links.entrySet()) {
                this.addLink(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Components addLink(String key, org.eclipse.microprofile.openapi.models.links.Link link) {
        if (!(link instanceof fr.jmini.empoa.swagger.parser.internal.models.links.SwLink)) {
            throw new IllegalArgumentException("Unexpected type: " + link);
        }
        fr.jmini.empoa.swagger.parser.internal.models.links.SwLink value = (fr.jmini.empoa.swagger.parser.internal.models.links.SwLink) link;
        initLinks();
        if (_links == null) {
            _links = new java.util.LinkedHashMap<>();
        _swComponents.setLinks(new java.util.LinkedHashMap<>());
        }
        _links.put(key, value);
        _swComponents.getLinks().put(key, value.getSw());
        return this;
    }

    @Override
    public void removeLink(String key) {
        initLinks();
        if (_links != null) {
            _links.remove(key);
            _swComponents.getLinks().remove(key);
        }
    }

    private java.util.Map<String,fr.jmini.empoa.swagger.parser.internal.models.callbacks.SwCallback> _callbacks;

    private void initCallbacks() {
        if (_swComponents.getCallbacks() == null) {
            _callbacks = null;
        } else {
            _swComponents.getCallbacks()
                    .entrySet()
                    .stream()
                    .collect(java.util.stream.Collectors.toMap(
                        java.util.Map.Entry::getKey,
                        e -> new fr.jmini.empoa.swagger.parser.internal.models.callbacks.SwCallback(e.getValue()),
                        (k1, k2) -> { throw new IllegalStateException(String.format("Duplicate key %s", k1)); },
                        () -> new java.util.LinkedHashMap()));
        }
    }
    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.callbacks.Callback> getCallbacks() {
        initCallbacks();
        if (_callbacks == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(_callbacks);
    }

    @Override
    public void setCallbacks(java.util.Map<String, org.eclipse.microprofile.openapi.models.callbacks.Callback> callbacks) {
        _swComponents.setCallbacks(null);
        if (callbacks != null) {
            for (java.util.Map.Entry<String, org.eclipse.microprofile.openapi.models.callbacks.Callback> e : callbacks.entrySet()) {
                this.addCallback(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Components addCallback(String key, org.eclipse.microprofile.openapi.models.callbacks.Callback callback) {
        if (!(callback instanceof fr.jmini.empoa.swagger.parser.internal.models.callbacks.SwCallback)) {
            throw new IllegalArgumentException("Unexpected type: " + callback);
        }
        fr.jmini.empoa.swagger.parser.internal.models.callbacks.SwCallback value = (fr.jmini.empoa.swagger.parser.internal.models.callbacks.SwCallback) callback;
        initCallbacks();
        if (_callbacks == null) {
            _callbacks = new java.util.LinkedHashMap<>();
        _swComponents.setCallbacks(new java.util.LinkedHashMap<>());
        }
        _callbacks.put(key, value);
        _swComponents.getCallbacks().put(key, value.getSw());
        return this;
    }

    @Override
    public void removeCallback(String key) {
        initCallbacks();
        if (_callbacks != null) {
            _callbacks.remove(key);
            _swComponents.getCallbacks().remove(key);
        }
    }

}
