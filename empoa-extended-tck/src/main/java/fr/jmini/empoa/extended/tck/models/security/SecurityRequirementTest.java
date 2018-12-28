package fr.jmini.empoa.extended.tck.models.security;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collections;

import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.models.security.SecurityRequirement;
import org.testng.annotations.Test;

public class SecurityRequirementTest {

    @Test
    public void testCreateSecurityRequirement() {
        SecurityRequirement securityRequirement = OASFactory.createSecurityRequirement();
        assertThat(securityRequirement).isNotNull();
    }

    @Test
    public void testSchemes() {
        SecurityRequirement securityRequirement = OASFactory.createSecurityRequirement();

        securityRequirement.setSchemes(
                Collections.singletonMap(
                        "api_key", Collections.emptyList()
                )
        );
        assertThat(securityRequirement.getSchemes()).containsOnlyKeys("api_key");

        securityRequirement.setSchemes(Collections.emptyMap());
        assertThat(securityRequirement.getSchemes()).isEmpty();
    }

}
