package fr.jmini.empoa.extended.tck.models.servers;

import static org.assertj.core.api.Assertions.assertThat;

import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.models.servers.Server;
import org.testng.annotations.Test;

public class ServerTest {

    @Test
    public void testCreateServer() {
        Server server = OASFactory.createObject(Server.class);
        assertThat(server).isNotNull();
    }

}
