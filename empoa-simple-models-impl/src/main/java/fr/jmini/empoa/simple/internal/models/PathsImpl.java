package fr.jmini.empoa.simple.internal.models;

import org.eclipse.microprofile.openapi.models.Paths;

public class PathsImpl extends java.util.LinkedHashMap<String, org.eclipse.microprofile.openapi.models.PathItem> implements Paths {
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
    public Paths addPathItem(String key, org.eclipse.microprofile.openapi.models.PathItem pathItem) {
        this.put(key, pathItem);
        return this;
    }

}
