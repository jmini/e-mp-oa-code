package fr.jmini.empoa.extended.tck.models.media;

import static org.assertj.core.api.Assertions.assertThat;

import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.models.media.Content;
import org.testng.annotations.Test;

public class ContentTest {

    @Test
    public void testCreateContent() {
        Content content = OASFactory.createContent();
        assertThat(content).isNotNull();
    }

}
