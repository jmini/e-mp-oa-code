package fr.jmini.empoa.specs.swagger;

import fr.jmini.empoa.specs.MemberType;
import fr.jmini.empoa.util.StringUtil;

public class SwListMember extends SwMember {

    public final String itemFqType;
    public final String addName;

    public SwListMember(MemberType type, String name, String itemFqType) {
        this(type, name, itemFqType, "add" + StringUtil.capitalize(name) + "Item");
    }

    public SwListMember(MemberType type, String name, String itemFqType, String addName) {
        this(type, name, itemFqType, "set" + StringUtil.capitalize(name), "get" + StringUtil.capitalize(name), StringUtil.decapitalize(name), addName, true);
    }

    public SwListMember(MemberType type, String name, String itemFqType, String setterName, String gettterName, String builderName, String addName, boolean hasBuilder) {
        super(type, name, "java.util.List<" + itemFqType + ">", setterName, gettterName, builderName, true, true, true, hasBuilder);
        this.itemFqType = itemFqType;
        this.addName = addName;
    }

}
