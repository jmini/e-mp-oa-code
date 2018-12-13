package fr.jmini.empoa.swagger.parser.internal.models.callbacks;

import org.eclipse.microprofile.openapi.models.callbacks.Callback;

public class SwCallback implements Callback {

    private io.swagger.v3.oas.models.callbacks.Callback _swCallback;

    public SwCallback() {
        _swCallback = new io.swagger.v3.oas.models.callbacks.Callback();
    }

    public SwCallback(io.swagger.v3.oas.models.callbacks.Callback _swCallback) {
        this._swCallback = _swCallback;
    }

    public io.swagger.v3.oas.models.callbacks.Callback getSw() {
        return _swCallback;
    }

    @Override
    public String getRef() {
        return _swCallback.get$ref();
    }

    @Override
    public void setRef(String ref) {
        _swCallback.set$ref(ref);
    }

    @Override
    public java.util.Map<String, Object> getExtensions() {
        java.util.Map<String, Object> result = _swCallback.getExtensions();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        _swCallback.setExtensions(null);
        if (extensions != null) {
            for (java.util.Map.Entry<String, Object> e : extensions.entrySet()) {
                this.addExtension(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Callback addExtension(String key, Object object) {
        _swCallback.addExtension(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
        if (getExtensions() != null) {
            _swCallback.getExtensions()
                    .remove(key);
        }
    }

    private java.util.Map<String, fr.jmini.empoa.swagger.parser.internal.models.SwPathItem> _pathItems;

    private void initPathItems() {
        if (_swCallback == null) {
            _pathItems = null;
        } else if (_pathItems == null) {
            _pathItems = _swCallback
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
        _swCallback.clear();
        if (pathItems != null) {
            for (java.util.Map.Entry<String, org.eclipse.microprofile.openapi.models.PathItem> e : pathItems.entrySet()) {
                this.addPathItem(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Callback addPathItem(String key, org.eclipse.microprofile.openapi.models.PathItem pathItem) {
        if (!(pathItem instanceof fr.jmini.empoa.swagger.parser.internal.models.SwPathItem)) {
            throw new IllegalArgumentException("Unexpected type: " + pathItem);
        }
        fr.jmini.empoa.swagger.parser.internal.models.SwPathItem value = (fr.jmini.empoa.swagger.parser.internal.models.SwPathItem) pathItem;
        initPathItems();
        if (_pathItems == null) {
            _pathItems = new java.util.LinkedHashMap<>();
        }
        _pathItems.put(key, value);
        _swCallback.put(key, value.getSw());
        return this;
    }

    @Override
    public void removePathItem(String key) {
        initPathItems();
        if (_pathItems != null) {
            _pathItems.remove(key);
            _swCallback.remove(key);
        }
    }

}
