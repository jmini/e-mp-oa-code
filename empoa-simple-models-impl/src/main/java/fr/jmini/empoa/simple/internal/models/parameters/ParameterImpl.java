package fr.jmini.empoa.simple.internal.models.parameters;

import org.eclipse.microprofile.openapi.models.parameters.Parameter;

public class ParameterImpl implements Parameter {

    private String _ref;

    @Override
    public String getRef() {
        return _ref;
    }

    @Override
    public Parameter ref(String ref) {
        setRef(ref);
        return this;
    }

    @Override
    public void setRef(String ref) {
        if (ref != null && !ref.contains("#") && !ref.contains("/")) {
            _ref = "#/components/parameters/" + ref;
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

    private String _name;

    @Override
    public String getName() {
        return _name;
    }

    @Override
    public void setName(String name) {
        _name = name;
    }

    @Override
    public Parameter name(String name) {
        setName(name);
        return this;
    }

    private org.eclipse.microprofile.openapi.models.parameters.Parameter.In _in;

    @Override
    public org.eclipse.microprofile.openapi.models.parameters.Parameter.In getIn() {
        return _in;
    }

    @Override
    public void setIn(org.eclipse.microprofile.openapi.models.parameters.Parameter.In in) {
        _in = in;
    }

    @Override
    public Parameter in(org.eclipse.microprofile.openapi.models.parameters.Parameter.In in) {
        setIn(in);
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
    public Parameter description(String description) {
        setDescription(description);
        return this;
    }

    private Boolean _required;

    @Override
    public Boolean getRequired() {
        return _required;
    }

    @Override
    public void setRequired(Boolean required) {
        _required = required;
    }

    @Override
    public Parameter required(Boolean required) {
        setRequired(required);
        return this;
    }

    private Boolean _deprecated;

    @Override
    public Boolean getDeprecated() {
        return _deprecated;
    }

    @Override
    public void setDeprecated(Boolean deprecated) {
        _deprecated = deprecated;
    }

    @Override
    public Parameter deprecated(Boolean deprecated) {
        setDeprecated(deprecated);
        return this;
    }

    private Boolean _allowEmptyValue;

    @Override
    public Boolean getAllowEmptyValue() {
        return _allowEmptyValue;
    }

    @Override
    public void setAllowEmptyValue(Boolean allowEmptyValue) {
        _allowEmptyValue = allowEmptyValue;
    }

    @Override
    public Parameter allowEmptyValue(Boolean allowEmptyValue) {
        setAllowEmptyValue(allowEmptyValue);
        return this;
    }

    private org.eclipse.microprofile.openapi.models.parameters.Parameter.Style _style;

    @Override
    public org.eclipse.microprofile.openapi.models.parameters.Parameter.Style getStyle() {
        return _style;
    }

    @Override
    public void setStyle(org.eclipse.microprofile.openapi.models.parameters.Parameter.Style style) {
        _style = style;
    }

    @Override
    public Parameter style(org.eclipse.microprofile.openapi.models.parameters.Parameter.Style style) {
        setStyle(style);
        return this;
    }

    private Boolean _explode;

    @Override
    public Boolean getExplode() {
        return _explode;
    }

    @Override
    public void setExplode(Boolean explode) {
        _explode = explode;
    }

    @Override
    public Parameter explode(Boolean explode) {
        setExplode(explode);
        return this;
    }

    private Boolean _allowReserved;

    @Override
    public Boolean getAllowReserved() {
        return _allowReserved;
    }

    @Override
    public void setAllowReserved(Boolean allowReserved) {
        _allowReserved = allowReserved;
    }

    @Override
    public Parameter allowReserved(Boolean allowReserved) {
        setAllowReserved(allowReserved);
        return this;
    }

    private org.eclipse.microprofile.openapi.models.media.Schema _schema;

    @Override
    public org.eclipse.microprofile.openapi.models.media.Schema getSchema() {
        return _schema;
    }

    @Override
    public void setSchema(org.eclipse.microprofile.openapi.models.media.Schema schema) {
        _schema = schema;
    }

    @Override
    public Parameter schema(org.eclipse.microprofile.openapi.models.media.Schema schema) {
        setSchema(schema);
        return this;
    }

    private java.util.Map<String, org.eclipse.microprofile.openapi.models.examples.Example> _examples;

    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.examples.Example> getExamples() {
        return _examples;
    }

    @Override
    public void setExamples(java.util.Map<String, org.eclipse.microprofile.openapi.models.examples.Example> examples) {
        _examples = examples;
    }

    @Override
    public Parameter examples(java.util.Map<String, org.eclipse.microprofile.openapi.models.examples.Example> examples) {
        setExamples(examples);
        return this;
    }

    @Override
    public Parameter addExample(String key, org.eclipse.microprofile.openapi.models.examples.Example example) {
        if (_examples == null) {
            _examples = new java.util.LinkedHashMap<>();
        }
        _examples.put(key, example);
        return this;
    }

    private Object _example;

    @Override
    public Object getExample() {
        return _example;
    }

    @Override
    public void setExample(Object example) {
        _example = example;
    }

    @Override
    public Parameter example(Object example) {
        setExample(example);
        return this;
    }

    private org.eclipse.microprofile.openapi.models.media.Content _content;

    @Override
    public org.eclipse.microprofile.openapi.models.media.Content getContent() {
        return _content;
    }

    @Override
    public void setContent(org.eclipse.microprofile.openapi.models.media.Content content) {
        _content = content;
    }

    @Override
    public Parameter content(org.eclipse.microprofile.openapi.models.media.Content content) {
        setContent(content);
        return this;
    }

}
