package fr.jmini.empoa.swagger.parser.internal.models.servers;

import org.eclipse.microprofile.openapi.models.servers.Server;

public class SwServer implements Server {

    private io.swagger.v3.oas.models.servers.Server _swServer;

    public SwServer() {
        _swServer = new io.swagger.v3.oas.models.servers.Server();
    }

    public SwServer(io.swagger.v3.oas.models.servers.Server _swServer) {
        this._swServer = _swServer;
    }

    public io.swagger.v3.oas.models.servers.Server getSw() {
        return _swServer;
    }

    @Override
    public java.util.Map<String, Object> getExtensions() {
        java.util.Map<String, Object> result = _swServer.getExtensions();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        _swServer.setExtensions(null);
        if (extensions != null) {
            for (java.util.Map.Entry<String, Object> e : extensions.entrySet()) {
                this.addExtension(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Server addExtension(String key, Object object) {
        _swServer.addExtension(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
        if (getExtensions() != null) {
            _swServer.getExtensions().remove(key);
        }
    }

    @Override
    public String getUrl() {
        return _swServer.getUrl();
    }

    @Override
    public void setUrl(String url) {
        _swServer.setUrl(url);
    }

    @Override
    public String getDescription() {
        return _swServer.getDescription();
    }

    @Override
    public void setDescription(String description) {
        _swServer.setDescription(description);
    }

    private fr.jmini.empoa.swagger.parser.internal.models.servers.SwServerVariables _variables;

    private void initVariables() {
        if (_swServer.getVariables() == null) {
            _variables = null;
        } else {
            _variables = new fr.jmini.empoa.swagger.parser.internal.models.servers.SwServerVariables(_swServer.getVariables());
        }
    }
    @Override
    public org.eclipse.microprofile.openapi.models.servers.ServerVariables getVariables() {
        initVariables();
        return _variables;
    }

    @Override
    public void setVariables(org.eclipse.microprofile.openapi.models.servers.ServerVariables variables) {
        if (variables != null) {
            if (!(variables instanceof fr.jmini.empoa.swagger.parser.internal.models.servers.SwServerVariables)) {
                throw new IllegalArgumentException("Unexpected type: " + variables);
            }
            _variables = (fr.jmini.empoa.swagger.parser.internal.models.servers.SwServerVariables) variables;
            _swServer.setVariables(_variables.getSw());
        } else {
            _variables = null;
            _swServer.setVariables(null);
        }
    }

}
