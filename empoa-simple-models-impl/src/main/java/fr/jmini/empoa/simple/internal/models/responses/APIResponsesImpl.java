package fr.jmini.empoa.simple.internal.models.responses;

import org.eclipse.microprofile.openapi.models.responses.APIResponses;

public class APIResponsesImpl implements APIResponses {

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
        if (object == null) {
            throw new IllegalArgumentException("Null value for key '" + key + "' is not allowed");
        } else {
            if (_extensions == null) {
                _extensions = new java.util.LinkedHashMap<>();
            }
            _extensions.put(key, object);
        }
        return this;
    }

    @Override
    public void removeExtension(String key) {
        if (_extensions != null) {
            _extensions.remove(key);
        }
    }

    private java.util.Map<String, org.eclipse.microprofile.openapi.models.responses.APIResponse> _aPIResponses;

    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.responses.APIResponse> getAPIResponses() {
        if (_aPIResponses == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(_aPIResponses);
    }

    @Override
    public void setAPIResponses(java.util.Map<String, org.eclipse.microprofile.openapi.models.responses.APIResponse> aPIResponses) {
        if (aPIResponses == null) {
            _aPIResponses = null;
        } else {
            _aPIResponses = new java.util.LinkedHashMap<>();
            _aPIResponses.putAll(aPIResponses);
        }
    }

    @Override
    public APIResponses addAPIResponse(String key, org.eclipse.microprofile.openapi.models.responses.APIResponse aPIResponse) {
        if (aPIResponse == null) {
            throw new IllegalArgumentException("Null value for key '" + key + "' is not allowed");
        } else {
            if (_aPIResponses == null) {
                _aPIResponses = new java.util.LinkedHashMap<>();
            }
            _aPIResponses.put(key, aPIResponse);
        }
        return this;
    }

    @Override
    public void removeAPIResponse(String key) {
        if (_aPIResponses != null) {
            _aPIResponses.remove(key);
        }
    }

    @Override
    public org.eclipse.microprofile.openapi.models.responses.APIResponse getDefaultValue() {
        return getAPIResponse(DEFAULT);
    }

    @Override
    public void setDefaultValue(org.eclipse.microprofile.openapi.models.responses.APIResponse defaultValue) {
        if (defaultValue == null) {
            removeAPIResponse(DEFAULT);
        } else {
            addAPIResponse(DEFAULT, defaultValue);
        }
    }

}
