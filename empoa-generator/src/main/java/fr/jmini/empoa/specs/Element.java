package fr.jmini.empoa.specs;

import java.util.Collections;
import java.util.List;

import fr.jmini.empoa.util.StringUtil;

public class Element {

    public final ElementType type;
    public final String fqName;
    public final boolean extensible;
    public final boolean referenceable;
    public final List<IMember> members;
    public final String mapOfItemFq;
    public final String mapAddName;

    public Element(ElementType type, String fqName, boolean extensible, boolean referenceable, List<IMember> members) {
        this(type, fqName, extensible, referenceable, members, null);
    }

    public Element(ElementType type, String fqName, boolean extensible, boolean referenceable, List<IMember> members, String mapOfItemFq) {
        this(type, fqName, extensible, referenceable, members, mapOfItemFq, "add" + StringUtil.capitalize(StringUtil.computeSimpleName(mapOfItemFq)));
    }

    public Element(ElementType type, String fqName, boolean extensible, boolean referenceable, List<IMember> members, String mapOfItemFq, String mapAddName) {
        this.type = type;
        this.fqName = fqName;
        this.extensible = extensible;
        this.referenceable = referenceable;
        this.members = Collections.unmodifiableList(members);
        this.mapOfItemFq = mapOfItemFq;
        this.mapAddName = mapAddName;
    }
}
