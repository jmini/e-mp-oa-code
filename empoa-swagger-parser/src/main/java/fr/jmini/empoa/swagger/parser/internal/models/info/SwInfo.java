package fr.jmini.empoa.swagger.parser.internal.models.info;

import org.eclipse.microprofile.openapi.models.info.Info;

public class SwInfo implements Info {

    private io.swagger.v3.oas.models.info.Info swInfo;

    public SwInfo() {
        swInfo = new io.swagger.v3.oas.models.info.Info();
    }

    public SwInfo(io.swagger.v3.oas.models.info.Info swInfo) {
        this.swInfo = swInfo;
    }

    @Override
    public java.util.Map<String, Object> getExtensions() {
        java.util.Map<String, Object> result = swInfo.getExtensions();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        swInfo.setExtensions(null);
        if (extensions != null) {
            for (java.util.Map.Entry<String, Object> e : extensions.entrySet()) {
                this.addExtension(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Info addExtension(String key, Object object) {
        swInfo.addExtension(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
    }

    @Override
    public String getTitle() {
        return swInfo.getTitle();
    }

    @Override
    public void setTitle(String title) {
        swInfo.setTitle(title);
    }

    @Override
    public String getDescription() {
        return swInfo.getDescription();
    }

    @Override
    public void setDescription(String description) {
        swInfo.setDescription(description);
    }

    @Override
    public String getTermsOfService() {
        return swInfo.getTermsOfService();
    }

    @Override
    public void setTermsOfService(String termsOfService) {
        swInfo.setTermsOfService(termsOfService);
    }

    @Override
    public org.eclipse.microprofile.openapi.models.info.Contact getContact() {
        return swInfo.getContact();
    }

    @Override
    public void setContact(org.eclipse.microprofile.openapi.models.info.Contact contact) {
        swInfo.setContact(contact);
    }

    @Override
    public org.eclipse.microprofile.openapi.models.info.License getLicense() {
        return swInfo.getLicense();
    }

    @Override
    public void setLicense(org.eclipse.microprofile.openapi.models.info.License license) {
        swInfo.setLicense(license);
    }

    @Override
    public String getVersion() {
        return swInfo.getVersion();
    }

    @Override
    public void setVersion(String version) {
        swInfo.setVersion(version);
    }

}
