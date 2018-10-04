package fr.jmini.empoa.internal.models;

import org.eclipse.microprofile.openapi.models.Operation;

public class OperationImpl implements Operation {

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
    public Operation addExtension(String key, Object object) {
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

    private java.util.List<String> _tags;

    @Override
    public java.util.List<String> getTags() {
        return _tags;
    }

    @Override
    public void setTags(java.util.List<String> tags) {
        _tags = tags;
    }

    @Override
    public Operation addTag(String string) {
        if (_tags == null) {
            _tags = new java.util.ArrayList<>();
        }
        _tags.add(string);
        return this;
    }

    @Override
    public void removeTag(String string) {
        if (_tags != null) {
            _tags.remove(string);
        }
    }

    private String _summary;

    @Override
    public String getSummary() {
        return _summary;
    }

    @Override
    public void setSummary(String summary) {
        _summary = summary;
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

    private org.eclipse.microprofile.openapi.models.ExternalDocumentation _externalDocs;

    @Override
    public org.eclipse.microprofile.openapi.models.ExternalDocumentation getExternalDocs() {
        return _externalDocs;
    }

    @Override
    public void setExternalDocs(org.eclipse.microprofile.openapi.models.ExternalDocumentation externalDocs) {
        _externalDocs = externalDocs;
    }

    private String _operationId;

    @Override
    public String getOperationId() {
        return _operationId;
    }

    @Override
    public void setOperationId(String operationId) {
        _operationId = operationId;
    }

    private java.util.List<org.eclipse.microprofile.openapi.models.parameters.Parameter> _parameters;

    @Override
    public java.util.List<org.eclipse.microprofile.openapi.models.parameters.Parameter> getParameters() {
        return _parameters;
    }

    @Override
    public void setParameters(java.util.List<org.eclipse.microprofile.openapi.models.parameters.Parameter> parameters) {
        _parameters = parameters;
    }

    @Override
    public Operation addParameter(org.eclipse.microprofile.openapi.models.parameters.Parameter parameter) {
        if (_parameters == null) {
            _parameters = new java.util.ArrayList<>();
        }
        _parameters.add(parameter);
        return this;
    }

    @Override
    public void removeParameter(org.eclipse.microprofile.openapi.models.parameters.Parameter parameter) {
        if (_parameters != null) {
            _parameters.remove(parameter);
        }
    }

    private org.eclipse.microprofile.openapi.models.parameters.RequestBody _requestBody;

    @Override
    public org.eclipse.microprofile.openapi.models.parameters.RequestBody getRequestBody() {
        return _requestBody;
    }

    @Override
    public void setRequestBody(org.eclipse.microprofile.openapi.models.parameters.RequestBody requestBody) {
        _requestBody = requestBody;
    }

    private org.eclipse.microprofile.openapi.models.responses.APIResponses _responses;

    @Override
    public org.eclipse.microprofile.openapi.models.responses.APIResponses getResponses() {
        return _responses;
    }

    @Override
    public void setResponses(org.eclipse.microprofile.openapi.models.responses.APIResponses responses) {
        _responses = responses;
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
    public Operation addCallback(String key, org.eclipse.microprofile.openapi.models.callbacks.Callback callback) {
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

    private Boolean _deprecated;

    @Override
    public Boolean getDeprecated() {
        return _deprecated;
    }

    @Override
    public void setDeprecated(Boolean deprecated) {
        _deprecated = deprecated;
    }

    private java.util.List<org.eclipse.microprofile.openapi.models.security.SecurityRequirement> _security;

    @Override
    public java.util.List<org.eclipse.microprofile.openapi.models.security.SecurityRequirement> getSecurity() {
        return _security;
    }

    @Override
    public void setSecurity(java.util.List<org.eclipse.microprofile.openapi.models.security.SecurityRequirement> security) {
        _security = security;
    }

    @Override
    public Operation addSecurityRequirement(org.eclipse.microprofile.openapi.models.security.SecurityRequirement securityRequirement) {
        if (_security == null) {
            _security = new java.util.ArrayList<>();
        }
        _security.add(securityRequirement);
        return this;
    }

    @Override
    public void removeSecurityRequirement(org.eclipse.microprofile.openapi.models.security.SecurityRequirement securityRequirement) {
        if (_security != null) {
            _security.remove(securityRequirement);
        }
    }

    private java.util.List<org.eclipse.microprofile.openapi.models.servers.Server> _servers;

    @Override
    public java.util.List<org.eclipse.microprofile.openapi.models.servers.Server> getServers() {
        return _servers;
    }

    @Override
    public void setServers(java.util.List<org.eclipse.microprofile.openapi.models.servers.Server> servers) {
        _servers = servers;
    }

    @Override
    public Operation addServer(org.eclipse.microprofile.openapi.models.servers.Server server) {
        if (_servers == null) {
            _servers = new java.util.ArrayList<>();
        }
        _servers.add(server);
        return this;
    }

    @Override
    public void removeServer(org.eclipse.microprofile.openapi.models.servers.Server server) {
        if (_servers != null) {
            _servers.remove(server);
        }
    }

}
