package fr.jmini.empoa.specs.swagger;

import fr.jmini.empoa.specs.Element;

public class SwElement {

    public final Element oaElement;
    public final String swFqName;

    public SwElement(Element oaElement, String swFqName) {
        this.oaElement = oaElement;
        this.swFqName = swFqName;
    }
}
