package fr.jmini.empoa.swagger.parser.internal.models.servers;

import org.eclipse.microprofile.openapi.models.servers.Server;

public class SwServer implements Server {

    private io.swagger.v3.oas.models.servers.Server swServer;

    public SwServer() {
        swServer = new io.swagger.v3.oas.models.servers.Server();
    }

    public SwServer(io.swagger.v3.oas.models.servers.Server swServer) {
        this.swServer = swServer;
    }

    @Override
    public java.util.Map<String, Object> getExtensions() {
        java.util.Map<String, Object> result = swServer.getExtensions();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        swServer.setExtensions(null);
        if (extensions != null) {
            for (java.util.Map.Entry<String, Object> e : extensions.entrySet()) {
                this.addExtension(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Server addExtension(String key, Object object) {
        swServer.addExtension(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
    }

    @Override
    public String getUrl() {
        return swServer.getUrl();
    }

    @Override
    public void setUrl(String url) {
        swServer.setUrl(url);
    }

    @Override
    public String getDescription() {
        return swServer.getDescription();
    }

    @Override
    public void setDescription(String description) {
        swServer.setDescription(description);
    }

    @Override
    public org.eclipse.microprofile.openapi.models.servers.ServerVariables getVariables() {
        return swServer.getVariables();
    }

    @Override
    public void setVariables(org.eclipse.microprofile.openapi.models.servers.ServerVariables variables) {
        swServer.setVariables(variables);
    }

}
