package fr.jmini.empoa.extended.tck.models;

import static org.assertj.core.api.Assertions.assertThat;

import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.models.OpenAPI;
import org.testng.annotations.Test;

public class OpenAPITest {

  @Test
  public void testCreateOpenAPI() {
    OpenAPI openAPI = OASFactory.createObject(OpenAPI.class);
    assertThat(openAPI).isNotNull();
  }

}
