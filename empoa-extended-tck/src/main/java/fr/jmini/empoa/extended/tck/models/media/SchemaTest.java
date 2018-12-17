package fr.jmini.empoa.extended.tck.models.media;

import static org.assertj.core.api.Assertions.assertThat;

import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.models.media.Schema;
import org.testng.annotations.Test;

public class SchemaTest {

    @Test
    public void testCreateSchema() {
        Schema schema = OASFactory.createSchema();
        assertThat(schema).isNotNull();
    }

}
