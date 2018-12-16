package fr.jmini.empoa.simple.internal.models.parameters;

import org.eclipse.microprofile.openapi.models.parameters.RequestBody;

public class RequestBodyImpl implements RequestBody {

    private String _ref;

    @Override
    public String getRef() {
        return _ref;
    }

    @Override
    public RequestBody ref(String ref) {
        setRef(ref);
        return this;
    }

    @Override
    public void setRef(String ref) {
        if (ref != null && !ref.contains("#") && !ref.contains("/")) {
            _ref = "#/components/requestBodies/" + ref;
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
    public void addExtension(String key, Object object) {
        if (_extensions == null) {
            _extensions = new java.util.LinkedHashMap<>();
        }
        _extensions.put(key, object);
    }

    private String _description;

    @Override
    public String getDescription() {
        return _description;
    }

    @Override
    public void setDescription(String description) {
        _description = description;
    }

    @Override
    public RequestBody description(String description) {
        setDescription(description);
        return this;
    }

    private org.eclipse.microprofile.openapi.models.media.Content _content;

    @Override
    public org.eclipse.microprofile.openapi.models.media.Content getContent() {
        return _content;
    }

    @Override
    public void setContent(org.eclipse.microprofile.openapi.models.media.Content content) {
        _content = content;
    }

    @Override
    public RequestBody content(org.eclipse.microprofile.openapi.models.media.Content content) {
        setContent(content);
        return this;
    }

    private Boolean _required;

    @Override
    public Boolean getRequired() {
        return _required;
    }

    @Override
    public void setRequired(Boolean required) {
        _required = required;
    }

    @Override
    public RequestBody required(Boolean required) {
        setRequired(required);
        return this;
    }

}
