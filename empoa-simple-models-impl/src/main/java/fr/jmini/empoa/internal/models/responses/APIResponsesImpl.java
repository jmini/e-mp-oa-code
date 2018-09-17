package fr.jmini.empoa.internal.models.responses;

import org.eclipse.microprofile.openapi.models.responses.APIResponses;

public class APIResponsesImpl extends java.util.LinkedHashMap<String, org.eclipse.microprofile.openapi.models.responses.APIResponse> implements APIResponses {
    private static final long serialVersionUID = 1L;

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
    public APIResponses addApiResponse(String key, org.eclipse.microprofile.openapi.models.responses.APIResponse aPIResponse) {
        this.put(key, aPIResponse);
        return this;
    }

}
