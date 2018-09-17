package fr.jmini.empoa.specs;

import java.util.Collections;
import java.util.List;

import fr.jmini.empoa.util.StringUtil;

public class Element {

    public final String fqName;
    public final boolean extensible;
    public final boolean referenceable;
    public final List<IMember> members;
    public final String mapOfItemFq;
    public final String mapAddName;

    public Element(String fqName, boolean extensible, boolean referenceable, List<IMember> members) {
        this(fqName, extensible, referenceable, members, null);
    }

    public Element(String fqName, boolean extensible, boolean referenceable, List<IMember> members, String mapOfItemFq) {
        this(fqName, extensible, referenceable, members, mapOfItemFq, "add" + StringUtil.capitalize(StringUtil.computeSimpleName(mapOfItemFq)));
    }

    public Element(String fqName, boolean extensible, boolean referenceable, List<IMember> members, String mapOfItemFq, String mapAddName) {
        this.fqName = fqName;
        this.extensible = extensible;
        this.referenceable = referenceable;
        this.members = Collections.unmodifiableList(members);
        this.mapOfItemFq = mapOfItemFq;
        this.mapAddName = mapAddName;
    }
}
