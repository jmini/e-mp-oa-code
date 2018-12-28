package fr.jmini.empoa.extended.tck.models.security;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collections;

import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.models.security.Scopes;
import org.testng.annotations.Test;

public class ScopesTest {

    @Test
    public void testCreateScopes() {
        Scopes scopes = OASFactory.createScopes();
        assertThat(scopes).isNotNull();
    }

    @Test
    public void testSetScopes() {
        Scopes scopes = OASFactory.createScopes();

        scopes.setScopes(
                Collections.singletonMap(
                        "write:elements", "modify elements in your item"
                )
        );
        assertThat(scopes.getScopes()).containsOnlyKeys("write:elements");

        scopes.setScopes(Collections.emptyMap());
        assertThat(scopes.getScopes()).isEmpty();
    }

}
