package fr.jmini.empoa.internal.models;

import org.eclipse.microprofile.openapi.models.Components;

public class ComponentsImpl implements Components {

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
    public Components addExtension(String key, Object object) {
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

    private java.util.Map<String, org.eclipse.microprofile.openapi.models.media.Schema> _schemas;

    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.media.Schema> getSchemas() {
        return _schemas;
    }

    @Override
    public void setSchemas(java.util.Map<String, org.eclipse.microprofile.openapi.models.media.Schema> schemas) {
        _schemas = schemas;
    }

    @Override
    public Components addSchema(String key, org.eclipse.microprofile.openapi.models.media.Schema schema) {
        if (_schemas == null) {
            _schemas = new java.util.LinkedHashMap<>();
        }
        _schemas.put(key, schema);
        return this;
    }

    @Override
    public void removeSchema(String key) {
        if (_schemas != null) {
            _schemas.remove(key);
        }
    }

    private java.util.Map<String, org.eclipse.microprofile.openapi.models.responses.APIResponse> _responses;

    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.responses.APIResponse> getResponses() {
        return _responses;
    }

    @Override
    public void setResponses(java.util.Map<String, org.eclipse.microprofile.openapi.models.responses.APIResponse> responses) {
        _responses = responses;
    }

    @Override
    public Components addResponse(String key, org.eclipse.microprofile.openapi.models.responses.APIResponse aPIResponse) {
        if (_responses == null) {
            _responses = new java.util.LinkedHashMap<>();
        }
        _responses.put(key, aPIResponse);
        return this;
    }

    @Override
    public void removeResponse(String key) {
        if (_responses != null) {
            _responses.remove(key);
        }
    }

    private java.util.Map<String, org.eclipse.microprofile.openapi.models.parameters.Parameter> _parameters;

    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.parameters.Parameter> getParameters() {
        return _parameters;
    }

    @Override
    public void setParameters(java.util.Map<String, org.eclipse.microprofile.openapi.models.parameters.Parameter> parameters) {
        _parameters = parameters;
    }

    @Override
    public Components addParameter(String key, org.eclipse.microprofile.openapi.models.parameters.Parameter parameter) {
        if (_parameters == null) {
            _parameters = new java.util.LinkedHashMap<>();
        }
        _parameters.put(key, parameter);
        return this;
    }

    @Override
    public void removeParameter(String key) {
        if (_parameters != null) {
            _parameters.remove(key);
        }
    }

    private java.util.Map<String, org.eclipse.microprofile.openapi.models.examples.Example> _examples;

    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.examples.Example> getExamples() {
        return _examples;
    }

    @Override
    public void setExamples(java.util.Map<String, org.eclipse.microprofile.openapi.models.examples.Example> examples) {
        _examples = examples;
    }

    @Override
    public Components addExample(String key, org.eclipse.microprofile.openapi.models.examples.Example example) {
        if (_examples == null) {
            _examples = new java.util.LinkedHashMap<>();
        }
        _examples.put(key, example);
        return this;
    }

    @Override
    public void removeExample(String key) {
        if (_examples != null) {
            _examples.remove(key);
        }
    }

    private java.util.Map<String, org.eclipse.microprofile.openapi.models.parameters.RequestBody> _requestBodies;

    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.parameters.RequestBody> getRequestBodies() {
        return _requestBodies;
    }

    @Override
    public void setRequestBodies(java.util.Map<String, org.eclipse.microprofile.openapi.models.parameters.RequestBody> requestBodies) {
        _requestBodies = requestBodies;
    }

    @Override
    public Components addRequestBody(String key, org.eclipse.microprofile.openapi.models.parameters.RequestBody requestBody) {
        if (_requestBodies == null) {
            _requestBodies = new java.util.LinkedHashMap<>();
        }
        _requestBodies.put(key, requestBody);
        return this;
    }

    @Override
    public void removeRequestBody(String key) {
        if (_requestBodies != null) {
            _requestBodies.remove(key);
        }
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
    public Components addHeader(String key, org.eclipse.microprofile.openapi.models.headers.Header header) {
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

    private java.util.Map<String, org.eclipse.microprofile.openapi.models.security.SecurityScheme> _securitySchemes;

    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.security.SecurityScheme> getSecuritySchemes() {
        return _securitySchemes;
    }

    @Override
    public void setSecuritySchemes(java.util.Map<String, org.eclipse.microprofile.openapi.models.security.SecurityScheme> securitySchemes) {
        _securitySchemes = securitySchemes;
    }

    @Override
    public Components addSecurityScheme(String key, org.eclipse.microprofile.openapi.models.security.SecurityScheme securityScheme) {
        if (_securitySchemes == null) {
            _securitySchemes = new java.util.LinkedHashMap<>();
        }
        _securitySchemes.put(key, securityScheme);
        return this;
    }

    @Override
    public void removeSecurityScheme(String key) {
        if (_securitySchemes != null) {
            _securitySchemes.remove(key);
        }
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
    public Components addLink(String key, org.eclipse.microprofile.openapi.models.links.Link link) {
        if (_links == null) {
            _links = new java.util.LinkedHashMap<>();
        }
        _links.put(key, link);
        return this;
    }

    @Override
    public void removeLink(String key) {
        if (_links != null) {
            _links.remove(key);
        }
    }

    private java.util.Map<String, org.eclipse.microprofile.openapi.models.callbacks.Callback> _callbacks;

    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.callbacks.Callback> getCallbacks() {
        return _callbacks;
    }

    @Override
    public void setCallbacks(java.util.Map<String, org.eclipse.microprofile.openapi.models.callbacks.Callback> callbacks) {
        _callbacks = callbacks;
    }

    @Override
    public Components addCallback(String key, org.eclipse.microprofile.openapi.models.callbacks.Callback callback) {
        if (_callbacks == null) {
            _callbacks = new java.util.LinkedHashMap<>();
        }
        _callbacks.put(key, callback);
        return this;
    }

    @Override
    public void removeCallback(String key) {
        if (_callbacks != null) {
            _callbacks.remove(key);
        }
    }

}
