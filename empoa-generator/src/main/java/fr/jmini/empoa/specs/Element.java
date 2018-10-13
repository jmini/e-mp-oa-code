package fr.jmini.empoa.specs;

import java.util.Collections;
import java.util.List;

public class Element {

    public final String fqName;
    public final boolean extensible;
    public final boolean referenceable;
    public final List<IMember> members;

    public Element(String fqName, boolean extensible, boolean referenceable, List<IMember> members) {
        this.fqName = fqName;
        this.extensible = extensible;
        this.referenceable = referenceable;
        this.members = Collections.unmodifiableList(members);
    }
}
