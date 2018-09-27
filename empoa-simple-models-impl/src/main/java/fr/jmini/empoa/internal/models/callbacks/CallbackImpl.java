package fr.jmini.empoa.internal.models.callbacks;

import org.eclipse.microprofile.openapi.models.callbacks.Callback;

public class CallbackImpl extends java.util.LinkedHashMap<String, org.eclipse.microprofile.openapi.models.PathItem> implements Callback {
    private static final long serialVersionUID = 1L;

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
        return _extensions;
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        _extensions = extensions;
    }

    @Override
    public Callback addExtension(String key, Object object) {
        if (_extensions == null) {
            _extensions = new java.util.LinkedHashMap<>();
        }
        _extensions.put(key, object);
        return this;
    }

    @Override
    public Callback addPathItem(String key, org.eclipse.microprofile.openapi.models.PathItem pathItem) {
        this.put(key, pathItem);
        return this;
    }

}
