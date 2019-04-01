package org.openapitools.empoa.kaizen.parser.internal.models.callbacks;

import org.eclipse.microprofile.openapi.models.callbacks.Callback;

public class KzCallback implements Callback {

    private com.reprezen.kaizen.oasparser.model3.Callback _kzCallback;

    public KzCallback() {
        // _kzCallback = new com.reprezen.kaizen.oasparser.model3.Callback();
    }

    public KzCallback(com.reprezen.kaizen.oasparser.model3.Callback _kzCallback) {
        this._kzCallback = _kzCallback;
    }

    public com.reprezen.kaizen.oasparser.model3.Callback getKz() {
        return _kzCallback;
    }

    private String _ref;

    @Override
    public String getRef() {
        return _ref;
    }

    @Override
    public void setRef(String ref) {
        if (ref != null && !ref.contains("#") && !ref.contains("/")) {
            _ref = "#/components/callbacks/" + ref;
        } else {
            _ref = ref;
        }
    }

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
    public Callback addExtension(String key, Object object) {
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
    public Callback addPathItem(String key, org.eclipse.microprofile.openapi.models.PathItem pathItem) {
        if (pathItem == null) {
            throw new IllegalArgumentException("Null value for key '" + key + "' is not allowed");
        } else {
            if (_pathItems == null) {
                _pathItems = new java.util.LinkedHashMap<>();
            }
            _pathItems.put(key, pathItem);
        }
        return this;
    }

    @Override
    public void removePathItem(String key) {
        if (_pathItems != null) {
            _pathItems.remove(key);
        }
    }

}
