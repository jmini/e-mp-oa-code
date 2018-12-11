package fr.jmini.empoa.specs.swagger;

import fr.jmini.empoa.specs.MemberType;
import fr.jmini.empoa.util.StringUtil;

public class SwMapMember extends SwMember {

    public final String valueFqType;
    public final String addName;
    public final boolean hasAdd;
    public final boolean addReturnsVoid;
    public final String removeName;

    public SwMapMember(MemberType type, String name, String valueFqType) {
        this(type, name, valueFqType, true);
    }

    public SwMapMember(MemberType type, String name, String valueFqType, boolean hasBuilder) {
        this(type, name, valueFqType, hasBuilder, true);
    }

    public SwMapMember(MemberType type, String name, String valueFqType, boolean hasBuilder, boolean hasAdd) {
        this(type, name, valueFqType, hasBuilder, hasAdd, false);
    }

    public SwMapMember(MemberType type, String name, String valueFqType, boolean hasBuilder, boolean hasAdd, boolean addReturnsVoid) {
        this(type, name, valueFqType, "set" + StringUtil.capitalize(name), "get" + StringUtil.capitalize(name), StringUtil.decapitalize(name), "add" + StringUtil.capitalize(StringUtil.singular(name)), addReturnsVoid, hasAdd, hasBuilder,
                "remove" + StringUtil.capitalize(StringUtil.singular(name)));
    }

    public SwMapMember(MemberType type, String name, String valueFqType, String setterName, String gettterName, String builderName, String addName, boolean addReturnsVoid, boolean hasAdd, boolean hasBuilder, String removeName) {
        super(type, name, "java.util.Map<String, " + valueFqType + ">", setterName, gettterName, builderName, true, true, true, hasBuilder);
        this.valueFqType = valueFqType;
        this.addName = addName;
        this.hasAdd = hasAdd;
        this.addReturnsVoid = addReturnsVoid;
        this.removeName = removeName;
    }

}
