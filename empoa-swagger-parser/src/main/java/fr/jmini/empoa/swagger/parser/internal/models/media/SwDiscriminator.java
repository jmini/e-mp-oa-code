package fr.jmini.empoa.swagger.parser.internal.models.media;

import org.eclipse.microprofile.openapi.models.media.Discriminator;

public class SwDiscriminator implements Discriminator {

    private io.swagger.v3.oas.models.media.Discriminator swDiscriminator;

    public SwDiscriminator() {
        swDiscriminator = new io.swagger.v3.oas.models.media.Discriminator();
    }

    public SwDiscriminator(io.swagger.v3.oas.models.media.Discriminator swDiscriminator) {
        this.swDiscriminator = swDiscriminator;
    }

    @Override
    public String getPropertyName() {
        return swDiscriminator.getPropertyName();
    }

    @Override
    public void setPropertyName(String propertyName) {
        swDiscriminator.setPropertyName(propertyName);
    }

    @Override
    public java.util.Map<String, String> getMapping() {
        java.util.Map<String, String> result = swDiscriminator.getMapping();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setMapping(java.util.Map<String, String> mapping) {
        swDiscriminator.setMapping(null);
        if (mapping != null) {
            for (java.util.Map.Entry<String, String> e : mapping.entrySet()) {
                this.addMapping(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Discriminator addMapping(String key, String string) {
        swDiscriminator.addMapping(key, string);
        return this;
    }

    @Override
    public void removeMapping(String key) {
    }

}
