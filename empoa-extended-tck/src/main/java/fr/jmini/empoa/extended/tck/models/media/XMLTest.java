package fr.jmini.empoa.extended.tck.models.media;

import static org.assertj.core.api.Assertions.assertThat;

import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.models.media.XML;
import org.testng.annotations.Test;

public class XMLTest {

  @Test
  public void testCreateXML() {
    XML xML = OASFactory.createObject(XML.class);
    assertThat(xML).isNotNull();
  }

}
