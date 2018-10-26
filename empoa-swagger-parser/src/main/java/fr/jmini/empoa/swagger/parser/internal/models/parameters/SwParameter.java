package fr.jmini.empoa.swagger.parser.internal.models.parameters;

import org.eclipse.microprofile.openapi.models.parameters.Parameter;

public class SwParameter implements Parameter {

    private io.swagger.v3.oas.models.parameters.Parameter swParameter;

    public SwParameter() {
        swParameter = new io.swagger.v3.oas.models.parameters.Parameter();
    }

    public SwParameter(io.swagger.v3.oas.models.parameters.Parameter swParameter) {
        this.swParameter = swParameter;
    }

    @Override
    public String getRef() {
        return swParameter.getRef();
    }

    @Override
    public void setRef(String ref) {
    }

    @Override
    public java.util.Map<String, Object> getExtensions() {
        java.util.Map<String, Object> result = swParameter.getExtensions();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        swParameter.setExtensions(null);
        if (extensions != null) {
            for (java.util.Map.Entry<String, Object> e : extensions.entrySet()) {
                this.addExtension(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Parameter addExtension(String key, Object object) {
        swParameter.addExtension(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
    }

    @Override
    public String getName() {
        return swParameter.getName();
    }

    @Override
    public void setName(String name) {
        swParameter.setName(name);
    }

    @Override
    public In getIn() {
        return swParameter.getIn();
    }

    @Override
    public void setIn(In in) {
        swParameter.setIn(in);
    }

    @Override
    public String getDescription() {
        return swParameter.getDescription();
    }

    @Override
    public void setDescription(String description) {
        swParameter.setDescription(description);
    }

    @Override
    public Boolean getRequired() {
        return swParameter.getRequired();
    }

    @Override
    public void setRequired(Boolean required) {
        swParameter.setRequired(required);
    }

    @Override
    public Boolean getDeprecated() {
        return swParameter.getDeprecated();
    }

    @Override
    public void setDeprecated(Boolean deprecated) {
        swParameter.setDeprecated(deprecated);
    }

    @Override
    public Boolean getAllowEmptyValue() {
        return swParameter.getAllowEmptyValue();
    }

    @Override
    public void setAllowEmptyValue(Boolean allowEmptyValue) {
        swParameter.setAllowEmptyValue(allowEmptyValue);
    }

    @Override
    public org.eclipse.microprofile.openapi.models.parameters.Parameter.Style getStyle() {
        return swParameter.getStyle();
    }

    @Override
    public void setStyle(org.eclipse.microprofile.openapi.models.parameters.Parameter.Style style) {
        swParameter.setStyle(style);
    }

    @Override
    public Boolean getExplode() {
        return swParameter.getExplode();
    }

    @Override
    public void setExplode(Boolean explode) {
        swParameter.setExplode(explode);
    }

    @Override
    public Boolean getAllowReserved() {
        return swParameter.getAllowReserved();
    }

    @Override
    public void setAllowReserved(Boolean allowReserved) {
        swParameter.setAllowReserved(allowReserved);
    }

    @Override
    public org.eclipse.microprofile.openapi.models.media.Schema getSchema() {
        return swParameter.getSchema();
    }

    @Override
    public void setSchema(org.eclipse.microprofile.openapi.models.media.Schema schema) {
        swParameter.setSchema(schema);
    }

    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.examples.Example> getExamples() {
        java.util.Map<String, org.eclipse.microprofile.openapi.models.examples.Example> result = swParameter.getExamples();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExamples(java.util.Map<String, org.eclipse.microprofile.openapi.models.examples.Example> examples) {
        swParameter.setExamples(null);
        if (examples != null) {
            for (java.util.Map.Entry<String, org.eclipse.microprofile.openapi.models.examples.Example> e : examples.entrySet()) {
                this.addExample(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Parameter addExample(String key, org.eclipse.microprofile.openapi.models.examples.Example example) {
        swParameter.addExample(key, example);
        return this;
    }

    @Override
    public void removeExample(String key) {
    }

    @Override
    public Object getExample() {
        return swParameter.getExample();
    }

    @Override
    public void setExample(Object example) {
        swParameter.setExample(example);
    }

    @Override
    public org.eclipse.microprofile.openapi.models.media.Content getContent() {
        return swParameter.getContent();
    }

    @Override
    public void setContent(org.eclipse.microprofile.openapi.models.media.Content content) {
        swParameter.setContent(content);
    }

}
