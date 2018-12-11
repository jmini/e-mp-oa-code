package fr.jmini.empoa.specs.swagger;

import java.util.List;

import fr.jmini.empoa.specs.Element;
import fr.jmini.empoa.specs.IMember;

public class SwElement {

    public final Element mpElement;
    public final String swFqName;
    public final List<IMember> members;

    public SwElement(Element mpElement, String swFqName, List<IMember> members) {
        this.mpElement = mpElement;
        this.swFqName = swFqName;
        this.members = members;
    }
}
