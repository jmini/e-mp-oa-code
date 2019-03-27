package org.openapitools.empoa.kaizen.parser.internal.models.security;

import org.eclipse.microprofile.openapi.models.security.SecurityRequirement;

public class KzSecurityRequirement implements SecurityRequirement {

    private java.util.Map<String, java.util.List<String>> _schemes;

    @Override
    public java.util.Map<String, java.util.List<String>> getSchemes() {
        if (_schemes == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(_schemes);
    }

    @Override
    public void setSchemes(java.util.Map<String, java.util.List<String>> schemes) {
        if (schemes == null) {
            _schemes = null;
        } else {
            _schemes = new java.util.LinkedHashMap<>();
            _schemes.putAll(schemes);
        }
    }

    @Override
    public SecurityRequirement addScheme(String key, java.util.List<String> list) {
        if (list == null) {
            throw new IllegalArgumentException("Null value for key '" + key + "' is not allowed");
        } else {
            if (_schemes == null) {
                _schemes = new java.util.LinkedHashMap<>();
            }
            _schemes.put(key, list);
        }
        return this;
    }

    @Override
    public void removeScheme(String key) {
        if (_schemes != null) {
            _schemes.remove(key);
        }
    }

    @Override
    public SecurityRequirement addScheme(String key, String scope) {
        java.util.List<String> list = new java.util.ArrayList<>();
        if (scope != null) {
            list.add(scope);
        }
        return addScheme(key, list);
    }

    @Override
    public SecurityRequirement addScheme(String key) {
        return addScheme(key, new java.util.ArrayList<>());
    }

}
