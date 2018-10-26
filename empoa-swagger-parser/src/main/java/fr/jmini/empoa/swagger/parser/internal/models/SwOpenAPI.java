package fr.jmini.empoa.swagger.parser.internal.models;

import org.eclipse.microprofile.openapi.models.OpenAPI;

public class SwOpenAPI implements OpenAPI {

    private io.swagger.v3.oas.models.OpenAPI swOpenAPI;

    public SwOpenAPI() {
        swOpenAPI = new io.swagger.v3.oas.models.OpenAPI();
    }

    public SwOpenAPI(io.swagger.v3.oas.models.OpenAPI swOpenAPI) {
        this.swOpenAPI = swOpenAPI;
    }

    @Override
    public java.util.Map<String, Object> getExtensions() {
        java.util.Map<String, Object> result = swOpenAPI.getExtensions();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        swOpenAPI.setExtensions(null);
        if (extensions != null) {
            for (java.util.Map.Entry<String, Object> e : extensions.entrySet()) {
                this.addExtension(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public OpenAPI addExtension(String key, Object object) {
        swOpenAPI.addExtension(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
    }

    @Override
    public String getOpenapi() {
        return swOpenAPI.getOpenapi();
    }

    @Override
    public void setOpenapi(String openapi) {
        swOpenAPI.setOpenapi(openapi);
    }

    @Override
    public org.eclipse.microprofile.openapi.models.info.Info getInfo() {
        return swOpenAPI.getInfo();
    }

    @Override
    public void setInfo(org.eclipse.microprofile.openapi.models.info.Info info) {
        swOpenAPI.setInfo(info);
    }

    @Override
    public org.eclipse.microprofile.openapi.models.ExternalDocumentation getExternalDocs() {
        return swOpenAPI.getExternalDocs();
    }

    @Override
    public void setExternalDocs(org.eclipse.microprofile.openapi.models.ExternalDocumentation externalDocs) {
        swOpenAPI.setExternalDocs(externalDocs);
    }

    @Override
    public java.util.List<org.eclipse.microprofile.openapi.models.servers.Server> getServers() {
        java.util.List<org.eclipse.microprofile.openapi.models.servers.Server> result = swOpenAPI.getServers();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableList(result);
    }

    @Override
    public void setServers(java.util.List<org.eclipse.microprofile.openapi.models.servers.Server> servers) {
        swOpenAPI.setServers(null);
        if (servers != null) {
            for (org.eclipse.microprofile.openapi.models.servers.Server e : servers) {
                this.addServer(e);
            }
        }
    }

    @Override
    public OpenAPI addServer(org.eclipse.microprofile.openapi.models.servers.Server server) {
        swOpenAPI.addServer(e);
        return this;
    }

    @Override
    public void removeServer(org.eclipse.microprofile.openapi.models.servers.Server server) {
    }

    @Override
    public java.util.List<org.eclipse.microprofile.openapi.models.security.SecurityRequirement> getSecurity() {
        java.util.List<org.eclipse.microprofile.openapi.models.security.SecurityRequirement> result = swOpenAPI.getSecurity();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableList(result);
    }

    @Override
    public void setSecurity(java.util.List<org.eclipse.microprofile.openapi.models.security.SecurityRequirement> security) {
        swOpenAPI.setSecurity(null);
        if (security != null) {
            for (org.eclipse.microprofile.openapi.models.security.SecurityRequirement e : security) {
                this.addSecurityRequirement(e);
            }
        }
    }

    @Override
    public OpenAPI addSecurityRequirement(org.eclipse.microprofile.openapi.models.security.SecurityRequirement securityRequirement) {
        swOpenAPI.addSecurityRequirement(e);
        return this;
    }

    @Override
    public void removeSecurityRequirement(org.eclipse.microprofile.openapi.models.security.SecurityRequirement securityRequirement) {
    }

    @Override
    public java.util.List<org.eclipse.microprofile.openapi.models.tags.Tag> getTags() {
        java.util.List<org.eclipse.microprofile.openapi.models.tags.Tag> result = swOpenAPI.getTags();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableList(result);
    }

    @Override
    public void setTags(java.util.List<org.eclipse.microprofile.openapi.models.tags.Tag> tags) {
        swOpenAPI.setTags(null);
        if (tags != null) {
            for (org.eclipse.microprofile.openapi.models.tags.Tag e : tags) {
                this.addTag(e);
            }
        }
    }

    @Override
    public OpenAPI addTag(org.eclipse.microprofile.openapi.models.tags.Tag tag) {
        swOpenAPI.addTag(e);
        return this;
    }

    @Override
    public void removeTag(org.eclipse.microprofile.openapi.models.tags.Tag tag) {
    }

    @Override
    public org.eclipse.microprofile.openapi.models.Paths getPaths() {
        return swOpenAPI.getPaths();
    }

    @Override
    public void setPaths(org.eclipse.microprofile.openapi.models.Paths paths) {
        swOpenAPI.setPaths(paths);
    }

    @Override
    public org.eclipse.microprofile.openapi.models.Components getComponents() {
        return swOpenAPI.getComponents();
    }

    @Override
    public void setComponents(org.eclipse.microprofile.openapi.models.Components components) {
        swOpenAPI.setComponents(components);
    }

}
