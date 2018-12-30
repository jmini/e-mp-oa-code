package fr.jmini.empoa.simple.internal.models.media;

import org.eclipse.microprofile.openapi.models.media.Discriminator;

public class DiscriminatorImpl implements Discriminator {

    private String _propertyName;

    @Override
    public String getPropertyName() {
        return _propertyName;
    }

    @Override
    public void setPropertyName(String propertyName) {
        _propertyName = propertyName;
    }

    private java.util.Map<String, String> _mapping;

    @Override
    public java.util.Map<String, String> getMapping() {
        if (_mapping == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(_mapping);
    }

    @Override
    public void setMapping(java.util.Map<String, String> mapping) {
        if (mapping == null) {
            _mapping = null;
        } else {
            _mapping = new java.util.LinkedHashMap<>();
            _mapping.putAll(mapping);
        }
    }

    @Override
    public Discriminator addMapping(String key, String string) {
        if (string == null) {
            this.removeMapping(key);
        } else {
            if (_mapping == null) {
                _mapping = new java.util.LinkedHashMap<>();
            }
            _mapping.put(key, string);
        }
        return this;
    }

    @Override
    public void removeMapping(String key) {
        if (_mapping != null) {
            _mapping.remove(key);
        }
    }

}
