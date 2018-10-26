package fr.jmini.empoa.swagger.parser.internal.models.info;

import org.eclipse.microprofile.openapi.models.info.Contact;

public class SwContact implements Contact {

    private io.swagger.v3.oas.models.info.Contact swContact;

    public SwContact() {
        swContact = new io.swagger.v3.oas.models.info.Contact();
    }

    public SwContact(io.swagger.v3.oas.models.info.Contact swContact) {
        this.swContact = swContact;
    }

    @Override
    public java.util.Map<String, Object> getExtensions() {
        java.util.Map<String, Object> result = swContact.getExtensions();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        swContact.setExtensions(null);
        if (extensions != null) {
            for (java.util.Map.Entry<String, Object> e : extensions.entrySet()) {
                this.addExtension(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Contact addExtension(String key, Object object) {
        swContact.addExtension(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
    }

    @Override
    public String getName() {
        return swContact.getName();
    }

    @Override
    public void setName(String name) {
        swContact.setName(name);
    }

    @Override
    public String getUrl() {
        return swContact.getUrl();
    }

    @Override
    public void setUrl(String url) {
        swContact.setUrl(url);
    }

    @Override
    public String getEmail() {
        return swContact.getEmail();
    }

    @Override
    public void setEmail(String email) {
        swContact.setEmail(email);
    }

}
