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

    @Override
    public Discriminator propertyName(String propertyName) {
        setPropertyName(propertyName);
        return this;
    }

    private java.util.Map<String, String> _mapping;

    @Override
    public java.util.Map<String, String> getMapping() {
        return _mapping;
    }

    @Override
    public void setMapping(java.util.Map<String, String> mapping) {
        _mapping = mapping;
    }

    @Override
    public Discriminator mapping(java.util.Map<String, String> mapping) {
        setMapping(mapping);
        return this;
    }

    @Override
    public Discriminator addMapping(String key, String string) {
        if (_mapping == null) {
            _mapping = new java.util.LinkedHashMap<>();
        }
        _mapping.put(key, string);
        return this;
    }

}
