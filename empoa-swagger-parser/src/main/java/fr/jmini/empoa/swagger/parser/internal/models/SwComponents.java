package fr.jmini.empoa.swagger.parser.internal.models;

import org.eclipse.microprofile.openapi.models.Components;

public class SwComponents implements Components {

    private io.swagger.v3.oas.models.Components swComponents;

    public SwComponents() {
        swComponents = new io.swagger.v3.oas.models.Components();
    }

    public SwComponents(io.swagger.v3.oas.models.Components swComponents) {
        this.swComponents = swComponents;
    }

    @Override
    public java.util.Map<String, Object> getExtensions() {
        java.util.Map<String, Object> result = swComponents.getExtensions();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        swComponents.setExtensions(null);
        if (extensions != null) {
            for (java.util.Map.Entry<String, Object> e : extensions.entrySet()) {
                this.addExtension(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Components addExtension(String key, Object object) {
        swComponents.addExtension(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
    }

    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.media.Schema> getSchemas() {
        java.util.Map<String, org.eclipse.microprofile.openapi.models.media.Schema> result = swComponents.getSchemas();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setSchemas(java.util.Map<String, org.eclipse.microprofile.openapi.models.media.Schema> schemas) {
        swComponents.setSchemas(null);
        if (schemas != null) {
            for (java.util.Map.Entry<String, org.eclipse.microprofile.openapi.models.media.Schema> e : schemas.entrySet()) {
                this.addSchema(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Components addSchema(String key, org.eclipse.microprofile.openapi.models.media.Schema schema) {
        swComponents.addSchema(key, schema);
        return this;
    }

    @Override
    public void removeSchema(String key) {
    }

    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.responses.APIResponse> getResponses() {
        java.util.Map<String, org.eclipse.microprofile.openapi.models.responses.APIResponse> result = swComponents.getResponses();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setResponses(java.util.Map<String, org.eclipse.microprofile.openapi.models.responses.APIResponse> responses) {
        swComponents.setResponses(null);
        if (responses != null) {
            for (java.util.Map.Entry<String, org.eclipse.microprofile.openapi.models.responses.APIResponse> e : responses.entrySet()) {
                this.addResponse(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Components addResponse(String key, org.eclipse.microprofile.openapi.models.responses.APIResponse aPIResponse) {
        swComponents.addResponse(key, aPIResponse);
        return this;
    }

    @Override
    public void removeResponse(String key) {
    }

    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.parameters.Parameter> getParameters() {
        java.util.Map<String, org.eclipse.microprofile.openapi.models.parameters.Parameter> result = swComponents.getParameters();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setParameters(java.util.Map<String, org.eclipse.microprofile.openapi.models.parameters.Parameter> parameters) {
        swComponents.setParameters(null);
        if (parameters != null) {
            for (java.util.Map.Entry<String, org.eclipse.microprofile.openapi.models.parameters.Parameter> e : parameters.entrySet()) {
                this.addParameter(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Components addParameter(String key, org.eclipse.microprofile.openapi.models.parameters.Parameter parameter) {
        swComponents.addParameter(key, parameter);
        return this;
    }

    @Override
    public void removeParameter(String key) {
    }

    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.examples.Example> getExamples() {
        java.util.Map<String, org.eclipse.microprofile.openapi.models.examples.Example> result = swComponents.getExamples();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExamples(java.util.Map<String, org.eclipse.microprofile.openapi.models.examples.Example> examples) {
        swComponents.setExamples(null);
        if (examples != null) {
            for (java.util.Map.Entry<String, org.eclipse.microprofile.openapi.models.examples.Example> e : examples.entrySet()) {
                this.addExample(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Components addExample(String key, org.eclipse.microprofile.openapi.models.examples.Example example) {
        swComponents.addExample(key, example);
        return this;
    }

    @Override
    public void removeExample(String key) {
    }

    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.parameters.RequestBody> getRequestBodies() {
        java.util.Map<String, org.eclipse.microprofile.openapi.models.parameters.RequestBody> result = swComponents.getRequestBodies();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setRequestBodies(java.util.Map<String, org.eclipse.microprofile.openapi.models.parameters.RequestBody> requestBodies) {
        swComponents.setRequestBodies(null);
        if (requestBodies != null) {
            for (java.util.Map.Entry<String, org.eclipse.microprofile.openapi.models.parameters.RequestBody> e : requestBodies.entrySet()) {
                this.addRequestBody(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Components addRequestBody(String key, org.eclipse.microprofile.openapi.models.parameters.RequestBody requestBody) {
        swComponents.addRequestBody(key, requestBody);
        return this;
    }

    @Override
    public void removeRequestBody(String key) {
    }

    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.headers.Header> getHeaders() {
        java.util.Map<String, org.eclipse.microprofile.openapi.models.headers.Header> result = swComponents.getHeaders();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setHeaders(java.util.Map<String, org.eclipse.microprofile.openapi.models.headers.Header> headers) {
        swComponents.setHeaders(null);
        if (headers != null) {
            for (java.util.Map.Entry<String, org.eclipse.microprofile.openapi.models.headers.Header> e : headers.entrySet()) {
                this.addHeader(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Components addHeader(String key, org.eclipse.microprofile.openapi.models.headers.Header header) {
        swComponents.addHeader(key, header);
        return this;
    }

    @Override
    public void removeHeader(String key) {
    }

    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.security.SecurityScheme> getSecuritySchemes() {
        java.util.Map<String, org.eclipse.microprofile.openapi.models.security.SecurityScheme> result = swComponents.getSecuritySchemes();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setSecuritySchemes(java.util.Map<String, org.eclipse.microprofile.openapi.models.security.SecurityScheme> securitySchemes) {
        swComponents.setSecuritySchemes(null);
        if (securitySchemes != null) {
            for (java.util.Map.Entry<String, org.eclipse.microprofile.openapi.models.security.SecurityScheme> e : securitySchemes.entrySet()) {
                this.addSecurityScheme(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Components addSecurityScheme(String key, org.eclipse.microprofile.openapi.models.security.SecurityScheme securityScheme) {
        swComponents.addSecurityScheme(key, securityScheme);
        return this;
    }

    @Override
    public void removeSecurityScheme(String key) {
    }

    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.links.Link> getLinks() {
        java.util.Map<String, org.eclipse.microprofile.openapi.models.links.Link> result = swComponents.getLinks();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setLinks(java.util.Map<String, org.eclipse.microprofile.openapi.models.links.Link> links) {
        swComponents.setLinks(null);
        if (links != null) {
            for (java.util.Map.Entry<String, org.eclipse.microprofile.openapi.models.links.Link> e : links.entrySet()) {
                this.addLink(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Components addLink(String key, org.eclipse.microprofile.openapi.models.links.Link link) {
        swComponents.addLink(key, link);
        return this;
    }

    @Override
    public void removeLink(String key) {
    }

    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.callbacks.Callback> getCallbacks() {
        java.util.Map<String, org.eclipse.microprofile.openapi.models.callbacks.Callback> result = swComponents.getCallbacks();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setCallbacks(java.util.Map<String, org.eclipse.microprofile.openapi.models.callbacks.Callback> callbacks) {
        swComponents.setCallbacks(null);
        if (callbacks != null) {
            for (java.util.Map.Entry<String, org.eclipse.microprofile.openapi.models.callbacks.Callback> e : callbacks.entrySet()) {
                this.addCallback(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Components addCallback(String key, org.eclipse.microprofile.openapi.models.callbacks.Callback callback) {
        swComponents.addCallback(key, callback);
        return this;
    }

    @Override
    public void removeCallback(String key) {
    }

}
