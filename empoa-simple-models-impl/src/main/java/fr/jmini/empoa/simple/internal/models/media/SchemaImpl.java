/*******************************************************************************
 * Copyright 2019 Jeremie Bresson
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package fr.jmini.empoa.simple.internal.models.media;

import org.eclipse.microprofile.openapi.models.media.Schema;

public class SchemaImpl implements Schema {

    private String _ref;

    @Override
    public String getRef() {
        return _ref;
    }

    @Override
    public Schema ref(String ref) {
        setRef(ref);
        return this;
    }

    @Override
    public void setRef(String ref) {
        if (ref != null && !ref.contains("#") && !ref.contains("/")) {
            _ref = "#/components/schemas/" + ref;
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

    private org.eclipse.microprofile.openapi.models.media.Discriminator _discriminator;

    @Override
    public org.eclipse.microprofile.openapi.models.media.Discriminator getDiscriminator() {
        return _discriminator;
    }

    @Override
    public void setDiscriminator(org.eclipse.microprofile.openapi.models.media.Discriminator discriminator) {
        _discriminator = discriminator;
    }

    @Override
    public Schema discriminator(org.eclipse.microprofile.openapi.models.media.Discriminator discriminator) {
        setDiscriminator(discriminator);
        return this;
    }

    private String _title;

    @Override
    public String getTitle() {
        return _title;
    }

    @Override
    public void setTitle(String title) {
        _title = title;
    }

    @Override
    public Schema title(String title) {
        setTitle(title);
        return this;
    }

    private Object _defaultValue;

    @Override
    public Object getDefaultValue() {
        return _defaultValue;
    }

    @Override
    public void setDefaultValue(Object defaultValue) {
        _defaultValue = defaultValue;
    }

    @Override
    public Schema defaultValue(Object defaultValue) {
        setDefaultValue(defaultValue);
        return this;
    }

    private java.util.List<Object> _enumeration;

    @Override
    public java.util.List<Object> getEnumeration() {
        return _enumeration;
    }

    @Override
    public void setEnumeration(java.util.List<Object> enumeration) {
        _enumeration = enumeration;
    }

    @Override
    public Schema enumeration(java.util.List<Object> enumeration) {
        setEnumeration(enumeration);
        return this;
    }

    @Override
    public Schema addEnumeration(Object object) {
        if (_enumeration == null) {
            _enumeration = new java.util.ArrayList<>();
        }
        _enumeration.add(object);
        return this;
    }

    private java.math.BigDecimal _multipleOf;

    @Override
    public java.math.BigDecimal getMultipleOf() {
        return _multipleOf;
    }

    @Override
    public void setMultipleOf(java.math.BigDecimal multipleOf) {
        _multipleOf = multipleOf;
    }

    @Override
    public Schema multipleOf(java.math.BigDecimal multipleOf) {
        setMultipleOf(multipleOf);
        return this;
    }

    private java.math.BigDecimal _maximum;

    @Override
    public java.math.BigDecimal getMaximum() {
        return _maximum;
    }

    @Override
    public void setMaximum(java.math.BigDecimal maximum) {
        _maximum = maximum;
    }

    @Override
    public Schema maximum(java.math.BigDecimal maximum) {
        setMaximum(maximum);
        return this;
    }

    private Boolean _exclusiveMaximum;

    @Override
    public Boolean getExclusiveMaximum() {
        return _exclusiveMaximum;
    }

    @Override
    public void setExclusiveMaximum(Boolean exclusiveMaximum) {
        _exclusiveMaximum = exclusiveMaximum;
    }

    @Override
    public Schema exclusiveMaximum(Boolean exclusiveMaximum) {
        setExclusiveMaximum(exclusiveMaximum);
        return this;
    }

    private java.math.BigDecimal _minimum;

    @Override
    public java.math.BigDecimal getMinimum() {
        return _minimum;
    }

    @Override
    public void setMinimum(java.math.BigDecimal minimum) {
        _minimum = minimum;
    }

    @Override
    public Schema minimum(java.math.BigDecimal minimum) {
        setMinimum(minimum);
        return this;
    }

    private Boolean _exclusiveMinimum;

    @Override
    public Boolean getExclusiveMinimum() {
        return _exclusiveMinimum;
    }

    @Override
    public void setExclusiveMinimum(Boolean exclusiveMinimum) {
        _exclusiveMinimum = exclusiveMinimum;
    }

    @Override
    public Schema exclusiveMinimum(Boolean exclusiveMinimum) {
        setExclusiveMinimum(exclusiveMinimum);
        return this;
    }

    private Integer _maxLength;

    @Override
    public Integer getMaxLength() {
        return _maxLength;
    }

    @Override
    public void setMaxLength(Integer maxLength) {
        _maxLength = maxLength;
    }

    @Override
    public Schema maxLength(Integer maxLength) {
        setMaxLength(maxLength);
        return this;
    }

    private Integer _minLength;

    @Override
    public Integer getMinLength() {
        return _minLength;
    }

    @Override
    public void setMinLength(Integer minLength) {
        _minLength = minLength;
    }

    @Override
    public Schema minLength(Integer minLength) {
        setMinLength(minLength);
        return this;
    }

    private String _pattern;

    @Override
    public String getPattern() {
        return _pattern;
    }

    @Override
    public void setPattern(String pattern) {
        _pattern = pattern;
    }

    @Override
    public Schema pattern(String pattern) {
        setPattern(pattern);
        return this;
    }

    private Integer _maxItems;

    @Override
    public Integer getMaxItems() {
        return _maxItems;
    }

    @Override
    public void setMaxItems(Integer maxItems) {
        _maxItems = maxItems;
    }

    @Override
    public Schema maxItems(Integer maxItems) {
        setMaxItems(maxItems);
        return this;
    }

    private Integer _minItems;

    @Override
    public Integer getMinItems() {
        return _minItems;
    }

    @Override
    public void setMinItems(Integer minItems) {
        _minItems = minItems;
    }

    @Override
    public Schema minItems(Integer minItems) {
        setMinItems(minItems);
        return this;
    }

    private Boolean _uniqueItems;

    @Override
    public Boolean getUniqueItems() {
        return _uniqueItems;
    }

    @Override
    public void setUniqueItems(Boolean uniqueItems) {
        _uniqueItems = uniqueItems;
    }

    @Override
    public Schema uniqueItems(Boolean uniqueItems) {
        setUniqueItems(uniqueItems);
        return this;
    }

    private Integer _maxProperties;

    @Override
    public Integer getMaxProperties() {
        return _maxProperties;
    }

    @Override
    public void setMaxProperties(Integer maxProperties) {
        _maxProperties = maxProperties;
    }

    @Override
    public Schema maxProperties(Integer maxProperties) {
        setMaxProperties(maxProperties);
        return this;
    }

    private Integer _minProperties;

    @Override
    public Integer getMinProperties() {
        return _minProperties;
    }

    @Override
    public void setMinProperties(Integer minProperties) {
        _minProperties = minProperties;
    }

    @Override
    public Schema minProperties(Integer minProperties) {
        setMinProperties(minProperties);
        return this;
    }

    private java.util.List<String> _required;

    @Override
    public java.util.List<String> getRequired() {
        return _required;
    }

    @Override
    public void setRequired(java.util.List<String> required) {
        _required = required;
    }

    @Override
    public Schema required(java.util.List<String> required) {
        setRequired(required);
        return this;
    }

    @Override
    public Schema addRequired(String string) {
        if (_required == null) {
            _required = new java.util.ArrayList<>();
        }
        _required.add(string);
        return this;
    }

    private org.eclipse.microprofile.openapi.models.media.Schema.SchemaType _type;

    @Override
    public org.eclipse.microprofile.openapi.models.media.Schema.SchemaType getType() {
        return _type;
    }

    @Override
    public void setType(org.eclipse.microprofile.openapi.models.media.Schema.SchemaType type) {
        _type = type;
    }

    @Override
    public Schema type(org.eclipse.microprofile.openapi.models.media.Schema.SchemaType type) {
        setType(type);
        return this;
    }

    private org.eclipse.microprofile.openapi.models.media.Schema _not;

    @Override
    public org.eclipse.microprofile.openapi.models.media.Schema getNot() {
        return _not;
    }

    @Override
    public void setNot(org.eclipse.microprofile.openapi.models.media.Schema not) {
        _not = not;
    }

    @Override
    public Schema not(org.eclipse.microprofile.openapi.models.media.Schema not) {
        setNot(not);
        return this;
    }

    private java.util.Map<String, org.eclipse.microprofile.openapi.models.media.Schema> _properties;

    @Override
    public java.util.Map<String, org.eclipse.microprofile.openapi.models.media.Schema> getProperties() {
        return _properties;
    }

    @Override
    public void setProperties(java.util.Map<String, org.eclipse.microprofile.openapi.models.media.Schema> properties) {
        _properties = properties;
    }

    @Override
    public Schema properties(java.util.Map<String, org.eclipse.microprofile.openapi.models.media.Schema> properties) {
        setProperties(properties);
        return this;
    }

    @Override
    public Schema addProperty(String key, org.eclipse.microprofile.openapi.models.media.Schema schema) {
        if (_properties == null) {
            _properties = new java.util.LinkedHashMap<>();
        }
        _properties.put(key, schema);
        return this;
    }

    private Object _additionalProperties;

    @Override
    public Object getAdditionalProperties() {
        return _additionalProperties;
    }

    @Override
    public void setAdditionalProperties(org.eclipse.microprofile.openapi.models.media.Schema additionalProperties) {
        _additionalProperties = additionalProperties;
    }

    @Override
    public Schema additionalProperties(org.eclipse.microprofile.openapi.models.media.Schema additionalProperties) {
        setAdditionalProperties(additionalProperties);
        return this;
    }

    @Override
    public void setAdditionalProperties(Boolean additionalProperties) {
        _additionalProperties = additionalProperties;
    }

    @Override
    public Schema additionalProperties(Boolean additionalProperties) {
        setAdditionalProperties(additionalProperties);
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
    public Schema description(String description) {
        setDescription(description);
        return this;
    }

    private String _format;

    @Override
    public String getFormat() {
        return _format;
    }

    @Override
    public void setFormat(String format) {
        _format = format;
    }

    @Override
    public Schema format(String format) {
        setFormat(format);
        return this;
    }

    private Boolean _nullable;

    @Override
    public Boolean getNullable() {
        return _nullable;
    }

    @Override
    public void setNullable(Boolean nullable) {
        _nullable = nullable;
    }

    @Override
    public Schema nullable(Boolean nullable) {
        setNullable(nullable);
        return this;
    }

    private Boolean _readOnly;

    @Override
    public Boolean getReadOnly() {
        return _readOnly;
    }

    @Override
    public void setReadOnly(Boolean readOnly) {
        _readOnly = readOnly;
    }

    @Override
    public Schema readOnly(Boolean readOnly) {
        setReadOnly(readOnly);
        return this;
    }

    private Boolean _writeOnly;

    @Override
    public Boolean getWriteOnly() {
        return _writeOnly;
    }

    @Override
    public void setWriteOnly(Boolean writeOnly) {
        _writeOnly = writeOnly;
    }

    @Override
    public Schema writeOnly(Boolean writeOnly) {
        setWriteOnly(writeOnly);
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
    public Schema example(Object example) {
        setExample(example);
        return this;
    }

    private org.eclipse.microprofile.openapi.models.ExternalDocumentation _externalDocs;

    @Override
    public org.eclipse.microprofile.openapi.models.ExternalDocumentation getExternalDocs() {
        return _externalDocs;
    }

    @Override
    public void setExternalDocs(org.eclipse.microprofile.openapi.models.ExternalDocumentation externalDocs) {
        _externalDocs = externalDocs;
    }

    @Override
    public Schema externalDocs(org.eclipse.microprofile.openapi.models.ExternalDocumentation externalDocs) {
        setExternalDocs(externalDocs);
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
    public Schema deprecated(Boolean deprecated) {
        setDeprecated(deprecated);
        return this;
    }

    private org.eclipse.microprofile.openapi.models.media.XML _xml;

    @Override
    public org.eclipse.microprofile.openapi.models.media.XML getXml() {
        return _xml;
    }

    @Override
    public void setXml(org.eclipse.microprofile.openapi.models.media.XML xml) {
        _xml = xml;
    }

    @Override
    public Schema xml(org.eclipse.microprofile.openapi.models.media.XML xml) {
        setXml(xml);
        return this;
    }

    private org.eclipse.microprofile.openapi.models.media.Schema _items;

    @Override
    public org.eclipse.microprofile.openapi.models.media.Schema getItems() {
        return _items;
    }

    @Override
    public void setItems(org.eclipse.microprofile.openapi.models.media.Schema items) {
        _items = items;
    }

    @Override
    public Schema items(org.eclipse.microprofile.openapi.models.media.Schema items) {
        setItems(items);
        return this;
    }

    private java.util.List<org.eclipse.microprofile.openapi.models.media.Schema> _allOf;

    @Override
    public java.util.List<org.eclipse.microprofile.openapi.models.media.Schema> getAllOf() {
        return _allOf;
    }

    @Override
    public void setAllOf(java.util.List<org.eclipse.microprofile.openapi.models.media.Schema> allOf) {
        _allOf = allOf;
    }

    @Override
    public Schema allOf(java.util.List<org.eclipse.microprofile.openapi.models.media.Schema> allOf) {
        setAllOf(allOf);
        return this;
    }

    @Override
    public Schema addAllOf(org.eclipse.microprofile.openapi.models.media.Schema schema) {
        if (_allOf == null) {
            _allOf = new java.util.ArrayList<>();
        }
        _allOf.add(schema);
        return this;
    }

    private java.util.List<org.eclipse.microprofile.openapi.models.media.Schema> _anyOf;

    @Override
    public java.util.List<org.eclipse.microprofile.openapi.models.media.Schema> getAnyOf() {
        return _anyOf;
    }

    @Override
    public void setAnyOf(java.util.List<org.eclipse.microprofile.openapi.models.media.Schema> anyOf) {
        _anyOf = anyOf;
    }

    @Override
    public Schema anyOf(java.util.List<org.eclipse.microprofile.openapi.models.media.Schema> anyOf) {
        setAnyOf(anyOf);
        return this;
    }

    @Override
    public Schema addAnyOf(org.eclipse.microprofile.openapi.models.media.Schema schema) {
        if (_anyOf == null) {
            _anyOf = new java.util.ArrayList<>();
        }
        _anyOf.add(schema);
        return this;
    }

    private java.util.List<org.eclipse.microprofile.openapi.models.media.Schema> _oneOf;

    @Override
    public java.util.List<org.eclipse.microprofile.openapi.models.media.Schema> getOneOf() {
        return _oneOf;
    }

    @Override
    public void setOneOf(java.util.List<org.eclipse.microprofile.openapi.models.media.Schema> oneOf) {
        _oneOf = oneOf;
    }

    @Override
    public Schema oneOf(java.util.List<org.eclipse.microprofile.openapi.models.media.Schema> oneOf) {
        setOneOf(oneOf);
        return this;
    }

    @Override
    public Schema addOneOf(org.eclipse.microprofile.openapi.models.media.Schema schema) {
        if (_oneOf == null) {
            _oneOf = new java.util.ArrayList<>();
        }
        _oneOf.add(schema);
        return this;
    }

}
