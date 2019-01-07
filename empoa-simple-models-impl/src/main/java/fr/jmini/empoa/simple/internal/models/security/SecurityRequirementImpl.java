package fr.jmini.empoa.simple.internal.models.security;

import org.eclipse.microprofile.openapi.models.security.SecurityRequirement;

public class SecurityRequirementImpl extends java.util.LinkedHashMap<String, java.util.List<String>> implements SecurityRequirement {
    private static final long serialVersionUID = 1L;

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

    @Override
    public SecurityRequirement addScheme(String key, java.util.List<String> list) {
        if (list == null) {
            return addScheme(key);
        }
        this.put(key, list);
        return this;
    }

    @Override
    public void removeScheme(String key) {
        this.remove(key);
    }

    @Override
    public java.util.Map<String, java.util.List<String>> getSchemes() {
        return java.util.Collections.unmodifiableMap(this);
    }

    @Override
    public void setSchemes(java.util.Map<String, java.util.List<String>> items) {
        this.clear();
        if (items != null) {
            items.entrySet()
                    .stream()
                    .forEach(e -> this.put(e.getKey(), e.getValue()));
        }
    }

    @Override
    public boolean hasScheme(String key) {
        return this.containsKey(key);
    }

    @Override
    public java.util.List<String> getScheme(String key) {
        return this.get(key);
    }

}
