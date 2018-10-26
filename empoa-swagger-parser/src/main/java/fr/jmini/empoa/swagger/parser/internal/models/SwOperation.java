package fr.jmini.empoa.swagger.parser.internal.models;

import org.eclipse.microprofile.openapi.models.Operation;

public class SwOperation implements Operation {

    private io.swagger.v3.oas.models.Operation swOperation;

    public SwOperation() {
        swOperation = new io.swagger.v3.oas.models.Operation();
    }

    public SwOperation(io.swagger.v3.oas.models.Operation swOperation) {
        this.swOperation = swOperation;
    }

    @Override
    public java.util.Map<String, Object> getExtensions() {
        java.util.Map<String, Object> result = swOperation.getExtensions();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        swOperation.setExtensions(null);
        if (extensions != null) {
            for (java.util.Map.Entry<String, Object> e : extensions.entrySet()) {
                this.addExtension(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Operation addExtension(String key, Object object) {
        swOperation.addExtension(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
    }

    @Override
    public java.util.List<String> getTags() {
        java.util.List<String> result = swOperation.getTags();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableList(result);
    }

    @Override
    public void setTags(java.util.List<String> tags) {
        swOperation.setTags(null);
        if (tags != null) {
            for (String e : tags) {
                this.addTag(e);
            }
        }
    }

    @Override
    public Operation addTag(String string) {
        swOperation.addTag(e);
        return this;
    }

    @Override
    public void removeTag(String string) {
    }

    @Override
    public String getSummary() {
        return swOperation.getSummary();
    }

    @Override
    public void setSummary(String summary) {
        swOperation.setSummary(summary);
    }

    @Override
    public String getDescription() {
        return swOperation.getDescription();
    }

    @Override
    public void setDescription(String description) {
        swOperation.setDescription(description);
    }

    @Override
    public org.eclipse.microprofile.openapi.models.ExternalDocumentation getExternalDocs() {
        return swOperation.getExternalDocs();
    }

    @Override
    public void setExternalDocs(org.eclipse.microprofile.openapi.models.ExternalDocumentation externalDocs) {
        swOperation.setExternalDocs(externalDocs);
    }

    @Override
    public String getOperationId() {
        return swOperation.getOperationId();
    }

    @Override
    public void setOperationId(String operationId) {
        swOperation.setOperationId(operationId);
    }

    @Override
    public java.util.List<org.eclipse.microprofile.openapi.models.parameters.Parameter> getParameters() {
        java.util.List<org.eclipse.microprofile.openapi.models.parameters.Parameter> result = swOperation.getParameters();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableList(result);
    }

    @Override
    public void setParameters(java.util.List<org.eclipse.microprofile.openapi.models.parameters.Parameter> parameters) {
        swOperation.setParameters(null);
        if (parameters != null) {
            for (org.eclipse.microprofile.openapi.models.parameters.Parameter e : parameters) {
                this.addParameter(e);
            }
        }
    }

    @Override
    public Operation addParameter(org.eclipse.microprofile.openapi.models.parameters.Parameter parameter) {
        swOperation.addParameter(e);
        return this;
    }

    @Override
    public void removeParameter(org.eclipse.microprofile.openapi.models.parameters.Parameter parameter) {
    }

    @Override
    public org.eclipse.microprofile.openapi.models.parameters.RequestBody getRequestBody() {
        return swOperation.getRequestBody();
    }

    @Override
    public void setRequestBody(org.eclipse.microprofile.openapi.models.parameters.RequestBody requestBody) {
        swOperation.setRequestBody(requestBody);
    }

    @Override
    public org.eclipse.microprofile.openapi.models.responses.APIResponses getResponses() {
        return swOperation.getResponses();
    }

    @Override
    public void setResponses(org.eclipse.microprofile.openapi.models.responses.APIResponses responses) {
        swOperation.setResponses(responses);
    }

    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.callbacks.Callback> getCallbacks() {
        java.util.Map<String, org.eclipse.microprofile.openapi.models.callbacks.Callback> result = swOperation.getCallbacks();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setCallbacks(java.util.Map<String, org.eclipse.microprofile.openapi.models.callbacks.Callback> callbacks) {
        swOperation.setCallbacks(null);
        if (callbacks != null) {
            for (java.util.Map.Entry<String, org.eclipse.microprofile.openapi.models.callbacks.Callback> e : callbacks.entrySet()) {
                this.addCallback(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Operation addCallback(String key, org.eclipse.microprofile.openapi.models.callbacks.Callback callback) {
        swOperation.addCallback(key, callback);
        return this;
    }

    @Override
    public void removeCallback(String key) {
    }

    @Override
    public Boolean getDeprecated() {
        return swOperation.getDeprecated();
    }

    @Override
    public void setDeprecated(Boolean deprecated) {
        swOperation.setDeprecated(deprecated);
    }

    @Override
    public java.util.List<org.eclipse.microprofile.openapi.models.security.SecurityRequirement> getSecurity() {
        java.util.List<org.eclipse.microprofile.openapi.models.security.SecurityRequirement> result = swOperation.getSecurity();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableList(result);
    }

    @Override
    public void setSecurity(java.util.List<org.eclipse.microprofile.openapi.models.security.SecurityRequirement> security) {
        swOperation.setSecurity(null);
        if (security != null) {
            for (org.eclipse.microprofile.openapi.models.security.SecurityRequirement e : security) {
                this.addSecurityRequirement(e);
            }
        }
    }

    @Override
    public Operation addSecurityRequirement(org.eclipse.microprofile.openapi.models.security.SecurityRequirement securityRequirement) {
        swOperation.addSecurityRequirement(e);
        return this;
    }

    @Override
    public void removeSecurityRequirement(org.eclipse.microprofile.openapi.models.security.SecurityRequirement securityRequirement) {
    }

    @Override
    public java.util.List<org.eclipse.microprofile.openapi.models.servers.Server> getServers() {
        java.util.List<org.eclipse.microprofile.openapi.models.servers.Server> result = swOperation.getServers();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableList(result);
    }

    @Override
    public void setServers(java.util.List<org.eclipse.microprofile.openapi.models.servers.Server> servers) {
        swOperation.setServers(null);
        if (servers != null) {
            for (org.eclipse.microprofile.openapi.models.servers.Server e : servers) {
                this.addServer(e);
            }
        }
    }

    @Override
    public Operation addServer(org.eclipse.microprofile.openapi.models.servers.Server server) {
        swOperation.addServer(e);
        return this;
    }

    @Override
    public void removeServer(org.eclipse.microprofile.openapi.models.servers.Server server) {
    }

}
