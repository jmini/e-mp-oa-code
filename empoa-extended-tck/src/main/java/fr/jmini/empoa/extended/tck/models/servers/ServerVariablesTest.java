package fr.jmini.empoa.extended.tck.models.servers;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collections;

import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.models.servers.ServerVariables;
import org.testng.annotations.Test;

public class ServerVariablesTest {

    @Test
    public void testCreateServerVariables() {
        ServerVariables serverVariables = OASFactory.createServerVariables();
        assertThat(serverVariables).isNotNull();
    }

    @Test
    public void testSetServerVariables() {
        ServerVariables serverVariables = OASFactory.createServerVariables();

        serverVariables.setServerVariables(
                Collections.singletonMap(
                        "name", OASFactory.createServerVariable()
                )
        );
        assertThat(serverVariables.getServerVariables()).containsOnlyKeys("name");

        serverVariables.setServerVariables(Collections.emptyMap());
        assertThat(serverVariables.getServerVariables()).isEmpty();
    }

}
