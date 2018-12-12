package fr.jmini.empoa.swagger.parser.internal.models.media;

import org.eclipse.microprofile.openapi.models.media.Schema;

public class SwSchema implements Schema {

    private io.swagger.v3.oas.models.media.Schema _swSchema;

    public SwSchema() {
        _swSchema = new io.swagger.v3.oas.models.media.Schema();
    }

    public SwSchema(io.swagger.v3.oas.models.media.Schema _swSchema) {
        this._swSchema = _swSchema;
    }

    public io.swagger.v3.oas.models.media.Schema getSw() {
        return _swSchema;
    }

    @Override
    public String getRef() {
        return _swSchema.get$ref();
    }

    @Override
    public void setRef(String ref) {
        _swSchema.set$ref(ref);
    }

    @Override
    public java.util.Map<String, Object> getExtensions() {
        java.util.Map<String, Object> result = _swSchema.getExtensions();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(result);
    }

    @Override
    public void setExtensions(java.util.Map<String, Object> extensions) {
        _swSchema.setExtensions(null);
        if (extensions != null) {
            for (java.util.Map.Entry<String, Object> e : extensions.entrySet()) {
                this.addExtension(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Schema addExtension(String key, Object object) {
        _swSchema.addExtension(key, object);
        return this;
    }

    @Override
    public void removeExtension(String key) {
        if (getExtensions() != null) {
            _swSchema.getExtensions()
                    .remove(key);
        }
    }

    private fr.jmini.empoa.swagger.parser.internal.models.media.SwDiscriminator _discriminator;

    private void initDiscriminator() {
        if (_swSchema.getDiscriminator() == null) {
            _discriminator = null;
        } else {
            _discriminator = new fr.jmini.empoa.swagger.parser.internal.models.media.SwDiscriminator(_swSchema.getDiscriminator());
        }
    }

    @Override
    public org.eclipse.microprofile.openapi.models.media.Discriminator getDiscriminator() {
        initDiscriminator();
        return _discriminator;
    }

    @Override
    public void setDiscriminator(org.eclipse.microprofile.openapi.models.media.Discriminator discriminator) {
        if (discriminator != null) {
            if (!(discriminator instanceof fr.jmini.empoa.swagger.parser.internal.models.media.SwDiscriminator)) {
                throw new IllegalArgumentException("Unexpected type: " + discriminator);
            }
            _discriminator = (fr.jmini.empoa.swagger.parser.internal.models.media.SwDiscriminator) discriminator;
            _swSchema.setDiscriminator(_discriminator.getSw());
        } else {
            _discriminator = null;
            _swSchema.setDiscriminator(null);
        }
    }

    @Override
    public String getTitle() {
        return _swSchema.getTitle();
    }

    @Override
    public void setTitle(String title) {
        _swSchema.setTitle(title);
    }

    @Override
    public Object getDefaultValue() {
        return _swSchema.getDefault();
    }

    @Override
    public void setDefaultValue(Object defaultValue) {
        _swSchema.setDefault(defaultValue);
    }

    @Override
    public java.util.List<Object> getEnumeration() {
        java.util.List<Object> result = _swSchema.getEnum();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableList(result);
    }

    @Override
    public void setEnumeration(java.util.List<Object> enumeration) {
        _swSchema.setEnum(null);
        if (enumeration != null) {
            for (Object e : enumeration) {
                this.addEnumeration(e);
            }
        }
    }

    @Override
    public Schema addEnumeration(Object object) {
        _swSchema.addEnumItemObject(object);
        return this;
    }

    @Override
    public void removeEnumeration(Object object) {
        if (_swSchema.getEnum() != null) {
            _swSchema.getEnum()
                    .remove(object);
        }
    }

    @Override
    public java.math.BigDecimal getMultipleOf() {
        return _swSchema.getMultipleOf();
    }

    @Override
    public void setMultipleOf(java.math.BigDecimal multipleOf) {
        _swSchema.setMultipleOf(multipleOf);
    }

    @Override
    public java.math.BigDecimal getMaximum() {
        return _swSchema.getMaximum();
    }

    @Override
    public void setMaximum(java.math.BigDecimal maximum) {
        _swSchema.setMaximum(maximum);
    }

    @Override
    public Boolean getExclusiveMaximum() {
        return _swSchema.getExclusiveMaximum();
    }

    @Override
    public void setExclusiveMaximum(Boolean exclusiveMaximum) {
        _swSchema.setExclusiveMaximum(exclusiveMaximum);
    }

    @Override
    public java.math.BigDecimal getMinimum() {
        return _swSchema.getMinimum();
    }

    @Override
    public void setMinimum(java.math.BigDecimal minimum) {
        _swSchema.setMinimum(minimum);
    }

    @Override
    public Boolean getExclusiveMinimum() {
        return _swSchema.getExclusiveMinimum();
    }

    @Override
    public void setExclusiveMinimum(Boolean exclusiveMinimum) {
        _swSchema.setExclusiveMinimum(exclusiveMinimum);
    }

    @Override
    public Integer getMaxLength() {
        return _swSchema.getMaxLength();
    }

    @Override
    public void setMaxLength(Integer maxLength) {
        _swSchema.setMaxLength(maxLength);
    }

    @Override
    public Integer getMinLength() {
        return _swSchema.getMinLength();
    }

    @Override
    public void setMinLength(Integer minLength) {
        _swSchema.setMinLength(minLength);
    }

    @Override
    public String getPattern() {
        return _swSchema.getPattern();
    }

    @Override
    public void setPattern(String pattern) {
        _swSchema.setPattern(pattern);
    }

    @Override
    public Integer getMaxItems() {
        return _swSchema.getMaxItems();
    }

    @Override
    public void setMaxItems(Integer maxItems) {
        _swSchema.setMaxItems(maxItems);
    }

    @Override
    public Integer getMinItems() {
        return _swSchema.getMinItems();
    }

    @Override
    public void setMinItems(Integer minItems) {
        _swSchema.setMinItems(minItems);
    }

    @Override
    public Boolean getUniqueItems() {
        return _swSchema.getUniqueItems();
    }

    @Override
    public void setUniqueItems(Boolean uniqueItems) {
        _swSchema.setUniqueItems(uniqueItems);
    }

    @Override
    public Integer getMaxProperties() {
        return _swSchema.getMaxProperties();
    }

    @Override
    public void setMaxProperties(Integer maxProperties) {
        _swSchema.setMaxProperties(maxProperties);
    }

    @Override
    public Integer getMinProperties() {
        return _swSchema.getMinProperties();
    }

    @Override
    public void setMinProperties(Integer minProperties) {
        _swSchema.setMinProperties(minProperties);
    }

    @Override
    public java.util.List<String> getRequired() {
        java.util.List<String> result = _swSchema.getRequired();
        if (result == null) {
            return null;
        }
        return java.util.Collections.unmodifiableList(result);
    }

    @Override
    public void setRequired(java.util.List<String> required) {
        _swSchema.setRequired(null);
        if (required != null) {
            for (String e : required) {
                this.addRequired(e);
            }
        }
    }

    @Override
    public Schema addRequired(String string) {
        _swSchema.addRequiredItem(string);
        return this;
    }

    @Override
    public void removeRequired(String string) {
        if (_swSchema.getRequired() != null) {
            _swSchema.getRequired()
                    .remove(string);
        }
    }

    @Override
    public SchemaType getType() {
        if (_swSchema.getType() == null) {
            return null;
        }
        switch (_swSchema.getType()) {
        case "array":
            return org.eclipse.microprofile.openapi.models.media.Schema.SchemaType.ARRAY;
        case "boolean":
            return org.eclipse.microprofile.openapi.models.media.Schema.SchemaType.BOOLEAN;
        case "integer":
            return org.eclipse.microprofile.openapi.models.media.Schema.SchemaType.INTEGER;
        case "number":
            return org.eclipse.microprofile.openapi.models.media.Schema.SchemaType.NUMBER;
        case "object":
            return org.eclipse.microprofile.openapi.models.media.Schema.SchemaType.OBJECT;
        case "string":
            return org.eclipse.microprofile.openapi.models.media.Schema.SchemaType.STRING;
        default:
            throw new IllegalStateException("Unexpected enum value");
        }
    }

    @Override
    public void setType(SchemaType type) {
        if (type == null) {
            _swSchema.setType(null);
        } else {
            _swSchema.setType(type.toString());
        }
    }

    private fr.jmini.empoa.swagger.parser.internal.models.media.SwSchema _not;

    private void initNot() {
        if (_swSchema.getNot() == null) {
            _not = null;
        } else {
            _not = new fr.jmini.empoa.swagger.parser.internal.models.media.SwSchema(_swSchema.getNot());
        }
    }

    @Override
    public org.eclipse.microprofile.openapi.models.media.Schema getNot() {
        initNot();
        return _not;
    }

    @Override
    public void setNot(org.eclipse.microprofile.openapi.models.media.Schema not) {
        if (not != null) {
            if (!(not instanceof fr.jmini.empoa.swagger.parser.internal.models.media.SwSchema)) {
                throw new IllegalArgumentException("Unexpected type: " + not);
            }
            _not = (fr.jmini.empoa.swagger.parser.internal.models.media.SwSchema) not;
            _swSchema.setNot(_not.getSw());
        } else {
            _not = null;
            _swSchema.setNot(null);
        }
    }

    private java.util.Map<String, fr.jmini.empoa.swagger.parser.internal.models.media.SwSchema> _properties;

    private void initProperties() {
        if (_swSchema.getProperties() == null) {
            _properties = null;
        } else {
            _properties = ((java.util.Map<String, io.swagger.v3.oas.models.media.Schema>) _swSchema.getProperties())
                    .entrySet()
                    .stream()
                    .collect(java.util.stream.Collectors.toMap(
                            java.util.Map.Entry::getKey,
                            e -> new fr.jmini.empoa.swagger.parser.internal.models.media.SwSchema(e.getValue()),
                            (k1, k2) -> {
                                throw new IllegalStateException(String.format("Duplicate key %s", k1));
                            },
                            () -> new java.util.LinkedHashMap()));
        }
    }

    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.media.Schema> getProperties() {
        initProperties();
        if (_properties == null) {
            return null;
        }
        return java.util.Collections.unmodifiableMap(_properties);
    }

    @Override
    public void setProperties(java.util.Map<String, org.eclipse.microprofile.openapi.models.media.Schema> properties) {
        _swSchema.setProperties(null);
        if (properties != null) {
            for (java.util.Map.Entry<String, org.eclipse.microprofile.openapi.models.media.Schema> e : properties.entrySet()) {
                this.addProperty(e.getKey(), e.getValue());
            }
        }
    }

    @Override
    public Schema addProperty(String key, org.eclipse.microprofile.openapi.models.media.Schema schema) {
        if (!(schema instanceof fr.jmini.empoa.swagger.parser.internal.models.media.SwSchema)) {
            throw new IllegalArgumentException("Unexpected type: " + schema);
        }
        fr.jmini.empoa.swagger.parser.internal.models.media.SwSchema value = (fr.jmini.empoa.swagger.parser.internal.models.media.SwSchema) schema;
        initProperties();
        if (_properties == null) {
            _properties = new java.util.LinkedHashMap<>();
            _swSchema.setProperties(new java.util.LinkedHashMap<>());
        }
        _properties.put(key, value);
        _swSchema.getProperties()
                .put(key, value.getSw());
        return this;
    }

    @Override
    public void removeProperty(String key) {
        initProperties();
        if (_properties != null) {
            _properties.remove(key);
            _swSchema.getProperties()
                    .remove(key);
        }
    }

    private fr.jmini.empoa.swagger.parser.internal.models.media.SwSchema _additionalPropertiesSchema;

    private void initAdditionalPropertiesSchema() {
        if (_swSchema.getAdditionalPropertiesSchema() == null) {
            _additionalPropertiesSchema = null;
        } else {
            _additionalPropertiesSchema = new fr.jmini.empoa.swagger.parser.internal.models.media.SwSchema(_swSchema.getAdditionalPropertiesSchema());
        }
    }

    @Override
    public org.eclipse.microprofile.openapi.models.media.Schema getAdditionalPropertiesSchema() {
        initAdditionalPropertiesSchema();
        return _additionalPropertiesSchema;
    }

    @Override
    public void setAdditionalPropertiesBoolean(Boolean additionalProperties) {
        _additionalPropertiesSchema = null;
        _additionalPropertiesBoolean = additionalProperties;
    }

    @Override
    public Boolean getAdditionalPropertiesBoolean() {
        return _swSchema.getAdditionalPropertiesBoolean();
    }

    @Override
    public void setAdditionalPropertiesSchema(Schema additionalProperties) {
        _additionalPropertiesBoolean = null;
        _additionalPropertiesSchema = additionalProperties;
    }

    @Override
    public String getDescription() {
        return _swSchema.getDescription();
    }

    @Override
    public void setDescription(String description) {
        _swSchema.setDescription(description);
    }

    @Override
    public String getFormat() {
        return _swSchema.getFormat();
    }

    @Override
    public void setFormat(String format) {
        _swSchema.setFormat(format);
    }

    @Override
    public Boolean getNullable() {
        return _swSchema.getNullable();
    }

    @Override
    public void setNullable(Boolean nullable) {
        _swSchema.setNullable(nullable);
    }

    @Override
    public Boolean getReadOnly() {
        return _swSchema.getReadOnly();
    }

    @Override
    public void setReadOnly(Boolean readOnly) {
        _swSchema.setReadOnly(readOnly);
    }

    @Override
    public Boolean getWriteOnly() {
        return _swSchema.getWriteOnly();
    }

    @Override
    public void setWriteOnly(Boolean writeOnly) {
        _swSchema.setWriteOnly(writeOnly);
    }

    @Override
    public Object getExample() {
        return _swSchema.getExample();
    }

    @Override
    public void setExample(Object example) {
        _swSchema.setExample(example);
    }

    private fr.jmini.empoa.swagger.parser.internal.models.SwExternalDocumentation _externalDocs;

    private void initExternalDocs() {
        if (_swSchema.getExternalDocs() == null) {
            _externalDocs = null;
        } else {
            _externalDocs = new fr.jmini.empoa.swagger.parser.internal.models.SwExternalDocumentation(_swSchema.getExternalDocs());
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
            _swSchema.setExternalDocs(_externalDocs.getSw());
        } else {
            _externalDocs = null;
            _swSchema.setExternalDocs(null);
        }
    }

    @Override
    public Boolean getDeprecated() {
        return _swSchema.getDeprecated();
    }

    @Override
    public void setDeprecated(Boolean deprecated) {
        _swSchema.setDeprecated(deprecated);
    }

    private fr.jmini.empoa.swagger.parser.internal.models.media.SwXML _xml;

    private void initXml() {
        if (_swSchema.getXml() == null) {
            _xml = null;
        } else {
            _xml = new fr.jmini.empoa.swagger.parser.internal.models.media.SwXML(_swSchema.getXml());
        }
    }

    @Override
    public org.eclipse.microprofile.openapi.models.media.XML getXml() {
        initXml();
        return _xml;
    }

    @Override
    public void setXml(org.eclipse.microprofile.openapi.models.media.XML xml) {
        if (xml != null) {
            if (!(xml instanceof fr.jmini.empoa.swagger.parser.internal.models.media.SwXML)) {
                throw new IllegalArgumentException("Unexpected type: " + xml);
            }
            _xml = (fr.jmini.empoa.swagger.parser.internal.models.media.SwXML) xml;
            _swSchema.setXml(_xml.getSw());
        } else {
            _xml = null;
            _swSchema.setXml(null);
        }
    }

    private fr.jmini.empoa.swagger.parser.internal.models.media.SwSchema _items;

    private void initItems() {
        if (_swSchema.getItems() == null) {
            _items = null;
        } else {
            _items = new fr.jmini.empoa.swagger.parser.internal.models.media.SwSchema(_swSchema.getItems());
        }
    }

    @Override
    public org.eclipse.microprofile.openapi.models.media.Schema getItems() {
        initItems();
        return _items;
    }

    @Override
    public void setItems(org.eclipse.microprofile.openapi.models.media.Schema items) {
        if (items != null) {
            if (!(items instanceof fr.jmini.empoa.swagger.parser.internal.models.media.SwSchema)) {
                throw new IllegalArgumentException("Unexpected type: " + items);
            }
            _items = (fr.jmini.empoa.swagger.parser.internal.models.media.SwSchema) items;
            _swSchema.setItems(_items.getSw());
        } else {
            _items = null;
            _swSchema.setItems(null);
        }
    }

    private java.util.List<fr.jmini.empoa.swagger.parser.internal.models.media.SwSchema> _allOf;

    private void initAllOf() {
        if (_swSchema.getAllOf() == null) {
            _allOf = null;
        } else {
            _swSchema.getAllOf()
                    .stream()
                    .map(fr.jmini.empoa.swagger.parser.internal.models.media.SwSchema::new)
                    .collect(java.util.stream.Collectors.toCollection(java.util.ArrayList::new));
        }
    }

    @Override
    public java.util.List<org.eclipse.microprofile.openapi.models.media.Schema> getAllOf() {
        initAllOf();
        if (_allOf == null) {
            return null;
        }
        return java.util.Collections.unmodifiableList(_allOf);
    }

    @Override
    public void setAllOf(java.util.List<org.eclipse.microprofile.openapi.models.media.Schema> allOf) {
        _swSchema.setAllOf(null);
        if (allOf != null) {
            for (org.eclipse.microprofile.openapi.models.media.Schema e : allOf) {
                this.addAllOf(e);
            }
        }
    }

    @Override
    public Schema addAllOf(org.eclipse.microprofile.openapi.models.media.Schema schema) {
        if (!(schema instanceof fr.jmini.empoa.swagger.parser.internal.models.media.SwSchema)) {
            throw new IllegalArgumentException("Unexpected type: " + schema);
        }
        fr.jmini.empoa.swagger.parser.internal.models.media.SwSchema element = (fr.jmini.empoa.swagger.parser.internal.models.media.SwSchema) schema;
        initAllOf();
        if (_allOf == null) {
            _allOf = new java.util.ArrayList<>();
            _swSchema.setAllOf(new java.util.ArrayList<>());
        }
        _allOf.add(element);
        _swSchema.getAllOf()
                .add(element.getSw());
        return this;
    }

    @Override
    public void removeAllOf(org.eclipse.microprofile.openapi.models.media.Schema schema) {
        if (!(schema instanceof fr.jmini.empoa.swagger.parser.internal.models.media.SwSchema)) {
            throw new IllegalArgumentException("Unexpected type: " + schema);
        }
        fr.jmini.empoa.swagger.parser.internal.models.media.SwSchema element = (fr.jmini.empoa.swagger.parser.internal.models.media.SwSchema) schema;
        initAllOf();
        if (_allOf != null) {
            _allOf.remove(schema);
            _swSchema.getAllOf()
                    .remove(element.getSw());
        }
    }

    private java.util.List<fr.jmini.empoa.swagger.parser.internal.models.media.SwSchema> _anyOf;

    private void initAnyOf() {
        if (_swSchema.getAnyOf() == null) {
            _anyOf = null;
        } else {
            _swSchema.getAnyOf()
                    .stream()
                    .map(fr.jmini.empoa.swagger.parser.internal.models.media.SwSchema::new)
                    .collect(java.util.stream.Collectors.toCollection(java.util.ArrayList::new));
        }
    }

    @Override
    public java.util.List<org.eclipse.microprofile.openapi.models.media.Schema> getAnyOf() {
        initAnyOf();
        if (_anyOf == null) {
            return null;
        }
        return java.util.Collections.unmodifiableList(_anyOf);
    }

    @Override
    public void setAnyOf(java.util.List<org.eclipse.microprofile.openapi.models.media.Schema> anyOf) {
        _swSchema.setAnyOf(null);
        if (anyOf != null) {
            for (org.eclipse.microprofile.openapi.models.media.Schema e : anyOf) {
                this.addAnyOf(e);
            }
        }
    }

    @Override
    public Schema addAnyOf(org.eclipse.microprofile.openapi.models.media.Schema schema) {
        if (!(schema instanceof fr.jmini.empoa.swagger.parser.internal.models.media.SwSchema)) {
            throw new IllegalArgumentException("Unexpected type: " + schema);
        }
        fr.jmini.empoa.swagger.parser.internal.models.media.SwSchema element = (fr.jmini.empoa.swagger.parser.internal.models.media.SwSchema) schema;
        initAnyOf();
        if (_anyOf == null) {
            _anyOf = new java.util.ArrayList<>();
            _swSchema.setAnyOf(new java.util.ArrayList<>());
        }
        _anyOf.add(element);
        _swSchema.getAnyOf()
                .add(element.getSw());
        return this;
    }

    @Override
    public void removeAnyOf(org.eclipse.microprofile.openapi.models.media.Schema schema) {
        if (!(schema instanceof fr.jmini.empoa.swagger.parser.internal.models.media.SwSchema)) {
            throw new IllegalArgumentException("Unexpected type: " + schema);
        }
        fr.jmini.empoa.swagger.parser.internal.models.media.SwSchema element = (fr.jmini.empoa.swagger.parser.internal.models.media.SwSchema) schema;
        initAnyOf();
        if (_anyOf != null) {
            _anyOf.remove(schema);
            _swSchema.getAnyOf()
                    .remove(element.getSw());
        }
    }

    private java.util.List<fr.jmini.empoa.swagger.parser.internal.models.media.SwSchema> _oneOf;

    private void initOneOf() {
        if (_swSchema.getOneOf() == null) {
            _oneOf = null;
        } else {
            _swSchema.getOneOf()
                    .stream()
                    .map(fr.jmini.empoa.swagger.parser.internal.models.media.SwSchema::new)
                    .collect(java.util.stream.Collectors.toCollection(java.util.ArrayList::new));
        }
    }

    @Override
    public java.util.List<org.eclipse.microprofile.openapi.models.media.Schema> getOneOf() {
        initOneOf();
        if (_oneOf == null) {
            return null;
        }
        return java.util.Collections.unmodifiableList(_oneOf);
    }

    @Override
    public void setOneOf(java.util.List<org.eclipse.microprofile.openapi.models.media.Schema> oneOf) {
        _swSchema.setOneOf(null);
        if (oneOf != null) {
            for (org.eclipse.microprofile.openapi.models.media.Schema e : oneOf) {
                this.addOneOf(e);
            }
        }
    }

    @Override
    public Schema addOneOf(org.eclipse.microprofile.openapi.models.media.Schema schema) {
        if (!(schema instanceof fr.jmini.empoa.swagger.parser.internal.models.media.SwSchema)) {
            throw new IllegalArgumentException("Unexpected type: " + schema);
        }
        fr.jmini.empoa.swagger.parser.internal.models.media.SwSchema element = (fr.jmini.empoa.swagger.parser.internal.models.media.SwSchema) schema;
        initOneOf();
        if (_oneOf == null) {
            _oneOf = new java.util.ArrayList<>();
            _swSchema.setOneOf(new java.util.ArrayList<>());
        }
        _oneOf.add(element);
        _swSchema.getOneOf()
                .add(element.getSw());
        return this;
    }

    @Override
    public void removeOneOf(org.eclipse.microprofile.openapi.models.media.Schema schema) {
        if (!(schema instanceof fr.jmini.empoa.swagger.parser.internal.models.media.SwSchema)) {
            throw new IllegalArgumentException("Unexpected type: " + schema);
        }
        fr.jmini.empoa.swagger.parser.internal.models.media.SwSchema element = (fr.jmini.empoa.swagger.parser.internal.models.media.SwSchema) schema;
        initOneOf();
        if (_oneOf != null) {
            _oneOf.remove(schema);
            _swSchema.getOneOf()
                    .remove(element.getSw());
        }
    }

}
