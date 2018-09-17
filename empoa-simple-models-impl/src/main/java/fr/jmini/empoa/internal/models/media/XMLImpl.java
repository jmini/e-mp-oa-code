package fr.jmini.empoa.internal.models.media;

import org.eclipse.microprofile.openapi.models.media.XML;

public class XMLImpl implements XML {

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
    public XML name(String name) {
        setName(name);
        return this;
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

    @Override
    public XML namespace(String namespace) {
        setNamespace(namespace);
        return this;
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

    @Override
    public XML prefix(String prefix) {
        setPrefix(prefix);
        return this;
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

    @Override
    public XML attribute(Boolean attribute) {
        setAttribute(attribute);
        return this;
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

    @Override
    public XML wrapped(Boolean wrapped) {
        setWrapped(wrapped);
        return this;
    }

}
