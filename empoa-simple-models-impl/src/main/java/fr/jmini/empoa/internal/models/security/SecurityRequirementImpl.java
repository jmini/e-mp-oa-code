package fr.jmini.empoa.internal.models.security;

import org.eclipse.microprofile.openapi.models.security.SecurityRequirement;

public class SecurityRequirementImpl extends java.util.LinkedHashMap<String, java.util.List<String>> implements SecurityRequirement {
    private static final long serialVersionUID = 1L;

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

    @Override
    public SecurityRequirement addScheme(String key, java.util.List<String> list) {
        this.put(key, list);
        return this;
    }

}
