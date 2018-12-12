package fr.jmini.empoa.swagger.parser.internal.models.servers;

import org.eclipse.microprofile.openapi.models.servers.ServerVariables;

public class SwServerVariables implements ServerVariables {

    private io.swagger.v3.oas.models.servers.ServerVariables _swServerVariables;

    public SwServerVariables() {
        _swServerVariables = new io.swagger.v3.oas.models.servers.ServerVariables();
    }

    public SwServerVariables(io.swagger.v3.oas.models.servers.ServerVariables _swServerVariables) {
        this._swServerVariables = _swServerVariables;
    }

    public io.swagger.v3.oas.models.servers.ServerVariables getSw() {
        return _swServerVariables;
    }

    @Override
    public java.util.Map<String, Object> getExtensions() {
        java.util.Map<String, Object> result = _swServerVariables.getExtensions();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        _swServerVariables.setExtensions(null);
        if (extensions != null) {
            for (java.util.Map.Entry<String, Object> e : extensions.entrySet()) {
                this.addExtension(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public ServerVariables addExtension(String key, Object object) {
        _swServerVariables.addExtension(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
        if (getExtensions() != null) {
            _swServerVariables.getExtensions()
                    .remove(key);
        }
    }

    private java.util.Map<String, fr.jmini.empoa.swagger.parser.internal.models.servers.SwServerVariable> _serverVariables;

    private void initServerVariables() {
        if (_swServerVariables == null) {
            _serverVariables = null;
        } else {
            _swServerVariables
                    .entrySet()
                    .stream()
                    .collect(java.util.stream.Collectors.toMap(
                            java.util.Map.Entry::getKey,
                            e -> new fr.jmini.empoa.swagger.parser.internal.models.servers.SwServerVariable(e.getValue()),
                            (k1, k2) -> {
                                throw new IllegalStateException(String.format("Duplicate key %s", k1));
                            },
                            () -> new java.util.LinkedHashMap()));
        }
    }

    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.servers.ServerVariable> getServerVariables() {
        initServerVariables();
        if (_serverVariables == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(_serverVariables);
    }

    @Override
    public void setServerVariables(java.util.Map<String, org.eclipse.microprofile.openapi.models.servers.ServerVariable> serverVariables) {
        _swServerVariables.clear();
        if (serverVariables != null) {
            for (java.util.Map.Entry<String, org.eclipse.microprofile.openapi.models.servers.ServerVariable> e : serverVariables.entrySet()) {
                this.addServerVariable(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public ServerVariables addServerVariable(String key, org.eclipse.microprofile.openapi.models.servers.ServerVariable serverVariable) {
        if (!(serverVariable instanceof fr.jmini.empoa.swagger.parser.internal.models.servers.SwServerVariable)) {
            throw new IllegalArgumentException("Unexpected type: " + serverVariable);
        }
        fr.jmini.empoa.swagger.parser.internal.models.servers.SwServerVariable value = (fr.jmini.empoa.swagger.parser.internal.models.servers.SwServerVariable) serverVariable;
        initServerVariables();
        if (_serverVariables == null) {
            _serverVariables = new java.util.LinkedHashMap<>();
        }
        _serverVariables.put(key, value);
        _swServerVariables.put(key, value.getSw());
        return this;
    }

    @Override
    public void removeServerVariable(String key) {
        initServerVariables();
        if (_serverVariables != null) {
            _serverVariables.remove(key);
            _swServerVariables.remove(key);
        }
    }

}
