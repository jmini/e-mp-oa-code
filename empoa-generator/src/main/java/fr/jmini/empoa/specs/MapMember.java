package fr.jmini.empoa.specs;

import fr.jmini.empoa.util.StringUtil;

public class MapMember extends Member {

    public final String valueFqType;
    public final String addName;
    public final boolean hasAdd;
    public final boolean addReturnsVoid;

    public MapMember(MemberType type, String name, String valueFqType) {
        this(type, name, valueFqType, true);
    }

    public MapMember(MemberType type, String name, String valueFqType, boolean hasBuilder) {
        this(type, name, valueFqType, hasBuilder, true);
    }

    public MapMember(MemberType type, String name, String valueFqType, boolean hasBuilder, boolean hasAdd) {
        this(type, name, valueFqType, hasBuilder, hasAdd, false);
    }

    public MapMember(MemberType type, String name, String valueFqType, boolean hasBuilder, boolean hasAdd, boolean addReturnsVoid) {
        this(type, name, valueFqType, "set" + StringUtil.capitalize(name), "get" + StringUtil.capitalize(name), StringUtil.decapitalize(name), "add" + StringUtil.capitalize(StringUtil.singular(name)), addReturnsVoid, hasAdd, hasBuilder);
    }

    public MapMember(MemberType type, String name, String valueFqType, String setterName, String gettterName, String builderName, String addName, boolean addReturnsVoid, boolean hasAdd, boolean hasBuilder) {
        super(type, name, "java.util.Map<String, " + valueFqType + ">", setterName, gettterName, builderName, true, true, true, hasBuilder);
        this.valueFqType = valueFqType;
        this.addName = addName;
        this.hasAdd = hasAdd;
        this.addReturnsVoid = addReturnsVoid;
    }

}
