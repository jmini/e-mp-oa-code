package fr.jmini.empoa.specs;

public class AdditionalMethod implements IMember {

    public final Type type;

    public AdditionalMethod(Type type) {
        super();
        this.type = type;
    }

    public static enum Type {
        PathItem_getOperations,
        OpenAPI_path,
        SecurityRequirement_addScheme_singleton,
        SecurityRequirement_addScheme_empty,
        Schema_setAdditionalPropertiesSchema,
        Schema_setAdditionalPropertiesBoolean,
        APIResponses_getDefaultValue,
        APIResponses_setDefaultValue,
    }
}
