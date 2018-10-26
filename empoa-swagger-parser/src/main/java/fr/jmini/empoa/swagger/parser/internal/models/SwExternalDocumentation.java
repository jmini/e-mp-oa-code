package fr.jmini.empoa.swagger.parser.internal.models;

import org.eclipse.microprofile.openapi.models.ExternalDocumentation;

public class SwExternalDocumentation implements ExternalDocumentation {

    private io.swagger.v3.oas.models.ExternalDocumentation swExternalDocumentation;

    public SwExternalDocumentation() {
        swExternalDocumentation = new io.swagger.v3.oas.models.ExternalDocumentation();
    }

    public SwExternalDocumentation(io.swagger.v3.oas.models.ExternalDocumentation swExternalDocumentation) {
        this.swExternalDocumentation = swExternalDocumentation;
    }

    @Override
    public java.util.Map<String, Object> getExtensions() {
        java.util.Map<String, Object> result = swExternalDocumentation.getExtensions();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        swExternalDocumentation.setExtensions(null);
        if (extensions != null) {
            for (java.util.Map.Entry<String, Object> e : extensions.entrySet()) {
                this.addExtension(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public ExternalDocumentation addExtension(String key, Object object) {
        swExternalDocumentation.addExtension(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
    }

    @Override
    public String getDescription() {
        return swExternalDocumentation.getDescription();
    }

    @Override
    public void setDescription(String description) {
        swExternalDocumentation.setDescription(description);
    }

    @Override
    public String getUrl() {
        return swExternalDocumentation.getUrl();
    }

    @Override
    public void setUrl(String url) {
        swExternalDocumentation.setUrl(url);
    }

}
