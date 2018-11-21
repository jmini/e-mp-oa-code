package fr.jmini.empoa.specs;

import fr.jmini.empoa.util.StringUtil;

public class ListMember extends Member {

    public final String itemFqType;
    public final String addName;
    public final String removeName;

    public ListMember(MemberType type, String name, String itemFqType) {
        this(type, name, itemFqType, "add" + StringUtil.capitalize(StringUtil.singular(name)), "remove" + StringUtil.capitalize(StringUtil.singular(name)));
    }

    public ListMember(MemberType type, String name, String itemFqType, String addName, String removeName) {
        this(type, name, itemFqType, "set" + StringUtil.capitalize(name), "get" + StringUtil.capitalize(name), StringUtil.decapitalize(name), addName, removeName, true);
    }

    public ListMember(MemberType type, String name, String itemFqType, String setterName, String gettterName, String builderName, String addName, String removeName, boolean hasBuilder) {
        super(type, name, "java.util.List<" + itemFqType + ">", setterName, gettterName, builderName, true, true, true, hasBuilder);
        this.itemFqType = itemFqType;
        this.addName = addName;
        this.removeName = removeName;
    }

}
