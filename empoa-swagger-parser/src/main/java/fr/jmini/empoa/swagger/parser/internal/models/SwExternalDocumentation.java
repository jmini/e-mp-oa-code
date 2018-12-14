package fr.jmini.empoa.swagger.parser.internal.models;

import org.eclipse.microprofile.openapi.models.ExternalDocumentation;

public class SwExternalDocumentation implements ExternalDocumentation {

    private io.swagger.v3.oas.models.ExternalDocumentation _swExternalDocumentation;

    public SwExternalDocumentation() {
        _swExternalDocumentation = new io.swagger.v3.oas.models.ExternalDocumentation();
    }

    public SwExternalDocumentation(io.swagger.v3.oas.models.ExternalDocumentation _swExternalDocumentation) {
        this._swExternalDocumentation = _swExternalDocumentation;
    }

    public io.swagger.v3.oas.models.ExternalDocumentation getSw() {
        return _swExternalDocumentation;
    }

    @Override
    public java.util.Map<String, Object> getExtensions() {
        java.util.Map<String, Object> result = _swExternalDocumentation.getExtensions();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        _swExternalDocumentation.setExtensions(null);
        if (extensions != null) {
            if (extensions.isEmpty()) {
                _swExternalDocumentation.setExtensions(new java.util.LinkedHashMap<>());
            } else {
                for (java.util.Map.Entry<String, Object> e : extensions.entrySet()) {
                    this.addExtension(e.getKey(), e.getValue());
                }
            }
        }
    }

    @Override
    public ExternalDocumentation addExtension(String key, Object object) {
        _swExternalDocumentation.addExtension(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
        if (getExtensions() != null) {
            _swExternalDocumentation.getExtensions()
                    .remove(key);
        }
    }

    @Override
    public String getDescription() {
        return _swExternalDocumentation.getDescription();
    }

    @Override
    public void setDescription(String description) {
        _swExternalDocumentation.setDescription(description);
    }

    @Override
    public String getUrl() {
        return _swExternalDocumentation.getUrl();
    }

    @Override
    public void setUrl(String url) {
        _swExternalDocumentation.setUrl(url);
    }

}
