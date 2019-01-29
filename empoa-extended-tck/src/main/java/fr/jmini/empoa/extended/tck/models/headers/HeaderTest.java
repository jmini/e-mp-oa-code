package fr.jmini.empoa.extended.tck.models.headers;

import static org.assertj.core.api.Assertions.assertThat;

import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.models.headers.Header;
import org.testng.annotations.Test;

public class HeaderTest {

  @Test
  public void testCreateHeader() {
    Header header = OASFactory.createObject(Header.class);
    assertThat(header).isNotNull();
  }

}
