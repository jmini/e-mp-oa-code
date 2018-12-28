package fr.jmini.empoa.swagger.parser.internal.models;

import org.eclipse.microprofile.openapi.models.Paths;

public class SwPaths implements Paths {

    private io.swagger.v3.oas.models.Paths _swPaths;

    public SwPaths() {
        _swPaths = new io.swagger.v3.oas.models.Paths();
    }

    public SwPaths(io.swagger.v3.oas.models.Paths _swPaths) {
        this._swPaths = _swPaths;
    }

    public io.swagger.v3.oas.models.Paths getSw() {
        return _swPaths;
    }

    @Override
    public java.util.Map<String, Object> getExtensions() {
        java.util.Map<String, Object> result = _swPaths.getExtensions();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        _swPaths.setExtensions(null);
        if (extensions != null) {
            if (extensions.isEmpty()) {
                _swPaths.setExtensions(new java.util.LinkedHashMap<>());
            } else {
                for (java.util.Map.Entry<String, Object> e : extensions.entrySet()) {
                    this.addExtension(e.getKey(), e.getValue());
                }
            }
        }
    }

    @Override
    public Paths addExtension(String key, Object object) {
        _swPaths.addExtension(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
        if (getExtensions() != null) {
            _swPaths.getExtensions()
                    .remove(key);
        }
    }

    private java.util.Map<String, fr.jmini.empoa.swagger.parser.internal.models.SwPathItem> _pathItems;

    private void initPathItems() {
        if (_swPaths == null) {
            _pathItems = null;
        } else if (_pathItems == null) {
            _pathItems = _swPaths
                    .entrySet()
                    .stream()
                    .collect(java.util.stream.Collectors.toMap(
                            java.util.Map.Entry::getKey,
                            e -> new fr.jmini.empoa.swagger.parser.internal.models.SwPathItem(e.getValue()),
                            (k1, k2) -> {
                                throw new IllegalStateException(String.format("Duplicate key %s", k1));
                            },
                            () -> new java.util.LinkedHashMap<String, fr.jmini.empoa.swagger.parser.internal.models.SwPathItem>()));
        }
    }

    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.PathItem> getPathItems() {
        initPathItems();
        if (_pathItems == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(_pathItems);
    }

    @Override
    public void setPathItems(java.util.Map<String, org.eclipse.microprofile.openapi.models.PathItem> pathItems) {
        _swPaths.clear();
        if (pathItems != null) {
            if (pathItems.isEmpty()) {
                _pathItems = new java.util.LinkedHashMap<>();
            } else {
                for (java.util.Map.Entry<String, org.eclipse.microprofile.openapi.models.PathItem> e : pathItems.entrySet()) {
                    this.addPathItem(e.getKey(), e.getValue());
                }
            }
        }
    }

    @Override
    public Paths addPathItem(String key, org.eclipse.microprofile.openapi.models.PathItem pathItem) {
        if (!(pathItem instanceof fr.jmini.empoa.swagger.parser.internal.models.SwPathItem)) {
            throw new IllegalArgumentException("Unexpected type: " + pathItem);
        }
        fr.jmini.empoa.swagger.parser.internal.models.SwPathItem value = (fr.jmini.empoa.swagger.parser.internal.models.SwPathItem) pathItem;
        initPathItems();
        if (_pathItems == null) {
            _pathItems = new java.util.LinkedHashMap<>();
        }
        _pathItems.put(key, value);
        _swPaths.put(key, value.getSw());
        return this;
    }

    @Override
    public void removePathItem(String key) {
        initPathItems();
        if (_pathItems != null) {
            _pathItems.remove(key);
            _swPaths.remove(key);
        }
    }

}
