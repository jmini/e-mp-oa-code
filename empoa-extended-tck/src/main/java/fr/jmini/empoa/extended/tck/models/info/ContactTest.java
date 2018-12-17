package fr.jmini.empoa.extended.tck.models.info;

import static org.assertj.core.api.Assertions.assertThat;

import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.models.info.Contact;
import org.testng.annotations.Test;

public class ContactTest {

    @Test
    public void testCreateContact() {
        Contact contact = OASFactory.createObject(Contact.class);
        assertThat(contact).isNotNull();
    }

}
