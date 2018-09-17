package fr.jmini.empoa.internal.models.media;

import org.eclipse.microprofile.openapi.models.media.MediaType;

public class MediaTypeImpl implements MediaType {

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
    public MediaType schema(org.eclipse.microprofile.openapi.models.media.Schema schema) {
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
    public MediaType examples(java.util.Map<String, org.eclipse.microprofile.openapi.models.examples.Example> examples) {
        setExamples(examples);
        return this;
    }

    @Override
    public MediaType addExample(String key, org.eclipse.microprofile.openapi.models.examples.Example example) {
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
    public MediaType example(Object example) {
        setExample(example);
        return this;
    }

    private java.util.Map<String, org.eclipse.microprofile.openapi.models.media.Encoding> _encoding;

    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.media.Encoding> getEncoding() {
        return _encoding;
    }

    @Override
    public void setEncoding(java.util.Map<String, org.eclipse.microprofile.openapi.models.media.Encoding> encoding) {
        _encoding = encoding;
    }

    @Override
    public MediaType encoding(java.util.Map<String, org.eclipse.microprofile.openapi.models.media.Encoding> encoding) {
        setEncoding(encoding);
        return this;
    }

    @Override
    public MediaType addEncoding(String key, org.eclipse.microprofile.openapi.models.media.Encoding encoding) {
        if (_encoding == null) {
            _encoding = new java.util.LinkedHashMap<>();
        }
        _encoding.put(key, encoding);
        return this;
    }

}
