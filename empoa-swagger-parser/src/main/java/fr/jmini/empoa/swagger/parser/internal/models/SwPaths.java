package fr.jmini.empoa.swagger.parser.internal.models;

import org.eclipse.microprofile.openapi.models.Paths;

public class SwPaths implements Paths {

    private io.swagger.v3.oas.models.Paths swPaths;

    public SwPaths() {
        swPaths = new io.swagger.v3.oas.models.Paths();
    }

    public SwPaths(io.swagger.v3.oas.models.Paths swPaths) {
        this.swPaths = swPaths;
    }

    @Override
    public java.util.Map<String, Object> getExtensions() {
        java.util.Map<String, Object> result = swPaths.getExtensions();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        swPaths.setExtensions(null);
        if (extensions != null) {
            for (java.util.Map.Entry<String, Object> e : extensions.entrySet()) {
                this.addExtension(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Paths addExtension(String key, Object object) {
        swPaths.addExtension(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
    }

    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.PathItem> getPathItems() {
        java.util.Map<String, org.eclipse.microprofile.openapi.models.PathItem> result = swPaths.getPathItems();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setPathItems(java.util.Map<String, org.eclipse.microprofile.openapi.models.PathItem> pathItems) {
        swPaths.setPathItems(null);
        if (pathItems != null) {
            for (java.util.Map.Entry<String, org.eclipse.microprofile.openapi.models.PathItem> e : pathItems.entrySet()) {
                this.addPathItem(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Paths addPathItem(String key, org.eclipse.microprofile.openapi.models.PathItem pathItem) {
        swPaths.addPathItem(key, pathItem);
        return this;
    }

    @Override
    public void removePathItem(String key) {
    }

}
