package fr.jmini.empoa.extended.tck.models;

import static org.assertj.core.api.Assertions.assertThat;

import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.models.Paths;
import org.testng.annotations.Test;

public class PathsTest {

  @Test
  public void testCreatePaths() {
    Paths paths = OASFactory.createObject(Paths.class);
    assertThat(paths).isNotNull();
  }

}
