package fr.jmini.empoa.internal.models.info;

import org.eclipse.microprofile.openapi.models.info.Info;

public class InfoImpl implements Info {

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
    public Info addExtension(String key, Object object) {
        if (_extensions == null) {
            _extensions = new java.util.LinkedHashMap<>();
        }
        _extensions.put(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
        if (_extensions != null) {
            _extensions.remove(key);
        }
    }

    private String _title;

    @Override
    public String getTitle() {
        return _title;
    }

    @Override
    public void setTitle(String title) {
        _title = title;
    }

    private String _description;

    @Override
    public String getDescription() {
        return _description;
    }

    @Override
    public void setDescription(String description) {
        _description = description;
    }

    private String _termsOfService;

    @Override
    public String getTermsOfService() {
        return _termsOfService;
    }

    @Override
    public void setTermsOfService(String termsOfService) {
        _termsOfService = termsOfService;
    }

    private org.eclipse.microprofile.openapi.models.info.Contact _contact;

    @Override
    public org.eclipse.microprofile.openapi.models.info.Contact getContact() {
        return _contact;
    }

    @Override
    public void setContact(org.eclipse.microprofile.openapi.models.info.Contact contact) {
        _contact = contact;
    }

    private org.eclipse.microprofile.openapi.models.info.License _license;

    @Override
    public org.eclipse.microprofile.openapi.models.info.License getLicense() {
        return _license;
    }

    @Override
    public void setLicense(org.eclipse.microprofile.openapi.models.info.License license) {
        _license = license;
    }

    private String _version;

    @Override
    public String getVersion() {
        return _version;
    }

    @Override
    public void setVersion(String version) {
        _version = version;
    }

}
