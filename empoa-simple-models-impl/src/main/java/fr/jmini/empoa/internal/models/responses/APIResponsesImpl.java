package fr.jmini.empoa.internal.models.responses;

import org.eclipse.microprofile.openapi.models.responses.APIResponses;

public class APIResponsesImpl extends java.util.LinkedHashMap<String, org.eclipse.microprofile.openapi.models.responses.APIResponse> implements APIResponses {
    private static final long serialVersionUID = 1L;

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
    public APIResponses addExtension(String key, Object object) {
        if (_extensions == null) {
            _extensions = new java.util.LinkedHashMap<>();
        }
        _extensions.put(key, object);
        return this;
    }

    private org.eclipse.microprofile.openapi.models.responses.APIResponse _defaultValue;

    @Override
    public org.eclipse.microprofile.openapi.models.responses.APIResponse getDefault() {
        return _defaultValue;
    }

    @Override
    public void setDefaultValue(org.eclipse.microprofile.openapi.models.responses.APIResponse defaultValue) {
        _defaultValue = defaultValue;
    }

    @Override
    public APIResponses defaultValue(org.eclipse.microprofile.openapi.models.responses.APIResponse defaultValue) {
        setDefaultValue(defaultValue);
        return this;
    }

    @Override
    public APIResponses addAPIResponse(String key, org.eclipse.microprofile.openapi.models.responses.APIResponse aPIResponse) {
        this.put(key, aPIResponse);
        return this;
    }

}
