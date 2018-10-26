package fr.jmini.empoa.swagger.parser.internal.models.info;

import org.eclipse.microprofile.openapi.models.info.License;

public class SwLicense implements License {

    private io.swagger.v3.oas.models.info.License swLicense;

    public SwLicense() {
        swLicense = new io.swagger.v3.oas.models.info.License();
    }

    public SwLicense(io.swagger.v3.oas.models.info.License swLicense) {
        this.swLicense = swLicense;
    }

    @Override
    public java.util.Map<String, Object> getExtensions() {
        java.util.Map<String, Object> result = swLicense.getExtensions();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        swLicense.setExtensions(null);
        if (extensions != null) {
            for (java.util.Map.Entry<String, Object> e : extensions.entrySet()) {
                this.addExtension(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public License addExtension(String key, Object object) {
        swLicense.addExtension(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
    }

    @Override
    public String getName() {
        return swLicense.getName();
    }

    @Override
    public void setName(String name) {
        swLicense.setName(name);
    }

    @Override
    public String getUrl() {
        return swLicense.getUrl();
    }

    @Override
    public void setUrl(String url) {
        swLicense.setUrl(url);
    }

}
