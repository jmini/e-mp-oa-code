package fr.jmini.empoa.simple.internal.models.security;

import org.eclipse.microprofile.openapi.models.security.Scopes;

public class ScopesImpl extends java.util.LinkedHashMap<String, String> implements Scopes {
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
    public void addExtension(String key, Object object) {
        if (_extensions == null) {
            _extensions = new java.util.LinkedHashMap<>();
        }
        _extensions.put(key, object);
    }

    @Override
    public Scopes addScope(String key, String string) {
        this.put(key, string);
        return this;
    }

}
