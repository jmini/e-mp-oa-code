package fr.jmini.empoa.extended.tck.models.media;

import static org.assertj.core.api.Assertions.assertThat;

import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.models.media.Discriminator;
import org.testng.annotations.Test;

public class DiscriminatorTest {

    @Test
    public void testCreateDiscriminator() {
        Discriminator discriminator = OASFactory.createObject(Discriminator.class);
        assertThat(discriminator).isNotNull();
    }

}
