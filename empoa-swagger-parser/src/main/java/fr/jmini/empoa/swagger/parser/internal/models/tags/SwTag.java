package fr.jmini.empoa.swagger.parser.internal.models.tags;

import org.eclipse.microprofile.openapi.models.tags.Tag;

public class SwTag implements Tag {

    private io.swagger.v3.oas.models.tags.Tag swTag;

    public SwTag() {
        swTag = new io.swagger.v3.oas.models.tags.Tag();
    }

    public SwTag(io.swagger.v3.oas.models.tags.Tag swTag) {
        this.swTag = swTag;
    }

    @Override
    public java.util.Map<String, Object> getExtensions() {
        java.util.Map<String, Object> result = swTag.getExtensions();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        swTag.setExtensions(null);
        if (extensions != null) {
            for (java.util.Map.Entry<String, Object> e : extensions.entrySet()) {
                this.addExtension(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Tag addExtension(String key, Object object) {
        swTag.addExtension(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
    }

    @Override
    public String getName() {
        return swTag.getName();
    }

    @Override
    public void setName(String name) {
        swTag.setName(name);
    }

    @Override
    public String getDescription() {
        return swTag.getDescription();
    }

    @Override
    public void setDescription(String description) {
        swTag.setDescription(description);
    }

    @Override
    public org.eclipse.microprofile.openapi.models.ExternalDocumentation getExternalDocs() {
        return swTag.getExternalDocs();
    }

    @Override
    public void setExternalDocs(org.eclipse.microprofile.openapi.models.ExternalDocumentation externalDocs) {
        swTag.setExternalDocs(externalDocs);
    }

}
