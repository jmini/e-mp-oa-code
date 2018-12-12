package fr.jmini.empoa.swagger.parser.internal.models.info;

import org.eclipse.microprofile.openapi.models.info.Info;

public class SwInfo implements Info {

    private io.swagger.v3.oas.models.info.Info _swInfo;

    public SwInfo() {
        _swInfo = new io.swagger.v3.oas.models.info.Info();
    }

    public SwInfo(io.swagger.v3.oas.models.info.Info _swInfo) {
        this._swInfo = _swInfo;
    }

    public io.swagger.v3.oas.models.info.Info getSw() {
        return _swInfo;
    }

    @Override
    public java.util.Map<String, Object> getExtensions() {
        java.util.Map<String, Object> result = _swInfo.getExtensions();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        _swInfo.setExtensions(null);
        if (extensions != null) {
            for (java.util.Map.Entry<String, Object> e : extensions.entrySet()) {
                this.addExtension(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Info addExtension(String key, Object object) {
        _swInfo.addExtension(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
        if (getExtensions() != null) {
            _swInfo.getExtensions()
                    .remove(key);
        }
    }

    @Override
    public String getTitle() {
        return _swInfo.getTitle();
    }

    @Override
    public void setTitle(String title) {
        _swInfo.setTitle(title);
    }

    @Override
    public String getDescription() {
        return _swInfo.getDescription();
    }

    @Override
    public void setDescription(String description) {
        _swInfo.setDescription(description);
    }

    @Override
    public String getTermsOfService() {
        return _swInfo.getTermsOfService();
    }

    @Override
    public void setTermsOfService(String termsOfService) {
        _swInfo.setTermsOfService(termsOfService);
    }

    private fr.jmini.empoa.swagger.parser.internal.models.info.SwContact _contact;

    private void initContact() {
        if (_swInfo.getContact() == null) {
            _contact = null;
        } else {
            _contact = new fr.jmini.empoa.swagger.parser.internal.models.info.SwContact(_swInfo.getContact());
        }
    }

    @Override
    public org.eclipse.microprofile.openapi.models.info.Contact getContact() {
        initContact();
        return _contact;
    }

    @Override
    public void setContact(org.eclipse.microprofile.openapi.models.info.Contact contact) {
        if (contact != null) {
            if (!(contact instanceof fr.jmini.empoa.swagger.parser.internal.models.info.SwContact)) {
                throw new IllegalArgumentException("Unexpected type: " + contact);
            }
            _contact = (fr.jmini.empoa.swagger.parser.internal.models.info.SwContact) contact;
            _swInfo.setContact(_contact.getSw());
        } else {
            _contact = null;
            _swInfo.setContact(null);
        }
    }

    private fr.jmini.empoa.swagger.parser.internal.models.info.SwLicense _license;

    private void initLicense() {
        if (_swInfo.getLicense() == null) {
            _license = null;
        } else {
            _license = new fr.jmini.empoa.swagger.parser.internal.models.info.SwLicense(_swInfo.getLicense());
        }
    }

    @Override
    public org.eclipse.microprofile.openapi.models.info.License getLicense() {
        initLicense();
        return _license;
    }

    @Override
    public void setLicense(org.eclipse.microprofile.openapi.models.info.License license) {
        if (license != null) {
            if (!(license instanceof fr.jmini.empoa.swagger.parser.internal.models.info.SwLicense)) {
                throw new IllegalArgumentException("Unexpected type: " + license);
            }
            _license = (fr.jmini.empoa.swagger.parser.internal.models.info.SwLicense) license;
            _swInfo.setLicense(_license.getSw());
        } else {
            _license = null;
            _swInfo.setLicense(null);
        }
    }

    @Override
    public String getVersion() {
        return _swInfo.getVersion();
    }

    @Override
    public void setVersion(String version) {
        _swInfo.setVersion(version);
    }

}
