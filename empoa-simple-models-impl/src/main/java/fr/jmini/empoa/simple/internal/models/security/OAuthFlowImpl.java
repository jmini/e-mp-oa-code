package fr.jmini.empoa.simple.internal.models.security;

import org.eclipse.microprofile.openapi.models.security.OAuthFlow;

public class OAuthFlowImpl implements OAuthFlow {

    private java.util.Map<String, Object> _extensions;

    @Override
    public java.util.Map<String, Object> getExtensions() {
        if (_extensions == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(_extensions);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        if (extensions == null) {
            _extensions = null;
        } else {
            _extensions = new java.util.LinkedHashMap<>();
            _extensions.putAll(extensions);
        }
    }

    @Override
    public OAuthFlow addExtension(String key, Object object) {
        if (_extensions == null) {
            _extensions = new java.util.LinkedHashMap<>();
        }
        _extensions.put(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
        if (_extensions != null) {
            _extensions.remove(key);
        }
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

    private String _tokenUrl;

    @Override
    public String getTokenUrl() {
        return _tokenUrl;
    }

    @Override
    public void setTokenUrl(String tokenUrl) {
        _tokenUrl = tokenUrl;
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

    private org.eclipse.microprofile.openapi.models.security.Scopes _scopes;

    @Override
    public org.eclipse.microprofile.openapi.models.security.Scopes getScopes() {
        return _scopes;
    }

    @Override
    public void setScopes(org.eclipse.microprofile.openapi.models.security.Scopes scopes) {
        _scopes = scopes;
    }

}
