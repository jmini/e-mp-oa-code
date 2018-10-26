package fr.jmini.empoa.swagger.parser.internal.models.links;

import org.eclipse.microprofile.openapi.models.links.Link;

public class SwLink implements Link {

    private io.swagger.v3.oas.models.links.Link swLink;

    public SwLink() {
        swLink = new io.swagger.v3.oas.models.links.Link();
    }

    public SwLink(io.swagger.v3.oas.models.links.Link swLink) {
        this.swLink = swLink;
    }

    @Override
    public String getRef() {
        return swLink.getRef();
    }

    @Override
    public void setRef(String ref) {
    }

    @Override
    public java.util.Map<String, Object> getExtensions() {
        java.util.Map<String, Object> result = swLink.getExtensions();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        swLink.setExtensions(null);
        if (extensions != null) {
            for (java.util.Map.Entry<String, Object> e : extensions.entrySet()) {
                this.addExtension(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Link addExtension(String key, Object object) {
        swLink.addExtension(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
    }

    @Override
    public org.eclipse.microprofile.openapi.models.servers.Server getServer() {
        return swLink.getServer();
    }

    @Override
    public void setServer(org.eclipse.microprofile.openapi.models.servers.Server server) {
        swLink.setServer(server);
    }

    @Override
    public String getOperationRef() {
        return swLink.getOperationRef();
    }

    @Override
    public void setOperationRef(String operationRef) {
        swLink.setOperationRef(operationRef);
    }

    @Override
    public Object getRequestBody() {
        return swLink.getRequestBody();
    }

    @Override
    public void setRequestBody(Object requestBody) {
        swLink.setRequestBody(requestBody);
    }

    @Override
    public String getOperationId() {
        return swLink.getOperationId();
    }

    @Override
    public void setOperationId(String operationId) {
        swLink.setOperationId(operationId);
    }

    @Override
    public java.util.Map<String, Object> getParameters() {
        java.util.Map<String, Object> result = swLink.getParameters();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setParameters(java.util.Map<String, Object> parameters) {
        swLink.setParameters(null);
        if (parameters != null) {
            for (java.util.Map.Entry<String, Object> e : parameters.entrySet()) {
                this.addParameter(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Link addParameter(String key, Object object) {
        swLink.addParameter(key, object);
        return this;
    }

    @Override
    public void removeParameter(String key) {
    }

    @Override
    public String getDescription() {
        return swLink.getDescription();
    }

    @Override
    public void setDescription(String description) {
        swLink.setDescription(description);
    }

}
