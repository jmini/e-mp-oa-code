package fr.jmini.empoa.specs.swagger;

import fr.jmini.empoa.specs.Element;

public class SwElement {

    public final Element mpElement;
    public final String swFqName;

    public SwElement(Element mpElement, String swFqName) {
        this.mpElement = mpElement;
        this.swFqName = swFqName;
    }
}
