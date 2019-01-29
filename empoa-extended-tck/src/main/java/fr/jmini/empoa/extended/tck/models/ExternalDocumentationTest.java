package fr.jmini.empoa.extended.tck.models;

import static org.assertj.core.api.Assertions.assertThat;

import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.models.ExternalDocumentation;
import org.testng.annotations.Test;

public class ExternalDocumentationTest {

  @Test
  public void testCreateExternalDocumentation() {
    ExternalDocumentation externalDocumentation = OASFactory.createObject(ExternalDocumentation.class);
    assertThat(externalDocumentation).isNotNull();
  }

}
