package fr.jmini.empoa.internal.models;

import org.eclipse.microprofile.openapi.models.Paths;

public class PathsImpl implements Paths {

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
    public Paths addExtension(String key, Object object) {
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

    private java.util.Map<String, org.eclipse.microprofile.openapi.models.PathItem> _pathItems;

    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.PathItem> getPathItems() {
        if (_pathItems == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(_pathItems);
    }

    @Override
    public void setPathItems(java.util.Map<String, org.eclipse.microprofile.openapi.models.PathItem> pathItems) {
        if (pathItems == null) {
            _pathItems = null;
        } else {
            _pathItems = new java.util.LinkedHashMap<>();
            _pathItems.putAll(pathItems);
        }
    }

    @Override
    public Paths addPathItem(String key, org.eclipse.microprofile.openapi.models.PathItem pathItem) {
        if (_pathItems == null) {
            _pathItems = new java.util.LinkedHashMap<>();
        }
        _pathItems.put(key, pathItem);
        return this;
    }

    @Override
    public void removePathItem(String key) {
        if (_pathItems != null) {
            _pathItems.remove(key);
        }
    }

}
