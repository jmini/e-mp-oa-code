package fr.jmini.empoa.swagger.parser.internal.models.servers;

import org.eclipse.microprofile.openapi.models.servers.ServerVariable;

public class SwServerVariable implements ServerVariable {

    private io.swagger.v3.oas.models.servers.ServerVariable swServerVariable;

    public SwServerVariable() {
        swServerVariable = new io.swagger.v3.oas.models.servers.ServerVariable();
    }

    public SwServerVariable(io.swagger.v3.oas.models.servers.ServerVariable swServerVariable) {
        this.swServerVariable = swServerVariable;
    }

    @Override
    public java.util.Map<String, Object> getExtensions() {
        java.util.Map<String, Object> result = swServerVariable.getExtensions();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        swServerVariable.setExtensions(null);
        if (extensions != null) {
            for (java.util.Map.Entry<String, Object> e : extensions.entrySet()) {
                this.addExtension(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public ServerVariable addExtension(String key, Object object) {
        swServerVariable.addExtension(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
    }

    @Override
    public java.util.List<String> getEnumeration() {
        java.util.List<String> result = swServerVariable.getEnumeration();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableList(result);
    }

    @Override
    public void setEnumeration(java.util.List<String> enumeration) {
        swServerVariable.setEnumeration(null);
        if (enumeration != null) {
            for (String e : enumeration) {
                this.addEnumeration(e);
            }
        }
    }

    @Override
    public ServerVariable addEnumeration(String string) {
        swServerVariable.addEnumeration(e);
        return this;
    }

    @Override
    public void removeEnumeration(String string) {
    }

    @Override
    public String getDefaultValue() {
        return swServerVariable.getDefaultValue();
    }

    @Override
    public void setDefaultValue(String defaultValue) {
        swServerVariable.setDefaultValue(defaultValue);
    }

    @Override
    public String getDescription() {
        return swServerVariable.getDescription();
    }

    @Override
    public void setDescription(String description) {
        swServerVariable.setDescription(description);
    }

}
