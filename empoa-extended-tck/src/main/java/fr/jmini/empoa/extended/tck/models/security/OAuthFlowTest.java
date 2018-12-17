package fr.jmini.empoa.extended.tck.models.security;

import static org.assertj.core.api.Assertions.assertThat;

import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.models.security.OAuthFlow;
import org.testng.annotations.Test;

public class OAuthFlowTest {

    @Test
    public void testCreateOAuthFlow() {
        OAuthFlow oAuthFlow = OASFactory.createOAuthFlow();
        assertThat(oAuthFlow).isNotNull();
    }

}
