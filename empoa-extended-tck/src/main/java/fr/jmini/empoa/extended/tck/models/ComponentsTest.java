package fr.jmini.empoa.extended.tck.models;

import static org.assertj.core.api.Assertions.assertThat;

import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.models.Components;
import org.testng.annotations.Test;

public class ComponentsTest {

  @Test
  public void testCreateComponents() {
    Components components = OASFactory.createObject(Components.class);
    assertThat(components).isNotNull();
  }

}
