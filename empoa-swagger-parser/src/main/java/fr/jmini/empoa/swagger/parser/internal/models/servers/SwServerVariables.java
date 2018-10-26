package fr.jmini.empoa.swagger.parser.internal.models.servers;

import org.eclipse.microprofile.openapi.models.servers.ServerVariables;

public class SwServerVariables implements ServerVariables {

    private io.swagger.v3.oas.models.servers.ServerVariables swServerVariables;

    public SwServerVariables() {
        swServerVariables = new io.swagger.v3.oas.models.servers.ServerVariables();
    }

    public SwServerVariables(io.swagger.v3.oas.models.servers.ServerVariables swServerVariables) {
        this.swServerVariables = swServerVariables;
    }

    @Override
    public java.util.Map<String, Object> getExtensions() {
        java.util.Map<String, Object> result = swServerVariables.getExtensions();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        swServerVariables.setExtensions(null);
        if (extensions != null) {
            for (java.util.Map.Entry<String, Object> e : extensions.entrySet()) {
                this.addExtension(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public ServerVariables addExtension(String key, Object object) {
        swServerVariables.addExtension(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
    }

    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.servers.ServerVariable> getServerVariables() {
        java.util.Map<String, org.eclipse.microprofile.openapi.models.servers.ServerVariable> result = swServerVariables.getServerVariables();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setServerVariables(java.util.Map<String, org.eclipse.microprofile.openapi.models.servers.ServerVariable> serverVariables) {
        swServerVariables.setServerVariables(null);
        if (serverVariables != null) {
            for (java.util.Map.Entry<String, org.eclipse.microprofile.openapi.models.servers.ServerVariable> e : serverVariables.entrySet()) {
                this.addServerVariable(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public ServerVariables addServerVariable(String key, org.eclipse.microprofile.openapi.models.servers.ServerVariable serverVariable) {
        swServerVariables.addServerVariable(key, serverVariable);
        return this;
    }

    @Override
    public void removeServerVariable(String key) {
    }

}
