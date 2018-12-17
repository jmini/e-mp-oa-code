package fr.jmini.empoa.extended.tck.models.security;

import static org.assertj.core.api.Assertions.assertThat;

import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.models.security.Scopes;
import org.testng.annotations.Test;

public class ScopesTest {

    @Test
    public void testCreateScopes() {
        Scopes scopes = OASFactory.createObject(Scopes.class);
        assertThat(scopes).isNotNull();
    }

}
