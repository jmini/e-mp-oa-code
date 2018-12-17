package fr.jmini.empoa.extended.tck.models.links;

import static org.assertj.core.api.Assertions.assertThat;

import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.models.links.Link;
import org.testng.annotations.Test;

public class LinkTest {

    @Test
    public void testCreateLink() {
        Link link = OASFactory.createObject(Link.class);
        assertThat(link).isNotNull();
    }

}
