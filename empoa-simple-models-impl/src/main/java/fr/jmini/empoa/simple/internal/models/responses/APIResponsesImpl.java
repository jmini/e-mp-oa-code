package fr.jmini.empoa.simple.internal.models.responses;

import org.eclipse.microprofile.openapi.models.responses.APIResponses;

public class APIResponsesImpl extends java.util.LinkedHashMap<String, org.eclipse.microprofile.openapi.models.responses.APIResponse> implements APIResponses {
    private static final long serialVersionUID = 1L;

    private java.util.Map<String, Object> _extensions;

    @Override
    public java.util.Map<String, Object> getExtensions() {
        if (_extensions == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(_extensions);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        if (extensions == null) {
            _extensions = null;
        } else {
            _extensions = new java.util.LinkedHashMap<>();
            _extensions.putAll(extensions);
        }
    }

    @Override
    public APIResponses addExtension(String key, Object object) {
        if (_extensions == null) {
            _extensions = new java.util.LinkedHashMap<>();
        }
        _extensions.put(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
        if (_extensions != null) {
            _extensions.remove(key);
        }
    }

    @Override
    public org.eclipse.microprofile.openapi.models.responses.APIResponse getDefaultValue() {
        return get(DEFAULT);
    }

    @Override
    public void setDefaultValue(org.eclipse.microprofile.openapi.models.responses.APIResponse defaultValue) {
        if (defaultValue == null) {
            removeAPIResponse(DEFAULT);
        } else {
            addAPIResponse(DEFAULT, defaultValue);
        }
    }

    @Override
    public APIResponses addAPIResponse(String key, org.eclipse.microprofile.openapi.models.responses.APIResponse aPIResponse) {
        this.put(key, aPIResponse);
        return this;
    }

    @Override
    public void removeAPIResponse(String key) {
        this.remove(key);
    }

    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.responses.APIResponse> getAPIResponses() {
        return java.util.Collections.unmodifiableMap(this);
    }

    @Override
    public void setAPIResponses(java.util.Map<String, org.eclipse.microprofile.openapi.models.responses.APIResponse> items) {
        this.clear();
        if (items != null) {
            items.entrySet()
                    .stream()
                    .forEach(e -> this.put(e.getKey(), e.getValue()));
        }
    }

    @Override
    public boolean hasAPIResponse(String key) {
        return this.containsKey(key);
    }

    @Override
    public org.eclipse.microprofile.openapi.models.responses.APIResponse getAPIResponse(String key) {
        return this.get(key);
    }

}
