package fr.jmini.empoa.extended.tck.models.examples;

import static org.assertj.core.api.Assertions.assertThat;

import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.models.examples.Example;
import org.testng.annotations.Test;

public class ExampleTest {

  @Test
  public void testCreateExample() {
    Example example = OASFactory.createObject(Example.class);
    assertThat(example).isNotNull();
  }

}
