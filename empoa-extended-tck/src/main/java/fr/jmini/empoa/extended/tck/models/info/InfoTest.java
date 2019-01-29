package fr.jmini.empoa.extended.tck.models.info;

import static org.assertj.core.api.Assertions.assertThat;

import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.models.info.Info;
import org.testng.annotations.Test;

public class InfoTest {

  @Test
  public void testCreateInfo() {
    Info info = OASFactory.createObject(Info.class);
    assertThat(info).isNotNull();
  }

}
