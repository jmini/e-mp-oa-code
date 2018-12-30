package fr.jmini.empoa.extended.tck.models;

import static org.assertj.core.api.Assertions.*;

import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.models.Components;
import org.eclipse.microprofile.openapi.models.media.Schema.SchemaType;
import org.testng.annotations.Test;

public class ComponentsTest {

    @Test
    public void testCreateComponents() {
        Components components = OASFactory.createComponents();
        assertThat(components).isNotNull();
    }

    @Test
    public void testAddAPIResponses() {
        Components components = OASFactory.createComponents();

        components.addSchema(
                "MyObject", OASFactory.createSchema()
                        .type(SchemaType.STRING)
        );
        assertThat(components.getSchemas()).containsOnlyKeys("MyObject");

        components.addSchema("MyObject", null);
        assertThat(components.getSchemas()).isEmpty();
    }
}
