package fr.jmini.empoa.swagger.core.internal.models.security;

import org.eclipse.microprofile.openapi.models.security.SecurityRequirement;

public class SwSecurityRequirement implements SecurityRequirement {

    private io.swagger.v3.oas.models.security.SecurityRequirement _swSecurityRequirement;

    public SwSecurityRequirement() {
        _swSecurityRequirement = new io.swagger.v3.oas.models.security.SecurityRequirement();
    }

    public SwSecurityRequirement(io.swagger.v3.oas.models.security.SecurityRequirement _swSecurityRequirement) {
        this._swSecurityRequirement = _swSecurityRequirement;
    }

    public io.swagger.v3.oas.models.security.SecurityRequirement getSw() {
        return _swSecurityRequirement;
    }

    @Override
    public java.util.Map<String, java.util.List<String>> getSchemes() {
        java.util.Map<String, java.util.List<String>> result = _swSecurityRequirement;
        if (result == null) {
            return null;
        }
        if (result.isEmpty()) {
            return java.util.Collections.emptyMap();
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setSchemes(java.util.Map<String, java.util.List<String>> schemes) {
        _swSecurityRequirement.clear();
        if (schemes != null) {
            if (schemes.isEmpty()) {
            } else {
                for (java.util.Map.Entry<String, java.util.List<String>> e : schemes.entrySet()) {
                    this.addScheme(e.getKey(), e.getValue());
                }
            }
        }
    }

    @Override
    public SecurityRequirement addScheme(String key, java.util.List<String> list) {
        _swSecurityRequirement.put(key, list);
        return this;
    }

    @Override
    public void removeScheme(String key) {
        if (getSchemes() != null) {
            _swSecurityRequirement.remove(key);
        }
    }

    @Override
    public SecurityRequirement addScheme(String key, String scope) {
        java.util.List<String> list = new java.util.ArrayList<>();
        list.add(scope);
        return addScheme(key, list);
    }

    @Override
    public SecurityRequirement addScheme(String key) {
        return addScheme(key, new java.util.ArrayList<>());
    }

}
