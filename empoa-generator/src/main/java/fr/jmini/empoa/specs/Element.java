package fr.jmini.empoa.specs;

import java.util.Collections;
import java.util.List;

public class Element {

    public final ElementType type;
    public final String fqName;
    public final boolean extensible;
    public final boolean referenceable;
    public final List<IMember> members;

    public Element(ElementType type, String fqName, boolean extensible, boolean referenceable, List<IMember> members) {
        this.type = type;
        this.fqName = fqName;
        this.extensible = extensible;
        this.referenceable = referenceable;
        this.members = Collections.unmodifiableList(members);
    }
}
