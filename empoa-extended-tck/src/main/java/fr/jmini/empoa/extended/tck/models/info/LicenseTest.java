package fr.jmini.empoa.extended.tck.models.info;

import static org.assertj.core.api.Assertions.assertThat;

import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.models.info.License;
import org.testng.annotations.Test;

public class LicenseTest {

    @Test
    public void testCreateLicense() {
        License license = OASFactory.createLicense();
        assertThat(license).isNotNull();
    }

}
