package fr.jmini.empoa.swagger.parser.internal.models.tags;

import org.eclipse.microprofile.openapi.models.tags.Tag;

public class SwTag implements Tag {

    private io.swagger.v3.oas.models.tags.Tag _swTag;

    public SwTag() {
        _swTag = new io.swagger.v3.oas.models.tags.Tag();
    }

    public SwTag(io.swagger.v3.oas.models.tags.Tag _swTag) {
        this._swTag = _swTag;
    }

    public io.swagger.v3.oas.models.tags.Tag getSw() {
        return _swTag;
    }

    @Override
    public java.util.Map<String, Object> getExtensions() {
        java.util.Map<String, Object> result = _swTag.getExtensions();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        _swTag.setExtensions(null);
        if (extensions != null) {
            if (extensions.isEmpty()) {
                _swTag.setExtensions(new java.util.LinkedHashMap<>());
            } else {
                for (java.util.Map.Entry<String, Object> e : extensions.entrySet()) {
                    this.addExtension(e.getKey(), e.getValue());
                }
            }
        }
    }

    @Override
    public Tag addExtension(String key, Object object) {
        _swTag.addExtension(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
        if (getExtensions() != null) {
            _swTag.getExtensions()
                    .remove(key);
        }
    }

    @Override
    public String getName() {
        return _swTag.getName();
    }

    @Override
    public void setName(String name) {
        _swTag.setName(name);
    }

    @Override
    public String getDescription() {
        return _swTag.getDescription();
    }

    @Override
    public void setDescription(String description) {
        _swTag.setDescription(description);
    }

    private fr.jmini.empoa.swagger.parser.internal.models.SwExternalDocumentation _externalDocs;

    private void initExternalDocs() {
        if (_swTag.getExternalDocs() == null) {
            _externalDocs = null;
        } else if (_externalDocs == null) {
            _externalDocs = new fr.jmini.empoa.swagger.parser.internal.models.SwExternalDocumentation(_swTag.getExternalDocs());
        }
    }

    @Override
    public org.eclipse.microprofile.openapi.models.ExternalDocumentation getExternalDocs() {
        initExternalDocs();
        return _externalDocs;
    }

    @Override
    public void setExternalDocs(org.eclipse.microprofile.openapi.models.ExternalDocumentation externalDocs) {
        if (externalDocs != null) {
            if (!(externalDocs instanceof fr.jmini.empoa.swagger.parser.internal.models.SwExternalDocumentation)) {
                throw new IllegalArgumentException("Unexpected type: " + externalDocs);
            }
            _externalDocs = (fr.jmini.empoa.swagger.parser.internal.models.SwExternalDocumentation) externalDocs;
            _swTag.setExternalDocs(_externalDocs.getSw());
        } else {
            _externalDocs = null;
            _swTag.setExternalDocs(null);
        }
    }

}
