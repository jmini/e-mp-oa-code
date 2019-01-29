package fr.jmini.empoa.extended.tck.models.media;

import static org.assertj.core.api.Assertions.assertThat;

import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.models.media.Encoding;
import org.testng.annotations.Test;

public class EncodingTest {

  @Test
  public void testCreateEncoding() {
    Encoding encoding = OASFactory.createObject(Encoding.class);
    assertThat(encoding).isNotNull();
  }

}
