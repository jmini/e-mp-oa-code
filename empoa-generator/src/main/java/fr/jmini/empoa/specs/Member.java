package fr.jmini.empoa.specs;

import fr.jmini.empoa.util.StringUtil;

public class Member implements IMember {

    public final MemberType type;
    public final String fqType;
    public final String name;
    public final String setterName;
    public final String getterName;
    public final String builderName;
    public final boolean hasMemberDeclaration;
    public final boolean hasGetter;
    public final boolean hasSetter;
    public final boolean hasBuilder;

    public Member(MemberType type, String name, String fqType) {
        this(type, name, fqType, true, true, true, true);
    }

    public Member(MemberType type, String name, String fqType, String getterName) {
        this(type, name, fqType, getterName, true, true, true, true);
    }

    public Member(MemberType type, String name, String fqType, boolean hasMemberDeclaration, boolean hasGetter, boolean hasSetter, boolean hasBuilder) {
        this(type, name, fqType, "get" + StringUtil.capitalize(name), hasMemberDeclaration, hasGetter, hasSetter, hasBuilder);
    }

    public Member(MemberType type, String name, String fqType, String getterName, boolean hasMemberDeclaration, boolean hasGetter, boolean hasSetter, boolean hasBuilder) {
        this(type, name, fqType, "set" + StringUtil.capitalize(name), getterName, toBuilderName(name), hasMemberDeclaration, hasGetter, hasSetter, hasBuilder);
    }

    public Member(MemberType type, String name, String fqType, String setterName, String gettterName, String builderName, boolean hasMemberDeclaration, boolean hasGetter, boolean hasSetter, boolean hasBuilder) {
        super();
        this.type = type;
        this.fqType = fqType;
        this.name = name;
        this.setterName = setterName;
        this.getterName = gettterName;
        this.builderName = builderName;
        this.hasMemberDeclaration = hasMemberDeclaration;
        this.hasGetter = hasGetter;
        this.hasSetter = hasSetter;
        this.hasBuilder = hasBuilder;
    }

    private static String toBuilderName(String name) {
        if (name.matches("[A-Z]+")) {
            return name;
        }
        return StringUtil.decapitalize(name);
    }

}
