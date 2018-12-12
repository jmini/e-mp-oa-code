package fr.jmini.empoa.swagger.parser.internal.models.security;

import org.eclipse.microprofile.openapi.models.security.OAuthFlow;

public class SwOAuthFlow implements OAuthFlow {

    private io.swagger.v3.oas.models.security.OAuthFlow _swOAuthFlow;

    public SwOAuthFlow() {
        _swOAuthFlow = new io.swagger.v3.oas.models.security.OAuthFlow();
    }

    public SwOAuthFlow(io.swagger.v3.oas.models.security.OAuthFlow _swOAuthFlow) {
        this._swOAuthFlow = _swOAuthFlow;
    }

    public io.swagger.v3.oas.models.security.OAuthFlow getSw() {
        return _swOAuthFlow;
    }

    @Override
    public java.util.Map<String, Object> getExtensions() {
        java.util.Map<String, Object> result = _swOAuthFlow.getExtensions();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        _swOAuthFlow.setExtensions(null);
        if (extensions != null) {
            for (java.util.Map.Entry<String, Object> e : extensions.entrySet()) {
                this.addExtension(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public OAuthFlow addExtension(String key, Object object) {
        _swOAuthFlow.addExtension(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
        if (getExtensions() != null) {
            _swOAuthFlow.getExtensions()
                    .remove(key);
        }
    }

    @Override
    public String getAuthorizationUrl() {
        return _swOAuthFlow.getAuthorizationUrl();
    }

    @Override
    public void setAuthorizationUrl(String authorizationUrl) {
        _swOAuthFlow.setAuthorizationUrl(authorizationUrl);
    }

    @Override
    public String getTokenUrl() {
        return _swOAuthFlow.getTokenUrl();
    }

    @Override
    public void setTokenUrl(String tokenUrl) {
        _swOAuthFlow.setTokenUrl(tokenUrl);
    }

    @Override
    public String getRefreshUrl() {
        return _swOAuthFlow.getRefreshUrl();
    }

    @Override
    public void setRefreshUrl(String refreshUrl) {
        _swOAuthFlow.setRefreshUrl(refreshUrl);
    }

    private fr.jmini.empoa.swagger.parser.internal.models.security.SwScopes _scopes;

    private void initScopes() {
        if (_swOAuthFlow.getScopes() == null) {
            _scopes = null;
        } else {
            _scopes = new fr.jmini.empoa.swagger.parser.internal.models.security.SwScopes(_swOAuthFlow.getScopes());
        }
    }

    @Override
    public org.eclipse.microprofile.openapi.models.security.Scopes getScopes() {
        initScopes();
        return _scopes;
    }

    @Override
    public void setScopes(org.eclipse.microprofile.openapi.models.security.Scopes scopes) {
        if (scopes != null) {
            if (!(scopes instanceof fr.jmini.empoa.swagger.parser.internal.models.security.SwScopes)) {
                throw new IllegalArgumentException("Unexpected type: " + scopes);
            }
            _scopes = (fr.jmini.empoa.swagger.parser.internal.models.security.SwScopes) scopes;
            _swOAuthFlow.setScopes(_scopes.getSw());
        } else {
            _scopes = null;
            _swOAuthFlow.setScopes(null);
        }
    }

}
