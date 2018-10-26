package fr.jmini.empoa.swagger.parser.internal.models.security;

import org.eclipse.microprofile.openapi.models.security.OAuthFlows;

public class SwOAuthFlows implements OAuthFlows {

    private io.swagger.v3.oas.models.security.OAuthFlows swOAuthFlows;

    public SwOAuthFlows() {
        swOAuthFlows = new io.swagger.v3.oas.models.security.OAuthFlows();
    }

    public SwOAuthFlows(io.swagger.v3.oas.models.security.OAuthFlows swOAuthFlows) {
        this.swOAuthFlows = swOAuthFlows;
    }

    @Override
    public java.util.Map<String, Object> getExtensions() {
        java.util.Map<String, Object> result = swOAuthFlows.getExtensions();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        swOAuthFlows.setExtensions(null);
        if (extensions != null) {
            for (java.util.Map.Entry<String, Object> e : extensions.entrySet()) {
                this.addExtension(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public OAuthFlows addExtension(String key, Object object) {
        swOAuthFlows.addExtension(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
    }

    @Override
    public org.eclipse.microprofile.openapi.models.security.OAuthFlow getImplicit() {
        return swOAuthFlows.getImplicit();
    }

    @Override
    public void setImplicit(org.eclipse.microprofile.openapi.models.security.OAuthFlow implicit) {
        swOAuthFlows.setImplicit(implicit);
    }

    @Override
    public org.eclipse.microprofile.openapi.models.security.OAuthFlow getPassword() {
        return swOAuthFlows.getPassword();
    }

    @Override
    public void setPassword(org.eclipse.microprofile.openapi.models.security.OAuthFlow password) {
        swOAuthFlows.setPassword(password);
    }

    @Override
    public org.eclipse.microprofile.openapi.models.security.OAuthFlow getClientCredentials() {
        return swOAuthFlows.getClientCredentials();
    }

    @Override
    public void setClientCredentials(org.eclipse.microprofile.openapi.models.security.OAuthFlow clientCredentials) {
        swOAuthFlows.setClientCredentials(clientCredentials);
    }

    @Override
    public org.eclipse.microprofile.openapi.models.security.OAuthFlow getAuthorizationCode() {
        return swOAuthFlows.getAuthorizationCode();
    }

    @Override
    public void setAuthorizationCode(org.eclipse.microprofile.openapi.models.security.OAuthFlow authorizationCode) {
        swOAuthFlows.setAuthorizationCode(authorizationCode);
    }

}
