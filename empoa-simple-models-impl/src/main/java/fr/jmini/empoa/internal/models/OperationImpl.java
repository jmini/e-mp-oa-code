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
    public void addExtension(String key, Object object) {
        if (_extensions == null) {
            _extensions = new java.util.LinkedHashMap<>();
        }
        _extensions.put(key, object);
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
    public Operation tags(java.util.List<String> tags) {
        setTags(tags);
        return this;
    }

    @Override
    public Operation addTag(String string) {
        if (_tags == null) {
            _tags = new java.util.ArrayList<>();
        }
        _tags.add(string);
        return this;
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

    @Override
    public Operation summary(String summary) {
        setSummary(summary);
        return this;
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
    public Operation description(String description) {
        setDescription(description);
        return this;
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

    @Override
    public Operation externalDocs(org.eclipse.microprofile.openapi.models.ExternalDocumentation externalDocs) {
        setExternalDocs(externalDocs);
        return this;
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

    @Override
    public Operation operationId(String operationId) {
        setOperationId(operationId);
        return this;
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
    public Operation parameters(java.util.List<org.eclipse.microprofile.openapi.models.parameters.Parameter> parameters) {
        setParameters(parameters);
        return this;
    }

    @Override
    public Operation addParameter(org.eclipse.microprofile.openapi.models.parameters.Parameter parameter) {
        if (_parameters == null) {
            _parameters = new java.util.ArrayList<>();
        }
        _parameters.add(parameter);
        return this;
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

    @Override
    public Operation requestBody(org.eclipse.microprofile.openapi.models.parameters.RequestBody requestBody) {
        setRequestBody(requestBody);
        return this;
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

    @Override
    public Operation responses(org.eclipse.microprofile.openapi.models.responses.APIResponses responses) {
        setResponses(responses);
        return this;
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
    public Operation callbacks(java.util.Map<String, org.eclipse.microprofile.openapi.models.callbacks.Callback> callbacks) {
        setCallbacks(callbacks);
        return this;
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

    @Override
    public Operation deprecated(Boolean deprecated) {
        setDeprecated(deprecated);
        return this;
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
    public Operation security(java.util.List<org.eclipse.microprofile.openapi.models.security.SecurityRequirement> security) {
        setSecurity(security);
        return this;
    }

    @Override
    public Operation addSecurityRequirement(org.eclipse.microprofile.openapi.models.security.SecurityRequirement securityRequirement) {
        if (_security == null) {
            _security = new java.util.ArrayList<>();
        }
        _security.add(securityRequirement);
        return this;
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
    public Operation servers(java.util.List<org.eclipse.microprofile.openapi.models.servers.Server> servers) {
        setServers(servers);
        return this;
    }

    @Override
    public Operation addServer(org.eclipse.microprofile.openapi.models.servers.Server server) {
        if (_servers == null) {
            _servers = new java.util.ArrayList<>();
        }
        _servers.add(server);
        return this;
    }

}
