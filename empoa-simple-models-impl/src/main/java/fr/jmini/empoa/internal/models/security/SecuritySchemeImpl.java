package fr.jmini.empoa.internal.models.security;

import org.eclipse.microprofile.openapi.models.security.SecurityScheme;

public class SecuritySchemeImpl implements SecurityScheme {

    private String _ref;

    @Override
    public String getRef() {
        return _ref;
    }

    @Override
    public SecurityScheme ref(String ref) {
        setRef(ref);
        return this;
    }

    @Override
    public void setRef(String ref) {
        if (ref != null && !ref.contains("#") && !ref.contains("/")) {
            _ref = "#/components/securitySchemes/" + ref;
        } else {
            _ref = ref;
        }
    }

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
    public void addExtension(String key, Object object) {
        if (_extensions == null) {
            _extensions = new java.util.LinkedHashMap<>();
        }
        _extensions.put(key, object);
    }

    private org.eclipse.microprofile.openapi.models.security.SecurityScheme.Type _type;

    @Override
    public org.eclipse.microprofile.openapi.models.security.SecurityScheme.Type getType() {
        return _type;
    }

    @Override
    public void setType(org.eclipse.microprofile.openapi.models.security.SecurityScheme.Type type) {
        _type = type;
    }

    @Override
    public SecurityScheme type(org.eclipse.microprofile.openapi.models.security.SecurityScheme.Type type) {
        setType(type);
        return this;
    }

    private String _description;

    @Override
    public String getDescription() {
        return _description;
    }

    @Override
    public void setDescription(String description) {
        _description = description;
    }

    @Override
    public SecurityScheme description(String description) {
        setDescription(description);
        return this;
    }

    private String _name;

    @Override
    public String getName() {
        return _name;
    }

    @Override
    public void setName(String name) {
        _name = name;
    }

    @Override
    public SecurityScheme name(String name) {
        setName(name);
        return this;
    }

    private org.eclipse.microprofile.openapi.models.security.SecurityScheme.In _in;

    @Override
    public org.eclipse.microprofile.openapi.models.security.SecurityScheme.In getIn() {
        return _in;
    }

    @Override
    public void setIn(org.eclipse.microprofile.openapi.models.security.SecurityScheme.In in) {
        _in = in;
    }

    @Override
    public SecurityScheme in(org.eclipse.microprofile.openapi.models.security.SecurityScheme.In in) {
        setIn(in);
        return this;
    }

    private String _scheme;

    @Override
    public String getScheme() {
        return _scheme;
    }

    @Override
    public void setScheme(String scheme) {
        _scheme = scheme;
    }

    @Override
    public SecurityScheme scheme(String scheme) {
        setScheme(scheme);
        return this;
    }

    private String _bearerFormat;

    @Override
    public String getBearerFormat() {
        return _bearerFormat;
    }

    @Override
    public void setBearerFormat(String bearerFormat) {
        _bearerFormat = bearerFormat;
    }

    @Override
    public SecurityScheme bearerFormat(String bearerFormat) {
        setBearerFormat(bearerFormat);
        return this;
    }

    private org.eclipse.microprofile.openapi.models.security.OAuthFlows _flows;

    @Override
    public org.eclipse.microprofile.openapi.models.security.OAuthFlows getFlows() {
        return _flows;
    }

    @Override
    public void setFlows(org.eclipse.microprofile.openapi.models.security.OAuthFlows flows) {
        _flows = flows;
    }

    @Override
    public SecurityScheme flows(org.eclipse.microprofile.openapi.models.security.OAuthFlows flows) {
        setFlows(flows);
        return this;
    }

    private String _openIdConnectUrl;

    @Override
    public String getOpenIdConnectUrl() {
        return _openIdConnectUrl;
    }

    @Override
    public void setOpenIdConnectUrl(String openIdConnectUrl) {
        _openIdConnectUrl = openIdConnectUrl;
    }

    @Override
    public SecurityScheme openIdConnectUrl(String openIdConnectUrl) {
        setOpenIdConnectUrl(openIdConnectUrl);
        return this;
    }

}
