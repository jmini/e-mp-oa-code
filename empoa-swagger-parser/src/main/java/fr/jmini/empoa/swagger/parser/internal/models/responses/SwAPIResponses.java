package fr.jmini.empoa.swagger.parser.internal.models.responses;

import org.eclipse.microprofile.openapi.models.responses.APIResponses;

public class SwAPIResponses implements APIResponses {

    private io.swagger.v3.oas.models.responses.ApiResponses swAPIResponses;

    public SwAPIResponses() {
        swAPIResponses = new io.swagger.v3.oas.models.responses.ApiResponses();
    }

    public SwAPIResponses(io.swagger.v3.oas.models.responses.ApiResponses swAPIResponses) {
        this.swAPIResponses = swAPIResponses;
    }

    @Override
    public java.util.Map<String, Object> getExtensions() {
        java.util.Map<String, Object> result = swAPIResponses.getExtensions();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        swAPIResponses.setExtensions(null);
        if (extensions != null) {
            for (java.util.Map.Entry<String, Object> e : extensions.entrySet()) {
                this.addExtension(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public APIResponses addExtension(String key, Object object) {
        swAPIResponses.addExtension(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
    }

    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.responses.APIResponse> getAPIResponses() {
        java.util.Map<String, org.eclipse.microprofile.openapi.models.responses.APIResponse> result = swAPIResponses.getAPIResponses();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setAPIResponses(java.util.Map<String, org.eclipse.microprofile.openapi.models.responses.APIResponse> aPIResponses) {
        swAPIResponses.setAPIResponses(null);
        if (aPIResponses != null) {
            for (java.util.Map.Entry<String, org.eclipse.microprofile.openapi.models.responses.APIResponse> e : aPIResponses.entrySet()) {
                this.addAPIResponse(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public APIResponses addAPIResponse(String key, org.eclipse.microprofile.openapi.models.responses.APIResponse aPIResponse) {
        swAPIResponses.addAPIResponse(key, aPIResponse);
        return this;
    }

    @Override
    public void removeAPIResponse(String key) {
    }

    @Override
    public org.eclipse.microprofile.openapi.models.responses.APIResponse getDefaultValue() {
        return getAPIResponse(DEFAULT);
    }

    @Override
    public void setDefaultValue(org.eclipse.microprofile.openapi.models.responses.APIResponse defaultValue) {
        addAPIResponse(DEFAULT, defaultValue);
    }

}
