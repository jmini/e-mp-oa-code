package fr.jmini.empoa.internal.models.examples;

import org.eclipse.microprofile.openapi.models.examples.Example;

public class ExampleImpl implements Example {

    private String _ref;

    @Override
    public String getRef() {
        return _ref;
    }

    @Override
    public Example ref(String ref) {
        setRef(ref);
        return this;
    }

    @Override
    public void setRef(String ref) {
        if (ref != null && !ref.contains("#") && !ref.contains("/")) {
            _ref = "#/components/examples/" + ref;
        } else {
            _ref = ref;
        }
    }

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
    public void addExtension(String key, Object object) {
        if (_extensions == null) {
            _extensions = new java.util.LinkedHashMap<>();
        }
        _extensions.put(key, object);
    }

    private String _summary;

    @Override
    public String getSummary() {
        return _summary;
    }

    @Override
    public void setSummary(String summary) {
        _summary = summary;
    }

    @Override
    public Example summary(String summary) {
        setSummary(summary);
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
    public Example description(String description) {
        setDescription(description);
        return this;
    }

    private Object _value;

    @Override
    public Object getValue() {
        return _value;
    }

    @Override
    public void setValue(Object value) {
        _value = value;
    }

    @Override
    public Example value(Object value) {
        setValue(value);
        return this;
    }

    private String _externalValue;

    @Override
    public String getExternalValue() {
        return _externalValue;
    }

    @Override
    public void setExternalValue(String externalValue) {
        _externalValue = externalValue;
    }

    @Override
    public Example externalValue(String externalValue) {
        setExternalValue(externalValue);
        return this;
    }

}
