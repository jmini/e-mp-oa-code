package fr.jmini.empoa.extended.tck.models.security;

import static org.assertj.core.api.Assertions.assertThat;

import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.models.security.SecurityScheme;
import org.testng.annotations.Test;

public class SecuritySchemeTest {

    @Test
    public void testCreateSecurityScheme() {
        SecurityScheme securityScheme = OASFactory.createObject(SecurityScheme.class);
        assertThat(securityScheme).isNotNull();
    }

}
