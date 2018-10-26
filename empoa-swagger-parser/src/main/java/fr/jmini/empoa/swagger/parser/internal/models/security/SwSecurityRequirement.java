package fr.jmini.empoa.swagger.parser.internal.models.security;

import org.eclipse.microprofile.openapi.models.security.SecurityRequirement;

public class SwSecurityRequirement implements SecurityRequirement {

    private io.swagger.v3.oas.models.security.SecurityRequirement swSecurityRequirement;

    public SwSecurityRequirement() {
        swSecurityRequirement = new io.swagger.v3.oas.models.security.SecurityRequirement();
    }

    public SwSecurityRequirement(io.swagger.v3.oas.models.security.SecurityRequirement swSecurityRequirement) {
        this.swSecurityRequirement = swSecurityRequirement;
    }

    @Override
    public java.util.Map<String, java.util.List<String>> getSchemes() {
        java.util.Map<String, java.util.List<String>> result = swSecurityRequirement.getSchemes();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setSchemes(java.util.Map<String, java.util.List<String>> schemes) {
        swSecurityRequirement.setSchemes(null);
        if (schemes != null) {
            for (java.util.Map.Entry<String, java.util.List<String>> e : schemes.entrySet()) {
                this.addScheme(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public SecurityRequirement addScheme(String key, java.util.List<String> list) {
        swSecurityRequirement.addScheme(key, list);
        return this;
    }

    @Override
    public void removeScheme(String key) {
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
