package fr.jmini.empoa.extended.tck.models.media;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collections;

import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.models.media.Content;
import org.testng.annotations.Test;

public class ContentTest {

    @Test
    public void testCreateContent() {
        Content content = OASFactory.createContent();
        assertThat(content).isNotNull();
    }

    @Test
    public void testSetMediaTypes() {
        Content content = OASFactory.createContent();

        content.setMediaTypes(
                Collections.singletonMap(
                        "application/json", OASFactory.createMediaType()
                )
        );
        assertThat(content.getMediaTypes()).containsOnlyKeys("application/json");

        content.setMediaTypes(Collections.emptyMap());
        assertThat(content.getMediaTypes()).isEmpty();
    }

}
