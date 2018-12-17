package fr.jmini.empoa.extended.tck.models.servers;

import static org.assertj.core.api.Assertions.assertThat;

import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.models.servers.ServerVariable;
import org.testng.annotations.Test;

public class ServerVariableTest {

    @Test
    public void testCreateServerVariable() {
        ServerVariable serverVariable = OASFactory.createServerVariable();
        assertThat(serverVariable).isNotNull();
    }

}
