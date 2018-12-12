package fr.jmini.empoa.swagger.parser.internal.models.media;

import org.eclipse.microprofile.openapi.models.media.XML;

public class SwXML implements XML {

    private io.swagger.v3.oas.models.media.XML _swXML;

    public SwXML() {
        _swXML = new io.swagger.v3.oas.models.media.XML();
    }

    public SwXML(io.swagger.v3.oas.models.media.XML _swXML) {
        this._swXML = _swXML;
    }

    public io.swagger.v3.oas.models.media.XML getSw() {
        return _swXML;
    }

    @Override
    public java.util.Map<String, Object> getExtensions() {
        java.util.Map<String, Object> result = _swXML.getExtensions();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        _swXML.setExtensions(null);
        if (extensions != null) {
            for (java.util.Map.Entry<String, Object> e : extensions.entrySet()) {
                this.addExtension(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public XML addExtension(String key, Object object) {
        _swXML.addExtension(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
        if (getExtensions() != null) {
            _swXML.getExtensions()
                    .remove(key);
        }
    }

    @Override
    public String getName() {
        return _swXML.getName();
    }

    @Override
    public void setName(String name) {
        _swXML.setName(name);
    }

    @Override
    public String getNamespace() {
        return _swXML.getNamespace();
    }

    @Override
    public void setNamespace(String namespace) {
        _swXML.setNamespace(namespace);
    }

    @Override
    public String getPrefix() {
        return _swXML.getPrefix();
    }

    @Override
    public void setPrefix(String prefix) {
        _swXML.setPrefix(prefix);
    }

    @Override
    public Boolean getAttribute() {
        return _swXML.getAttribute();
    }

    @Override
    public void setAttribute(Boolean attribute) {
        _swXML.setAttribute(attribute);
    }

    @Override
    public Boolean getWrapped() {
        return _swXML.getWrapped();
    }

    @Override
    public void setWrapped(Boolean wrapped) {
        _swXML.setWrapped(wrapped);
    }

}
