package fr.jmini.empoa.extended.tck.models.security;

import static org.assertj.core.api.Assertions.assertThat;

import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.models.security.OAuthFlows;
import org.testng.annotations.Test;

public class OAuthFlowsTest {

    @Test
    public void testCreateOAuthFlows() {
        OAuthFlows oAuthFlows = OASFactory.createOAuthFlows();
        assertThat(oAuthFlows).isNotNull();
    }

}
