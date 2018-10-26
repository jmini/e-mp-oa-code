package fr.jmini.empoa.swagger.parser.internal.models.headers;

import org.eclipse.microprofile.openapi.models.headers.Header;

public class SwHeader implements Header {

    private io.swagger.v3.oas.models.headers.Header swHeader;

    public SwHeader() {
        swHeader = new io.swagger.v3.oas.models.headers.Header();
    }

    public SwHeader(io.swagger.v3.oas.models.headers.Header swHeader) {
        this.swHeader = swHeader;
    }

    @Override
    public String getRef() {
        return swHeader.getRef();
    }

    @Override
    public void setRef(String ref) {
    }

    @Override
    public java.util.Map<String, Object> getExtensions() {
        java.util.Map<String, Object> result = swHeader.getExtensions();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        swHeader.setExtensions(null);
        if (extensions != null) {
            for (java.util.Map.Entry<String, Object> e : extensions.entrySet()) {
                this.addExtension(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Header addExtension(String key, Object object) {
        swHeader.addExtension(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
    }

    @Override
    public String getDescription() {
        return swHeader.getDescription();
    }

    @Override
    public void setDescription(String description) {
        swHeader.setDescription(description);
    }

    @Override
    public Boolean getRequired() {
        return swHeader.getRequired();
    }

    @Override
    public void setRequired(Boolean required) {
        swHeader.setRequired(required);
    }

    @Override
    public Boolean getDeprecated() {
        return swHeader.getDeprecated();
    }

    @Override
    public void setDeprecated(Boolean deprecated) {
        swHeader.setDeprecated(deprecated);
    }

    @Override
    public Boolean getAllowEmptyValue() {
        return swHeader.getAllowEmptyValue();
    }

    @Override
    public void setAllowEmptyValue(Boolean allowEmptyValue) {
        swHeader.setAllowEmptyValue(allowEmptyValue);
    }

    @Override
    public org.eclipse.microprofile.openapi.models.headers.Header.Style getStyle() {
        return swHeader.getStyle();
    }

    @Override
    public void setStyle(org.eclipse.microprofile.openapi.models.headers.Header.Style style) {
        swHeader.setStyle(style);
    }

    @Override
    public Boolean getExplode() {
        return swHeader.getExplode();
    }

    @Override
    public void setExplode(Boolean explode) {
        swHeader.setExplode(explode);
    }

    @Override
    public org.eclipse.microprofile.openapi.models.media.Schema getSchema() {
        return swHeader.getSchema();
    }

    @Override
    public void setSchema(org.eclipse.microprofile.openapi.models.media.Schema schema) {
        swHeader.setSchema(schema);
    }

    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.examples.Example> getExamples() {
        java.util.Map<String, org.eclipse.microprofile.openapi.models.examples.Example> result = swHeader.getExamples();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExamples(java.util.Map<String, org.eclipse.microprofile.openapi.models.examples.Example> examples) {
        swHeader.setExamples(null);
        if (examples != null) {
            for (java.util.Map.Entry<String, org.eclipse.microprofile.openapi.models.examples.Example> e : examples.entrySet()) {
                this.addExample(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Header addExample(String key, org.eclipse.microprofile.openapi.models.examples.Example example) {
        swHeader.addExample(key, example);
        return this;
    }

    @Override
    public void removeExample(String key) {
    }

    @Override
    public Object getExample() {
        return swHeader.getExample();
    }

    @Override
    public void setExample(Object example) {
        swHeader.setExample(example);
    }

    @Override
    public org.eclipse.microprofile.openapi.models.media.Content getContent() {
        return swHeader.getContent();
    }

    @Override
    public void setContent(org.eclipse.microprofile.openapi.models.media.Content content) {
        swHeader.setContent(content);
    }

}
