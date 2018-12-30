package fr.jmini.empoa.simple.internal.models.security;

import org.eclipse.microprofile.openapi.models.security.OAuthFlows;

public class OAuthFlowsImpl implements OAuthFlows {

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
    public OAuthFlows addExtension(String key, Object object) {
        if (object == null) {
            this.removeExtension(key);
        } else {
            if (_extensions == null) {
                _extensions = new java.util.LinkedHashMap<>();
            }
            _extensions.put(key, object);
        }
        return this;
    }

    @Override
    public void removeExtension(String key) {
        if (_extensions != null) {
            _extensions.remove(key);
        }
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
