package fr.jmini.empoa.swagger.parser.internal.models.security;

import org.eclipse.microprofile.openapi.models.security.OAuthFlow;

public class SwOAuthFlow implements OAuthFlow {

    private io.swagger.v3.oas.models.security.OAuthFlow swOAuthFlow;

    public SwOAuthFlow() {
        swOAuthFlow = new io.swagger.v3.oas.models.security.OAuthFlow();
    }

    public SwOAuthFlow(io.swagger.v3.oas.models.security.OAuthFlow swOAuthFlow) {
        this.swOAuthFlow = swOAuthFlow;
    }

    @Override
    public java.util.Map<String, Object> getExtensions() {
        java.util.Map<String, Object> result = swOAuthFlow.getExtensions();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        swOAuthFlow.setExtensions(null);
        if (extensions != null) {
            for (java.util.Map.Entry<String, Object> e : extensions.entrySet()) {
                this.addExtension(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public OAuthFlow addExtension(String key, Object object) {
        swOAuthFlow.addExtension(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
    }

    @Override
    public String getAuthorizationUrl() {
        return swOAuthFlow.getAuthorizationUrl();
    }

    @Override
    public void setAuthorizationUrl(String authorizationUrl) {
        swOAuthFlow.setAuthorizationUrl(authorizationUrl);
    }

    @Override
    public String getTokenUrl() {
        return swOAuthFlow.getTokenUrl();
    }

    @Override
    public void setTokenUrl(String tokenUrl) {
        swOAuthFlow.setTokenUrl(tokenUrl);
    }

    @Override
    public String getRefreshUrl() {
        return swOAuthFlow.getRefreshUrl();
    }

    @Override
    public void setRefreshUrl(String refreshUrl) {
        swOAuthFlow.setRefreshUrl(refreshUrl);
    }

    @Override
    public org.eclipse.microprofile.openapi.models.security.Scopes getScopes() {
        return swOAuthFlow.getScopes();
    }

    @Override
    public void setScopes(org.eclipse.microprofile.openapi.models.security.Scopes scopes) {
        swOAuthFlow.setScopes(scopes);
    }

}
