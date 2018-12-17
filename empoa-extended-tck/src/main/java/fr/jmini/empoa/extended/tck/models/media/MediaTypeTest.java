package fr.jmini.empoa.extended.tck.models.media;

import static org.assertj.core.api.Assertions.assertThat;

import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.models.media.MediaType;
import org.testng.annotations.Test;

public class MediaTypeTest {

    @Test
    public void testCreateMediaType() {
        MediaType mediaType = OASFactory.createMediaType();
        assertThat(mediaType).isNotNull();
    }

}
