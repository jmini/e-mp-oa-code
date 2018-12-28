package fr.jmini.empoa.extended.tck.models.media;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;

import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.models.media.Schema;
import org.testng.annotations.Test;

public class SchemaTest {

    @Test
    public void testCreateSchema() {
        Schema schema = OASFactory.createSchema();
        assertThat(schema).isNotNull();
    }

    @Test
    public void testRequired() {
        Schema schema = OASFactory.createObject(Schema.class);

        schema.setRequired(null);
        assertThat(schema.getRequired()).isNull();

        schema.setRequired(Collections.emptyList());
        assertThat(schema.getRequired()).isEmpty();

        schema.setRequired(Collections.singletonList("element"));
        assertThat(schema.getRequired()).containsExactly("element");

        schema.setRequired(Arrays.asList("lorem", "ipsum"));
        assertThat(schema.getRequired()).containsExactlyInAnyOrder("lorem", "ipsum");
    }
}
