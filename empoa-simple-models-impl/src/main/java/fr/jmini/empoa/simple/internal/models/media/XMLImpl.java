package fr.jmini.empoa.simple.internal.models.media;

import org.eclipse.microprofile.openapi.models.media.XML;

public class XMLImpl implements XML {

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
    public XML addExtension(String key, Object object) {
        if (object == null) {
            throw new IllegalArgumentException("Null value for key '" + key + "' is not allowed");
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

    private String _name;

    @Override
    public String getName() {
        return _name;
    }

    @Override
    public void setName(String name) {
        _name = name;
    }

    private String _namespace;

    @Override
    public String getNamespace() {
        return _namespace;
    }

    @Override
    public void setNamespace(String namespace) {
        _namespace = namespace;
    }

    private String _prefix;

    @Override
    public String getPrefix() {
        return _prefix;
    }

    @Override
    public void setPrefix(String prefix) {
        _prefix = prefix;
    }

    private Boolean _attribute;

    @Override
    public Boolean getAttribute() {
        return _attribute;
    }

    @Override
    public void setAttribute(Boolean attribute) {
        _attribute = attribute;
    }

    private Boolean _wrapped;

    @Override
    public Boolean getWrapped() {
        return _wrapped;
    }

    @Override
    public void setWrapped(Boolean wrapped) {
        _wrapped = wrapped;
    }

}
