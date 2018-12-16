package fr.jmini.empoa.simple.internal.models.security;

import org.eclipse.microprofile.openapi.models.security.Scopes;

public class ScopesImpl implements Scopes {

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
    public Scopes addExtension(String key, Object object) {
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

    private java.util.Map<String, String> _scopes;

    @Override
    public java.util.Map<String, String> getScopes() {
        if (_scopes == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(_scopes);
    }

    @Override
    public void setScopes(java.util.Map<String, String> scopes) {
        if (scopes == null) {
            _scopes = null;
        } else {
            _scopes = new java.util.LinkedHashMap<>();
            _scopes.putAll(scopes);
        }
    }

    @Override
    public Scopes addScope(String key, String string) {
        if (_scopes == null) {
            _scopes = new java.util.LinkedHashMap<>();
        }
        _scopes.put(key, string);
        return this;
    }

    @Override
    public void removeScope(String key) {
        if (_scopes != null) {
            _scopes.remove(key);
        }
    }

}
