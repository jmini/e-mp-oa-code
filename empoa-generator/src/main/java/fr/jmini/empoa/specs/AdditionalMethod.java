package fr.jmini.empoa.specs;

public class AdditionalMethod implements IMember {

    public final Type type;

    public AdditionalMethod(Type type) {
        super();
        this.type = type;
    }

    public static enum Type {
        PathItem_readOperations,
        PathItem_readOperationsMap,
        OpenAPI_path,
        SecurityRequirement_addScheme_singleton,
        SecurityRequirement_addScheme_empty
    }
}
