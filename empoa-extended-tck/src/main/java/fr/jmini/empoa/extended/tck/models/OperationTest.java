package fr.jmini.empoa.extended.tck.models;

import static org.assertj.core.api.Assertions.assertThat;

import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.models.Operation;
import org.testng.annotations.Test;

public class OperationTest {

  @Test
  public void testCreateOperation() {
    Operation operation = OASFactory.createObject(Operation.class);
    assertThat(operation).isNotNull();
  }

}
