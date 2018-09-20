package fr.jmini.empoa.internal.models;

import org.eclipse.microprofile.openapi.models.OpenAPI;

public class OpenAPIImpl implements OpenAPI {

    private java.util.Map<String, Object> _extensions;

    @Override
    public java.util.Map<String, Object> getExtensions() {
        return _extensions;
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        _extensions = extensions;
    }

    @Override
    public OpenAPI addExtension(String key, Object object) {
        if (_extensions == null) {
            _extensions = new java.util.LinkedHashMap<>();
        }
        _extensions.put(key, object);
        return this;
    }

    private String _openapi;

    @Override
    public String getOpenapi() {
        return _openapi;
    }

    @Override
    public void setOpenapi(String openapi) {
        _openapi = openapi;
    }

    @Override
    public OpenAPI openapi(String openapi) {
        setOpenapi(openapi);
        return this;
    }

    private org.eclipse.microprofile.openapi.models.info.Info _info;

    @Override
    public org.eclipse.microprofile.openapi.models.info.Info getInfo() {
        return _info;
    }

    @Override
    public void setInfo(org.eclipse.microprofile.openapi.models.info.Info info) {
        _info = info;
    }

    @Override
    public OpenAPI info(org.eclipse.microprofile.openapi.models.info.Info info) {
        setInfo(info);
        return this;
    }

    private org.eclipse.microprofile.openapi.models.ExternalDocumentation _externalDocs;

    @Override
    public org.eclipse.microprofile.openapi.models.ExternalDocumentation getExternalDocs() {
        return _externalDocs;
    }

    @Override
    public void setExternalDocs(org.eclipse.microprofile.openapi.models.ExternalDocumentation externalDocs) {
        _externalDocs = externalDocs;
    }

    @Override
    public OpenAPI externalDocs(org.eclipse.microprofile.openapi.models.ExternalDocumentation externalDocs) {
        setExternalDocs(externalDocs);
        return this;
    }

    private java.util.List<org.eclipse.microprofile.openapi.models.servers.Server> _servers;

    @Override
    public java.util.List<org.eclipse.microprofile.openapi.models.servers.Server> getServers() {
        return _servers;
    }

    @Override
    public void setServers(java.util.List<org.eclipse.microprofile.openapi.models.servers.Server> servers) {
        _servers = servers;
    }

    @Override
    public OpenAPI servers(java.util.List<org.eclipse.microprofile.openapi.models.servers.Server> servers) {
        setServers(servers);
        return this;
    }

    @Override
    public OpenAPI addServer(org.eclipse.microprofile.openapi.models.servers.Server server) {
        if (_servers == null) {
            _servers = new java.util.ArrayList<>();
        }
        _servers.add(server);
        return this;
    }

    @Override
    public void removeServer(org.eclipse.microprofile.openapi.models.servers.Server server) {
        if (_servers != null) {
            _servers.remove(server);
        }
    }

    private java.util.List<org.eclipse.microprofile.openapi.models.security.SecurityRequirement> _security;

    @Override
    public java.util.List<org.eclipse.microprofile.openapi.models.security.SecurityRequirement> getSecurity() {
        return _security;
    }

    @Override
    public void setSecurity(java.util.List<org.eclipse.microprofile.openapi.models.security.SecurityRequirement> security) {
        _security = security;
    }

    @Override
    public OpenAPI security(java.util.List<org.eclipse.microprofile.openapi.models.security.SecurityRequirement> security) {
        setSecurity(security);
        return this;
    }

    @Override
    public OpenAPI addSecurityRequirement(org.eclipse.microprofile.openapi.models.security.SecurityRequirement securityRequirement) {
        if (_security == null) {
            _security = new java.util.ArrayList<>();
        }
        _security.add(securityRequirement);
        return this;
    }

    @Override
    public void removeSecurityRequirement(org.eclipse.microprofile.openapi.models.security.SecurityRequirement securityRequirement) {
        if (_security != null) {
            _security.remove(securityRequirement);
        }
    }

    private java.util.List<org.eclipse.microprofile.openapi.models.tags.Tag> _tags;

    @Override
    public java.util.List<org.eclipse.microprofile.openapi.models.tags.Tag> getTags() {
        return _tags;
    }

    @Override
    public void setTags(java.util.List<org.eclipse.microprofile.openapi.models.tags.Tag> tags) {
        _tags = tags;
    }

    @Override
    public OpenAPI tags(java.util.List<org.eclipse.microprofile.openapi.models.tags.Tag> tags) {
        setTags(tags);
        return this;
    }

    @Override
    public OpenAPI addTag(org.eclipse.microprofile.openapi.models.tags.Tag tag) {
        if (_tags == null) {
            _tags = new java.util.ArrayList<>();
        }
        _tags.add(tag);
        return this;
    }

    @Override
    public void removeTag(org.eclipse.microprofile.openapi.models.tags.Tag tag) {
        if (_tags != null) {
            _tags.remove(tag);
        }
    }

    private org.eclipse.microprofile.openapi.models.Paths _paths;

    @Override
    public org.eclipse.microprofile.openapi.models.Paths getPaths() {
        return _paths;
    }

    @Override
    public void setPaths(org.eclipse.microprofile.openapi.models.Paths paths) {
        _paths = paths;
    }

    @Override
    public OpenAPI paths(org.eclipse.microprofile.openapi.models.Paths paths) {
        setPaths(paths);
        return this;
    }

    @Override
    public OpenAPI path(String name, org.eclipse.microprofile.openapi.models.PathItem path) {
        if(getPaths() == null) {
            setPaths(new PathsImpl());
        }
        getPaths().addPathItem(name, path);
        return this;
    }

    private org.eclipse.microprofile.openapi.models.Components _components;

    @Override
    public org.eclipse.microprofile.openapi.models.Components getComponents() {
        return _components;
    }

    @Override
    public void setComponents(org.eclipse.microprofile.openapi.models.Components components) {
        _components = components;
    }

    @Override
    public OpenAPI components(org.eclipse.microprofile.openapi.models.Components components) {
        setComponents(components);
        return this;
    }

}
