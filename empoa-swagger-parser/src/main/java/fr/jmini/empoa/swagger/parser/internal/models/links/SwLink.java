package fr.jmini.empoa.swagger.parser.internal.models.links;

import org.eclipse.microprofile.openapi.models.links.Link;

public class SwLink implements Link {

    private io.swagger.v3.oas.models.links.Link _swLink;

    public SwLink() {
        _swLink = new io.swagger.v3.oas.models.links.Link();
    }

    public SwLink(io.swagger.v3.oas.models.links.Link _swLink) {
        this._swLink = _swLink;
    }

    public io.swagger.v3.oas.models.links.Link getSw() {
        return _swLink;
    }

    @Override
    public String getRef() {
        return _swLink.get$ref();
    }

    @Override
    public void setRef(String ref) {
        _swLink.set$ref(ref);
    }

    @Override
    public java.util.Map<String, Object> getExtensions() {
        java.util.Map<String, Object> result = _swLink.getExtensions();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        _swLink.setExtensions(null);
        if (extensions != null) {
            if (extensions.isEmpty()) {
                _swLink.setExtensions(new java.util.LinkedHashMap<>());
            } else {
                for (java.util.Map.Entry<String, Object> e : extensions.entrySet()) {
                    this.addExtension(e.getKey(), e.getValue());
                }
            }
        }
    }

    @Override
    public Link addExtension(String key, Object object) {
        _swLink.addExtension(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
        if (getExtensions() != null) {
            _swLink.getExtensions()
                    .remove(key);
        }
    }

    private fr.jmini.empoa.swagger.parser.internal.models.servers.SwServer _server;

    private void initServer() {
        if (_swLink.getServer() == null) {
            _server = null;
        } else if (_server == null) {
            _server = new fr.jmini.empoa.swagger.parser.internal.models.servers.SwServer(_swLink.getServer());
        }
    }

    @Override
    public org.eclipse.microprofile.openapi.models.servers.Server getServer() {
        initServer();
        return _server;
    }

    @Override
    public void setServer(org.eclipse.microprofile.openapi.models.servers.Server server) {
        if (server != null) {
            if (!(server instanceof fr.jmini.empoa.swagger.parser.internal.models.servers.SwServer)) {
                throw new IllegalArgumentException("Unexpected type: " + server);
            }
            _server = (fr.jmini.empoa.swagger.parser.internal.models.servers.SwServer) server;
            _swLink.setServer(_server.getSw());
        } else {
            _server = null;
            _swLink.setServer(null);
        }
    }

    @Override
    public String getOperationRef() {
        return _swLink.getOperationRef();
    }

    @Override
    public void setOperationRef(String operationRef) {
        _swLink.setOperationRef(operationRef);
    }

    @Override
    public Object getRequestBody() {
        return _swLink.getRequestBody();
    }

    @Override
    public void setRequestBody(Object requestBody) {
        _swLink.setRequestBody(requestBody);
    }

    @Override
    public String getOperationId() {
        return _swLink.getOperationId();
    }

    @Override
    public void setOperationId(String operationId) {
        _swLink.setOperationId(operationId);
    }

    @Override
    public java.util.Map<String, Object> getParameters() {
        java.util.Map<String, Object> result = _swLink.getParameters();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setParameters(java.util.Map<String, Object> parameters) {
        _swLink.setParameters(null);
        if (parameters != null) {
            if (parameters.isEmpty()) {
                _swLink.setParameters(new java.util.LinkedHashMap<>());
            } else {
                for (java.util.Map.Entry<String, Object> e : parameters.entrySet()) {
                    this.addParameter(e.getKey(), e.getValue());
                }
            }
        }
    }

    @Override
    public Link addParameter(String key, Object object) {
        _swLink.addParameter(key, object);
        return this;
    }

    @Override
    public void removeParameter(String key) {
        if (getParameters() != null) {
            _swLink.getParameters()
                    .remove(key);
        }
    }

    @Override
    public String getDescription() {
        return _swLink.getDescription();
    }

    @Override
    public void setDescription(String description) {
        _swLink.setDescription(description);
    }

}
