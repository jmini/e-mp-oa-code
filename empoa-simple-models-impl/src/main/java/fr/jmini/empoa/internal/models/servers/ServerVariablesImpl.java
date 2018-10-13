package fr.jmini.empoa.internal.models.servers;

import org.eclipse.microprofile.openapi.models.servers.ServerVariables;

public class ServerVariablesImpl extends java.util.LinkedHashMap<String, org.eclipse.microprofile.openapi.models.servers.ServerVariable> implements ServerVariables {
    private static final long serialVersionUID = 1L;

    private java.util.Map<String, Object> _extensions;

    @Override
    public java.util.Map<String, Object> getExtensions() {
        if (_extensions == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(_extensions);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        if (extensions == null) {
            _extensions = null;
        } else {
            _extensions = new java.util.LinkedHashMap<>();
            _extensions.putAll(extensions);
        }
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
    public void removeExtension(String key) {
        if (_extensions != null) {
            _extensions.remove(key);
        }
    }

    @Override
    public ServerVariables addServerVariable(String key, org.eclipse.microprofile.openapi.models.servers.ServerVariable serverVariable) {
        this.put(key, serverVariable);
        return this;
    }

    @Override
    public void removeServerVariable(String key) {
        this.remove(key);
    }

    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.servers.ServerVariable> getServerVariables() {
        return java.util.Collections.unmodifiableMap(this);
    }

    @Override
    public void setServerVariables(java.util.Map<String, org.eclipse.microprofile.openapi.models.servers.ServerVariable> items) {
        this.clear();
        if (items != null) {
            items.entrySet()
                    .stream()
                    .forEach(e -> this.put(e.getKey(), e.getValue()));
        }
    }

    @Override
    public boolean hasServerVariable(String key) {
        return this.containsKey(key);
    }

    @Override
    public org.eclipse.microprofile.openapi.models.servers.ServerVariable getServerVariable(String key) {
        return this.get(key);
    }

}
