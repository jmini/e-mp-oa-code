package fr.jmini.empoa.simple.internal.models.security;

import org.eclipse.microprofile.openapi.models.security.Scopes;

public class ScopesImpl extends java.util.LinkedHashMap<String, String> implements Scopes {
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
    public Scopes addExtension(String key, Object object) {
        if (object == null) {
            throw new IllegalArgumentException("Null value for key '" + key + "' is not allowed");
        } else {
            if (_extensions == null) {
                _extensions = new java.util.LinkedHashMap<>();
            }
            _extensions.put(key, object);
        }
        return this;
    }

    @Override
    public void removeExtension(String key) {
        if (_extensions != null) {
            _extensions.remove(key);
        }
    }

    @Override
    public Scopes addScope(String key, String string) {
        if (string == null) {
            throw new IllegalArgumentException("Null value for key '" + key + "' is not allowed");
        }
        this.put(key, string);
        return this;
    }

    @Override
    public void removeScope(String key) {
        this.remove(key);
    }

    @Override
    public java.util.Map<String, String> getScopes() {
        return java.util.Collections.unmodifiableMap(this);
    }

    @Override
    public void setScopes(java.util.Map<String, String> items) {
        this.clear();
        if (items != null) {
            items.entrySet()
                    .stream()
                    .forEach(e -> this.put(e.getKey(), e.getValue()));
        }
    }

    @Override
    public boolean hasScope(String key) {
        return this.containsKey(key);
    }

    @Override
    public String getScope(String key) {
        return this.get(key);
    }

}
