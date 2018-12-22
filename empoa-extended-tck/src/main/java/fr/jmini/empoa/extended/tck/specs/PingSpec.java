package fr.jmini.empoa.extended.tck.specs;

import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.models.OpenAPI;
import org.eclipse.microprofile.openapi.models.Operation;
import org.eclipse.microprofile.openapi.models.PathItem;
import org.eclipse.microprofile.openapi.models.Paths;
import org.eclipse.microprofile.openapi.models.info.Info;
import org.eclipse.microprofile.openapi.models.responses.APIResponse;
import org.eclipse.microprofile.openapi.models.responses.APIResponses;
import org.eclipse.microprofile.openapi.models.servers.Server;

public class PingSpec {

    public static OpenAPI create() {
        return OASFactory.createObject(OpenAPI.class)
                .openapi("3.0.1")
                .info(OASFactory.createObject(Info.class)
                        .title("Ping Specification")
                        .version("1.0"))
                .addServer(OASFactory.createObject(Server.class)
                        .url("http://localhost:8000/"))
                .paths(OASFactory.createObject(Paths.class)
                        .addPathItem("/ping", OASFactory.createObject(PathItem.class)
                                .GET(OASFactory.createObject(Operation.class)
                                        .operationId("pingGet")
                                        .responses(OASFactory.createObject(APIResponses.class)
                                                .addApiResponse("200", OASFactory.createObject(APIResponse.class)
                                                        .description("OK"))))));
    }
}
