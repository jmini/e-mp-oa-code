package fr.jmini.empoa.swagger.parser.internal.models.media;

import org.eclipse.microprofile.openapi.models.media.MediaType;

public class SwMediaType implements MediaType {

    private io.swagger.v3.oas.models.media.MediaType swMediaType;

    public SwMediaType() {
        swMediaType = new io.swagger.v3.oas.models.media.MediaType();
    }

    public SwMediaType(io.swagger.v3.oas.models.media.MediaType swMediaType) {
        this.swMediaType = swMediaType;
    }

    @Override
    public java.util.Map<String, Object> getExtensions() {
        java.util.Map<String, Object> result = swMediaType.getExtensions();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        swMediaType.setExtensions(null);
        if (extensions != null) {
            for (java.util.Map.Entry<String, Object> e : extensions.entrySet()) {
                this.addExtension(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public MediaType addExtension(String key, Object object) {
        swMediaType.addExtension(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
    }

    @Override
    public org.eclipse.microprofile.openapi.models.media.Schema getSchema() {
        return swMediaType.getSchema();
    }

    @Override
    public void setSchema(org.eclipse.microprofile.openapi.models.media.Schema schema) {
        swMediaType.setSchema(schema);
    }

    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.examples.Example> getExamples() {
        java.util.Map<String, org.eclipse.microprofile.openapi.models.examples.Example> result = swMediaType.getExamples();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExamples(java.util.Map<String, org.eclipse.microprofile.openapi.models.examples.Example> examples) {
        swMediaType.setExamples(null);
        if (examples != null) {
            for (java.util.Map.Entry<String, org.eclipse.microprofile.openapi.models.examples.Example> e : examples.entrySet()) {
                this.addExample(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public MediaType addExample(String key, org.eclipse.microprofile.openapi.models.examples.Example example) {
        swMediaType.addExample(key, example);
        return this;
    }

    @Override
    public void removeExample(String key) {
    }

    @Override
    public Object getExample() {
        return swMediaType.getExample();
    }

    @Override
    public void setExample(Object example) {
        swMediaType.setExample(example);
    }

    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.media.Encoding> getEncoding() {
        java.util.Map<String, org.eclipse.microprofile.openapi.models.media.Encoding> result = swMediaType.getEncoding();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setEncoding(java.util.Map<String, org.eclipse.microprofile.openapi.models.media.Encoding> encoding) {
        swMediaType.setEncoding(null);
        if (encoding != null) {
            for (java.util.Map.Entry<String, org.eclipse.microprofile.openapi.models.media.Encoding> e : encoding.entrySet()) {
                this.addEncoding(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public MediaType addEncoding(String key, org.eclipse.microprofile.openapi.models.media.Encoding encoding) {
        swMediaType.addEncoding(key, encoding);
        return this;
    }

    @Override
    public void removeEncoding(String key) {
    }

}
