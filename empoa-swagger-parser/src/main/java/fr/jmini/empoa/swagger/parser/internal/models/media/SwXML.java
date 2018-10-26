package fr.jmini.empoa.swagger.parser.internal.models.media;

import org.eclipse.microprofile.openapi.models.media.XML;

public class SwXML implements XML {

    private io.swagger.v3.oas.models.media.XML swXML;

    public SwXML() {
        swXML = new io.swagger.v3.oas.models.media.XML();
    }

    public SwXML(io.swagger.v3.oas.models.media.XML swXML) {
        this.swXML = swXML;
    }

    @Override
    public java.util.Map<String, Object> getExtensions() {
        java.util.Map<String, Object> result = swXML.getExtensions();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        swXML.setExtensions(null);
        if (extensions != null) {
            for (java.util.Map.Entry<String, Object> e : extensions.entrySet()) {
                this.addExtension(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public XML addExtension(String key, Object object) {
        swXML.addExtension(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
    }

    @Override
    public String getName() {
        return swXML.getName();
    }

    @Override
    public void setName(String name) {
        swXML.setName(name);
    }

    @Override
    public String getNamespace() {
        return swXML.getNamespace();
    }

    @Override
    public void setNamespace(String namespace) {
        swXML.setNamespace(namespace);
    }

    @Override
    public String getPrefix() {
        return swXML.getPrefix();
    }

    @Override
    public void setPrefix(String prefix) {
        swXML.setPrefix(prefix);
    }

    @Override
    public Boolean getAttribute() {
        return swXML.getAttribute();
    }

    @Override
    public void setAttribute(Boolean attribute) {
        swXML.setAttribute(attribute);
    }

    @Override
    public Boolean getWrapped() {
        return swXML.getWrapped();
    }

    @Override
    public void setWrapped(Boolean wrapped) {
        swXML.setWrapped(wrapped);
    }

}
