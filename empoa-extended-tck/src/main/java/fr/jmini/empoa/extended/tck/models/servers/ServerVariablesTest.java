package fr.jmini.empoa.extended.tck.models.servers;

import static org.assertj.core.api.Assertions.assertThat;

import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.models.servers.ServerVariables;
import org.testng.annotations.Test;

public class ServerVariablesTest {

    @Test
    public void testCreateServerVariables() {
        ServerVariables serverVariables = OASFactory.createObject(ServerVariables.class);
        assertThat(serverVariables).isNotNull();
    }

}
