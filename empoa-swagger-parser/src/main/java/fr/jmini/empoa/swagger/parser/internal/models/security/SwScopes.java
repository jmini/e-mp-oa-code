package fr.jmini.empoa.swagger.parser.internal.models.security;

import org.eclipse.microprofile.openapi.models.security.Scopes;

public class SwScopes implements Scopes {

    private io.swagger.v3.oas.models.security.Scopes _swScopes;

    public SwScopes() {
        _swScopes = new io.swagger.v3.oas.models.security.Scopes();
    }

    public SwScopes(io.swagger.v3.oas.models.security.Scopes _swScopes) {
        this._swScopes = _swScopes;
    }

    public io.swagger.v3.oas.models.security.Scopes getSw() {
        return _swScopes;
    }

    @Override
    public java.util.Map<String, Object> getExtensions() {
        java.util.Map<String, Object> result = _swScopes.getExtensions();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        _swScopes.setExtensions(null);
        if (extensions != null) {
            for (java.util.Map.Entry<String, Object> e : extensions.entrySet()) {
                this.addExtension(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Scopes addExtension(String key, Object object) {
        _swScopes.addExtension(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
        if (getExtensions() != null) {
            _swScopes.getExtensions().remove(key);
        }
    }

    @Override
    public java.util.Map<String, String> getScopes() {
        java.util.Map<String, String> result = _swScopes;
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setScopes(java.util.Map<String, String> scopes) {
        _swScopes.clear();
        if (scopes != null) {
            for (java.util.Map.Entry<String, String> e : scopes.entrySet()) {
                this.addScope(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Scopes addScope(String key, String string) {
        _swScopes.put(key, string);
        return this;
    }

    @Override
    public void removeScope(String key) {
        if (getScopes() != null) {
            _swScopes.remove(key);
        }
    }

}
