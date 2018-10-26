package fr.jmini.empoa.swagger.parser.internal.models.media;

import org.eclipse.microprofile.openapi.models.media.Schema;

public class SwSchema implements Schema {

    private io.swagger.v3.oas.models.media.Schema swSchema;

    public SwSchema() {
        swSchema = new io.swagger.v3.oas.models.media.Schema();
    }

    public SwSchema(io.swagger.v3.oas.models.media.Schema swSchema) {
        this.swSchema = swSchema;
    }

    @Override
    public String getRef() {
        return swSchema.getRef();
    }

    @Override
    public void setRef(String ref) {
    }

    @Override
    public java.util.Map<String, Object> getExtensions() {
        java.util.Map<String, Object> result = swSchema.getExtensions();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        swSchema.setExtensions(null);
        if (extensions != null) {
            for (java.util.Map.Entry<String, Object> e : extensions.entrySet()) {
                this.addExtension(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Schema addExtension(String key, Object object) {
        swSchema.addExtension(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
    }

    @Override
    public org.eclipse.microprofile.openapi.models.media.Discriminator getDiscriminator() {
        return swSchema.getDiscriminator();
    }

    @Override
    public void setDiscriminator(org.eclipse.microprofile.openapi.models.media.Discriminator discriminator) {
        swSchema.setDiscriminator(discriminator);
    }

    @Override
    public String getTitle() {
        return swSchema.getTitle();
    }

    @Override
    public void setTitle(String title) {
        swSchema.setTitle(title);
    }

    @Override
    public Object getDefaultValue() {
        return swSchema.getDefaultValue();
    }

    @Override
    public void setDefaultValue(Object defaultValue) {
        swSchema.setDefaultValue(defaultValue);
    }

    @Override
    public java.util.List<Object> getEnumeration() {
        java.util.List<Object> result = swSchema.getEnumeration();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableList(result);
    }

    @Override
    public void setEnumeration(java.util.List<Object> enumeration) {
        swSchema.setEnumeration(null);
        if (enumeration != null) {
            for (Object e : enumeration) {
                this.addEnumeration(e);
            }
        }
    }

    @Override
    public Schema addEnumeration(Object object) {
        swSchema.addEnumeration(e);
        return this;
    }

    @Override
    public void removeEnumeration(Object object) {
    }

    @Override
    public java.math.BigDecimal getMultipleOf() {
        return swSchema.getMultipleOf();
    }

    @Override
    public void setMultipleOf(java.math.BigDecimal multipleOf) {
        swSchema.setMultipleOf(multipleOf);
    }

    @Override
    public java.math.BigDecimal getMaximum() {
        return swSchema.getMaximum();
    }

    @Override
    public void setMaximum(java.math.BigDecimal maximum) {
        swSchema.setMaximum(maximum);
    }

    @Override
    public Boolean getExclusiveMaximum() {
        return swSchema.getExclusiveMaximum();
    }

    @Override
    public void setExclusiveMaximum(Boolean exclusiveMaximum) {
        swSchema.setExclusiveMaximum(exclusiveMaximum);
    }

    @Override
    public java.math.BigDecimal getMinimum() {
        return swSchema.getMinimum();
    }

    @Override
    public void setMinimum(java.math.BigDecimal minimum) {
        swSchema.setMinimum(minimum);
    }

    @Override
    public Boolean getExclusiveMinimum() {
        return swSchema.getExclusiveMinimum();
    }

    @Override
    public void setExclusiveMinimum(Boolean exclusiveMinimum) {
        swSchema.setExclusiveMinimum(exclusiveMinimum);
    }

    @Override
    public Integer getMaxLength() {
        return swSchema.getMaxLength();
    }

    @Override
    public void setMaxLength(Integer maxLength) {
        swSchema.setMaxLength(maxLength);
    }

    @Override
    public Integer getMinLength() {
        return swSchema.getMinLength();
    }

    @Override
    public void setMinLength(Integer minLength) {
        swSchema.setMinLength(minLength);
    }

    @Override
    public String getPattern() {
        return swSchema.getPattern();
    }

    @Override
    public void setPattern(String pattern) {
        swSchema.setPattern(pattern);
    }

    @Override
    public Integer getMaxItems() {
        return swSchema.getMaxItems();
    }

    @Override
    public void setMaxItems(Integer maxItems) {
        swSchema.setMaxItems(maxItems);
    }

    @Override
    public Integer getMinItems() {
        return swSchema.getMinItems();
    }

    @Override
    public void setMinItems(Integer minItems) {
        swSchema.setMinItems(minItems);
    }

    @Override
    public Boolean getUniqueItems() {
        return swSchema.getUniqueItems();
    }

    @Override
    public void setUniqueItems(Boolean uniqueItems) {
        swSchema.setUniqueItems(uniqueItems);
    }

    @Override
    public Integer getMaxProperties() {
        return swSchema.getMaxProperties();
    }

    @Override
    public void setMaxProperties(Integer maxProperties) {
        swSchema.setMaxProperties(maxProperties);
    }

    @Override
    public Integer getMinProperties() {
        return swSchema.getMinProperties();
    }

    @Override
    public void setMinProperties(Integer minProperties) {
        swSchema.setMinProperties(minProperties);
    }

    @Override
    public java.util.List<String> getRequired() {
        java.util.List<String> result = swSchema.getRequired();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableList(result);
    }

    @Override
    public void setRequired(java.util.List<String> required) {
        swSchema.setRequired(null);
        if (required != null) {
            for (String e : required) {
                this.addRequired(e);
            }
        }
    }

    @Override
    public Schema addRequired(String string) {
        swSchema.addRequired(e);
        return this;
    }

    @Override
    public void removeRequired(String string) {
    }

    @Override
    public SchemaType getType() {
        return swSchema.getType();
    }

    @Override
    public void setType(SchemaType type) {
        swSchema.setType(type);
    }

    @Override
    public org.eclipse.microprofile.openapi.models.media.Schema getNot() {
        return swSchema.getNot();
    }

    @Override
    public void setNot(org.eclipse.microprofile.openapi.models.media.Schema not) {
        swSchema.setNot(not);
    }

    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.media.Schema> getProperties() {
        java.util.Map<String, org.eclipse.microprofile.openapi.models.media.Schema> result = swSchema.getProperties();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setProperties(java.util.Map<String, org.eclipse.microprofile.openapi.models.media.Schema> properties) {
        swSchema.setProperties(null);
        if (properties != null) {
            for (java.util.Map.Entry<String, org.eclipse.microprofile.openapi.models.media.Schema> e : properties.entrySet()) {
                this.addProperty(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Schema addProperty(String key, org.eclipse.microprofile.openapi.models.media.Schema schema) {
        swSchema.addProperty(key, schema);
        return this;
    }

    @Override
    public void removeProperty(String key) {
    }

    @Override
    public org.eclipse.microprofile.openapi.models.media.Schema getAdditionalPropertiesSchema() {
        return swSchema.getAdditionalPropertiesSchema();
    }

    @Override
    public void setAdditionalPropertiesBoolean(Boolean additionalProperties) {
        _additionalPropertiesSchema = null;
        _additionalPropertiesBoolean = additionalProperties;
    }

    @Override
    public Boolean getAdditionalPropertiesBoolean() {
        return swSchema.getAdditionalPropertiesBoolean();
    }

    @Override
    public void setAdditionalPropertiesSchema(Schema additionalProperties) {
        _additionalPropertiesBoolean = null;
        _additionalPropertiesSchema = additionalProperties;
    }

    @Override
    public String getDescription() {
        return swSchema.getDescription();
    }

    @Override
    public void setDescription(String description) {
        swSchema.setDescription(description);
    }

    @Override
    public String getFormat() {
        return swSchema.getFormat();
    }

    @Override
    public void setFormat(String format) {
        swSchema.setFormat(format);
    }

    @Override
    public Boolean getNullable() {
        return swSchema.getNullable();
    }

    @Override
    public void setNullable(Boolean nullable) {
        swSchema.setNullable(nullable);
    }

    @Override
    public Boolean getReadOnly() {
        return swSchema.getReadOnly();
    }

    @Override
    public void setReadOnly(Boolean readOnly) {
        swSchema.setReadOnly(readOnly);
    }

    @Override
    public Boolean getWriteOnly() {
        return swSchema.getWriteOnly();
    }

    @Override
    public void setWriteOnly(Boolean writeOnly) {
        swSchema.setWriteOnly(writeOnly);
    }

    @Override
    public Object getExample() {
        return swSchema.getExample();
    }

    @Override
    public void setExample(Object example) {
        swSchema.setExample(example);
    }

    @Override
    public org.eclipse.microprofile.openapi.models.ExternalDocumentation getExternalDocs() {
        return swSchema.getExternalDocs();
    }

    @Override
    public void setExternalDocs(org.eclipse.microprofile.openapi.models.ExternalDocumentation externalDocs) {
        swSchema.setExternalDocs(externalDocs);
    }

    @Override
    public Boolean getDeprecated() {
        return swSchema.getDeprecated();
    }

    @Override
    public void setDeprecated(Boolean deprecated) {
        swSchema.setDeprecated(deprecated);
    }

    @Override
    public org.eclipse.microprofile.openapi.models.media.XML getXml() {
        return swSchema.getXml();
    }

    @Override
    public void setXml(org.eclipse.microprofile.openapi.models.media.XML xml) {
        swSchema.setXml(xml);
    }

    @Override
    public org.eclipse.microprofile.openapi.models.media.Schema getItems() {
        return swSchema.getItems();
    }

    @Override
    public void setItems(org.eclipse.microprofile.openapi.models.media.Schema items) {
        swSchema.setItems(items);
    }

    @Override
    public java.util.List<org.eclipse.microprofile.openapi.models.media.Schema> getAllOf() {
        java.util.List<org.eclipse.microprofile.openapi.models.media.Schema> result = swSchema.getAllOf();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableList(result);
    }

    @Override
    public void setAllOf(java.util.List<org.eclipse.microprofile.openapi.models.media.Schema> allOf) {
        swSchema.setAllOf(null);
        if (allOf != null) {
            for (org.eclipse.microprofile.openapi.models.media.Schema e : allOf) {
                this.addAllOf(e);
            }
        }
    }

    @Override
    public Schema addAllOf(org.eclipse.microprofile.openapi.models.media.Schema schema) {
        swSchema.addAllOf(e);
        return this;
    }

    @Override
    public void removeAllOf(org.eclipse.microprofile.openapi.models.media.Schema schema) {
    }

    @Override
    public java.util.List<org.eclipse.microprofile.openapi.models.media.Schema> getAnyOf() {
        java.util.List<org.eclipse.microprofile.openapi.models.media.Schema> result = swSchema.getAnyOf();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableList(result);
    }

    @Override
    public void setAnyOf(java.util.List<org.eclipse.microprofile.openapi.models.media.Schema> anyOf) {
        swSchema.setAnyOf(null);
        if (anyOf != null) {
            for (org.eclipse.microprofile.openapi.models.media.Schema e : anyOf) {
                this.addAnyOf(e);
            }
        }
    }

    @Override
    public Schema addAnyOf(org.eclipse.microprofile.openapi.models.media.Schema schema) {
        swSchema.addAnyOf(e);
        return this;
    }

    @Override
    public void removeAnyOf(org.eclipse.microprofile.openapi.models.media.Schema schema) {
    }

    @Override
    public java.util.List<org.eclipse.microprofile.openapi.models.media.Schema> getOneOf() {
        java.util.List<org.eclipse.microprofile.openapi.models.media.Schema> result = swSchema.getOneOf();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableList(result);
    }

    @Override
    public void setOneOf(java.util.List<org.eclipse.microprofile.openapi.models.media.Schema> oneOf) {
        swSchema.setOneOf(null);
        if (oneOf != null) {
            for (org.eclipse.microprofile.openapi.models.media.Schema e : oneOf) {
                this.addOneOf(e);
            }
        }
    }

    @Override
    public Schema addOneOf(org.eclipse.microprofile.openapi.models.media.Schema schema) {
        swSchema.addOneOf(e);
        return this;
    }

    @Override
    public void removeOneOf(org.eclipse.microprofile.openapi.models.media.Schema schema) {
    }

}
