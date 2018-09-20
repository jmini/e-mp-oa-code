package fr.jmini.empoa.internal.models.security;

import org.eclipse.microprofile.openapi.models.security.OAuthFlow;

public class OAuthFlowImpl implements OAuthFlow {

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
    public OAuthFlow addExtension(String key, Object object) {
        if (_extensions == null) {
            _extensions = new java.util.LinkedHashMap<>();
        }
        _extensions.put(key, object);
        return this;
    }

    private String _authorizationUrl;

    @Override
    public String getAuthorizationUrl() {
        return _authorizationUrl;
    }

    @Override
    public void setAuthorizationUrl(String authorizationUrl) {
        _authorizationUrl = authorizationUrl;
    }

    @Override
    public OAuthFlow authorizationUrl(String authorizationUrl) {
        setAuthorizationUrl(authorizationUrl);
        return this;
    }

    private String _tokenUrl;

    @Override
    public String getTokenUrl() {
        return _tokenUrl;
    }

    @Override
    public void setTokenUrl(String tokenUrl) {
        _tokenUrl = tokenUrl;
    }

    @Override
    public OAuthFlow tokenUrl(String tokenUrl) {
        setTokenUrl(tokenUrl);
        return this;
    }

    private String _refreshUrl;

    @Override
    public String getRefreshUrl() {
        return _refreshUrl;
    }

    @Override
    public void setRefreshUrl(String refreshUrl) {
        _refreshUrl = refreshUrl;
    }

    @Override
    public OAuthFlow refreshUrl(String refreshUrl) {
        setRefreshUrl(refreshUrl);
        return this;
    }

    private org.eclipse.microprofile.openapi.models.security.Scopes _scopes;

    @Override
    public org.eclipse.microprofile.openapi.models.security.Scopes getScopes() {
        return _scopes;
    }

    @Override
    public void setScopes(org.eclipse.microprofile.openapi.models.security.Scopes scopes) {
        _scopes = scopes;
    }

    @Override
    public OAuthFlow scopes(org.eclipse.microprofile.openapi.models.security.Scopes scopes) {
        setScopes(scopes);
        return this;
    }

}
