package fr.jmini.empoa.internal.models.servers;

import org.eclipse.microprofile.openapi.models.servers.Server;

public class ServerImpl implements Server {

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

    private String _url;

    @Override
    public String getUrl() {
        return _url;
    }

    @Override
    public void setUrl(String url) {
        _url = url;
    }

    @Override
    public Server url(String url) {
        setUrl(url);
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
    public Server description(String description) {
        setDescription(description);
        return this;
    }

    private org.eclipse.microprofile.openapi.models.servers.ServerVariables _variables;

    @Override
    public org.eclipse.microprofile.openapi.models.servers.ServerVariables getVariables() {
        return _variables;
    }

    @Override
    public void setVariables(org.eclipse.microprofile.openapi.models.servers.ServerVariables variables) {
        _variables = variables;
    }

    @Override
    public Server variables(org.eclipse.microprofile.openapi.models.servers.ServerVariables variables) {
        setVariables(variables);
        return this;
    }

}
