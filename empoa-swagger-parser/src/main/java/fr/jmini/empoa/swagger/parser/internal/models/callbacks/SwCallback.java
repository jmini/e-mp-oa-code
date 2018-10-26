package fr.jmini.empoa.swagger.parser.internal.models.callbacks;

import org.eclipse.microprofile.openapi.models.callbacks.Callback;

public class SwCallback implements Callback {

    private io.swagger.v3.oas.models.callbacks.Callback swCallback;

    public SwCallback() {
        swCallback = new io.swagger.v3.oas.models.callbacks.Callback();
    }

    public SwCallback(io.swagger.v3.oas.models.callbacks.Callback swCallback) {
        this.swCallback = swCallback;
    }

    @Override
    public String getRef() {
        return swCallback.getRef();
    }

    @Override
    public void setRef(String ref) {
    }

    @Override
    public java.util.Map<String, Object> getExtensions() {
        java.util.Map<String, Object> result = swCallback.getExtensions();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        swCallback.setExtensions(null);
        if (extensions != null) {
            for (java.util.Map.Entry<String, Object> e : extensions.entrySet()) {
                this.addExtension(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Callback addExtension(String key, Object object) {
        swCallback.addExtension(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
    }

    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.PathItem> getPathItems() {
        java.util.Map<String, org.eclipse.microprofile.openapi.models.PathItem> result = swCallback.getPathItems();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setPathItems(java.util.Map<String, org.eclipse.microprofile.openapi.models.PathItem> pathItems) {
        swCallback.setPathItems(null);
        if (pathItems != null) {
            for (java.util.Map.Entry<String, org.eclipse.microprofile.openapi.models.PathItem> e : pathItems.entrySet()) {
                this.addPathItem(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Callback addPathItem(String key, org.eclipse.microprofile.openapi.models.PathItem pathItem) {
        swCallback.addPathItem(key, pathItem);
        return this;
    }

    @Override
    public void removePathItem(String key) {
    }

}
