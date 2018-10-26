package fr.jmini.empoa.swagger.parser.internal.models.parameters;

import org.eclipse.microprofile.openapi.models.parameters.RequestBody;

public class SwRequestBody implements RequestBody {

    private io.swagger.v3.oas.models.parameters.RequestBody swRequestBody;

    public SwRequestBody() {
        swRequestBody = new io.swagger.v3.oas.models.parameters.RequestBody();
    }

    public SwRequestBody(io.swagger.v3.oas.models.parameters.RequestBody swRequestBody) {
        this.swRequestBody = swRequestBody;
    }

    @Override
    public String getRef() {
        return swRequestBody.getRef();
    }

    @Override
    public void setRef(String ref) {
    }

    @Override
    public java.util.Map<String, Object> getExtensions() {
        java.util.Map<String, Object> result = swRequestBody.getExtensions();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        swRequestBody.setExtensions(null);
        if (extensions != null) {
            for (java.util.Map.Entry<String, Object> e : extensions.entrySet()) {
                this.addExtension(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public RequestBody addExtension(String key, Object object) {
        swRequestBody.addExtension(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
    }

    @Override
    public String getDescription() {
        return swRequestBody.getDescription();
    }

    @Override
    public void setDescription(String description) {
        swRequestBody.setDescription(description);
    }

    @Override
    public org.eclipse.microprofile.openapi.models.media.Content getContent() {
        return swRequestBody.getContent();
    }

    @Override
    public void setContent(org.eclipse.microprofile.openapi.models.media.Content content) {
        swRequestBody.setContent(content);
    }

    @Override
    public Boolean getRequired() {
        return swRequestBody.getRequired();
    }

    @Override
    public void setRequired(Boolean required) {
        swRequestBody.setRequired(required);
    }

}
