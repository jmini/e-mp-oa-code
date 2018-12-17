package fr.jmini.empoa.extended.tck.models;

import static org.assertj.core.api.Assertions.assertThat;

import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.models.PathItem;
import org.testng.annotations.Test;

public class PathItemTest {

    @Test
    public void testCreatePathItem() {
        PathItem pathItem = OASFactory.createObject(PathItem.class);
        assertThat(pathItem).isNotNull();
    }

}
