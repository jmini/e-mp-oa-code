package fr.jmini.empoa.extended.tck.models.tags;

import static org.assertj.core.api.Assertions.assertThat;

import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.models.tags.Tag;
import org.testng.annotations.Test;

public class TagTest {

  @Test
  public void testCreateTag() {
    Tag tag = OASFactory.createObject(Tag.class);
    assertThat(tag).isNotNull();
  }

}
