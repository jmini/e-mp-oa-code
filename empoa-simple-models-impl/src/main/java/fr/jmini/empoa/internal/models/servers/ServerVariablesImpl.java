package fr.jmini.empoa.internal.models.servers;

import org.eclipse.microprofile.openapi.models.servers.ServerVariables;

public class ServerVariablesImpl extends java.util.LinkedHashMap<String, org.eclipse.microprofile.openapi.models.servers.ServerVariable> implements ServerVariables {
    private static final long serialVersionUID = 1L;

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
    public ServerVariables addExtension(String key, Object object) {
        if (_extensions == null) {
            _extensions = new java.util.LinkedHashMap<>();
        }
        _extensions.put(key, object);
        return this;
    }

    @Override
    public ServerVariables addServerVariable(String key, org.eclipse.microprofile.openapi.models.servers.ServerVariable serverVariable) {
        this.put(key, serverVariable);
        return this;
    }

}
