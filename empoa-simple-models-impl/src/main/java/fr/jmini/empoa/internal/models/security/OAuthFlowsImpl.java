package fr.jmini.empoa.internal.models.security;

import org.eclipse.microprofile.openapi.models.security.OAuthFlows;

public class OAuthFlowsImpl implements OAuthFlows {

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
    public OAuthFlows addExtension(String key, Object object) {
        if (_extensions == null) {
            _extensions = new java.util.LinkedHashMap<>();
        }
        _extensions.put(key, object);
        return this;
    }

    private org.eclipse.microprofile.openapi.models.security.OAuthFlow _implicit;

    @Override
    public org.eclipse.microprofile.openapi.models.security.OAuthFlow getImplicit() {
        return _implicit;
    }

    @Override
    public void setImplicit(org.eclipse.microprofile.openapi.models.security.OAuthFlow implicit) {
        _implicit = implicit;
    }

    private org.eclipse.microprofile.openapi.models.security.OAuthFlow _password;

    @Override
    public org.eclipse.microprofile.openapi.models.security.OAuthFlow getPassword() {
        return _password;
    }

    @Override
    public void setPassword(org.eclipse.microprofile.openapi.models.security.OAuthFlow password) {
        _password = password;
    }

    private org.eclipse.microprofile.openapi.models.security.OAuthFlow _clientCredentials;

    @Override
    public org.eclipse.microprofile.openapi.models.security.OAuthFlow getClientCredentials() {
        return _clientCredentials;
    }

    @Override
    public void setClientCredentials(org.eclipse.microprofile.openapi.models.security.OAuthFlow clientCredentials) {
        _clientCredentials = clientCredentials;
    }

    private org.eclipse.microprofile.openapi.models.security.OAuthFlow _authorizationCode;

    @Override
    public org.eclipse.microprofile.openapi.models.security.OAuthFlow getAuthorizationCode() {
        return _authorizationCode;
    }

    @Override
    public void setAuthorizationCode(org.eclipse.microprofile.openapi.models.security.OAuthFlow authorizationCode) {
        _authorizationCode = authorizationCode;
    }

}
