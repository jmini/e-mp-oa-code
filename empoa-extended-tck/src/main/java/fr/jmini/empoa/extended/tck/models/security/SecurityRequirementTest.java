package fr.jmini.empoa.extended.tck.models.security;

import static org.assertj.core.api.Assertions.assertThat;

import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.models.security.SecurityRequirement;
import org.testng.annotations.Test;

public class SecurityRequirementTest {

  @Test
  public void testCreateSecurityRequirement() {
    SecurityRequirement securityRequirement = OASFactory.createObject(SecurityRequirement.class);
    assertThat(securityRequirement).isNotNull();
  }

}
