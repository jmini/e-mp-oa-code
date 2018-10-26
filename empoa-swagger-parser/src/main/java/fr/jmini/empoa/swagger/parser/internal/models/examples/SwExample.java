package fr.jmini.empoa.swagger.parser.internal.models.examples;

import org.eclipse.microprofile.openapi.models.examples.Example;

public class SwExample implements Example {

    private io.swagger.v3.oas.models.examples.Example swExample;

    public SwExample() {
        swExample = new io.swagger.v3.oas.models.examples.Example();
    }

    public SwExample(io.swagger.v3.oas.models.examples.Example swExample) {
        this.swExample = swExample;
    }

    @Override
    public String getRef() {
        return swExample.getRef();
    }

    @Override
    public void setRef(String ref) {
    }

    @Override
    public java.util.Map<String, Object> getExtensions() {
        java.util.Map<String, Object> result = swExample.getExtensions();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        swExample.setExtensions(null);
        if (extensions != null) {
            for (java.util.Map.Entry<String, Object> e : extensions.entrySet()) {
                this.addExtension(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Example addExtension(String key, Object object) {
        swExample.addExtension(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
    }

    @Override
    public String getSummary() {
        return swExample.getSummary();
    }

    @Override
    public void setSummary(String summary) {
        swExample.setSummary(summary);
    }

    @Override
    public String getDescription() {
        return swExample.getDescription();
    }

    @Override
    public void setDescription(String description) {
        swExample.setDescription(description);
    }

    @Override
    public Object getValue() {
        return swExample.getValue();
    }

    @Override
    public void setValue(Object value) {
        swExample.setValue(value);
    }

    @Override
    public String getExternalValue() {
        return swExample.getExternalValue();
    }

    @Override
    public void setExternalValue(String externalValue) {
        swExample.setExternalValue(externalValue);
    }

}
