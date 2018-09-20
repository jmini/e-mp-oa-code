package fr.jmini.empoa.internal.models;

import org.eclipse.microprofile.openapi.models.ExternalDocumentation;

public class ExternalDocumentationImpl implements ExternalDocumentation {

    private java.util.Map<String, Object> _extensions;

    @Override
    public java.util.Map<String, Object> getExtensions() {
        return _extensions;
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        _extensions = extensions;
    }

    @Override
    public ExternalDocumentation addExtension(String key, Object object) {
        if (_extensions == null) {
            _extensions = new java.util.LinkedHashMap<>();
        }
        _extensions.put(key, object);
        return this;
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

    @Override
    public ExternalDocumentation description(String description) {
        setDescription(description);
        return this;
    }

    private String _url;

    @Override
    public String getUrl() {
        return _url;
    }

    @Override
    public void setUrl(String url) {
        _url = url;
    }

    @Override
    public ExternalDocumentation url(String url) {
        setUrl(url);
        return this;
    }

}
