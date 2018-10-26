package fr.jmini.empoa.swagger.parser.internal.models.security;

import org.eclipse.microprofile.openapi.models.security.SecurityScheme;

public class SwSecurityScheme implements SecurityScheme {

    private io.swagger.v3.oas.models.security.SecurityScheme swSecurityScheme;

    public SwSecurityScheme() {
        swSecurityScheme = new io.swagger.v3.oas.models.security.SecurityScheme();
    }

    public SwSecurityScheme(io.swagger.v3.oas.models.security.SecurityScheme swSecurityScheme) {
        this.swSecurityScheme = swSecurityScheme;
    }

    @Override
    public String getRef() {
        return swSecurityScheme.getRef();
    }

    @Override
    public void setRef(String ref) {
    }

    @Override
    public java.util.Map<String, Object> getExtensions() {
        java.util.Map<String, Object> result = swSecurityScheme.getExtensions();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        swSecurityScheme.setExtensions(null);
        if (extensions != null) {
            for (java.util.Map.Entry<String, Object> e : extensions.entrySet()) {
                this.addExtension(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public SecurityScheme addExtension(String key, Object object) {
        swSecurityScheme.addExtension(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
    }

    @Override
    public org.eclipse.microprofile.openapi.models.security.SecurityScheme.Type getType() {
        return swSecurityScheme.getType();
    }

    @Override
    public void setType(org.eclipse.microprofile.openapi.models.security.SecurityScheme.Type type) {
        swSecurityScheme.setType(type);
    }

    @Override
    public String getDescription() {
        return swSecurityScheme.getDescription();
    }

    @Override
    public void setDescription(String description) {
        swSecurityScheme.setDescription(description);
    }

    @Override
    public String getName() {
        return swSecurityScheme.getName();
    }

    @Override
    public void setName(String name) {
        swSecurityScheme.setName(name);
    }

    @Override
    public org.eclipse.microprofile.openapi.models.security.SecurityScheme.In getIn() {
        return swSecurityScheme.getIn();
    }

    @Override
    public void setIn(org.eclipse.microprofile.openapi.models.security.SecurityScheme.In in) {
        swSecurityScheme.setIn(in);
    }

    @Override
    public String getScheme() {
        return swSecurityScheme.getScheme();
    }

    @Override
    public void setScheme(String scheme) {
        swSecurityScheme.setScheme(scheme);
    }

    @Override
    public String getBearerFormat() {
        return swSecurityScheme.getBearerFormat();
    }

    @Override
    public void setBearerFormat(String bearerFormat) {
        swSecurityScheme.setBearerFormat(bearerFormat);
    }

    @Override
    public org.eclipse.microprofile.openapi.models.security.OAuthFlows getFlows() {
        return swSecurityScheme.getFlows();
    }

    @Override
    public void setFlows(org.eclipse.microprofile.openapi.models.security.OAuthFlows flows) {
        swSecurityScheme.setFlows(flows);
    }

    @Override
    public String getOpenIdConnectUrl() {
        return swSecurityScheme.getOpenIdConnectUrl();
    }

    @Override
    public void setOpenIdConnectUrl(String openIdConnectUrl) {
        swSecurityScheme.setOpenIdConnectUrl(openIdConnectUrl);
    }

}
