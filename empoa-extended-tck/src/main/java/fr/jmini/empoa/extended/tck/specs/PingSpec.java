package fr.jmini.empoa.extended.tck.specs;

import static org.eclipse.microprofile.openapi.OASFactory.*;

import org.eclipse.microprofile.openapi.models.OpenAPI;
import org.eclipse.microprofile.openapi.models.Operation;
import org.eclipse.microprofile.openapi.models.PathItem;
import org.eclipse.microprofile.openapi.models.Paths;
import org.eclipse.microprofile.openapi.models.info.Info;
import org.eclipse.microprofile.openapi.models.responses.APIResponse;
import org.eclipse.microprofile.openapi.models.responses.APIResponses;
import org.eclipse.microprofile.openapi.models.servers.Server;

public final class PingSpec {
  public static OpenAPI create() {
    return createObject(OpenAPI.class)
        .openapi("3.0.1")
        .info(
            createObject(Info.class)
                .title("Ping Specification")
                .version("1.0")
        )
        .addServer(
            createObject(Server.class)
                .url("http://localhost:8000/")
        )
        .paths(
            createObject(Paths.class)
                .addPathItem(
                    "/ping", createObject(PathItem.class)
                        .GET(
                            createObject(Operation.class)
                                .operationId("pingGet")
                                .responses(
                                    createObject(APIResponses.class)
                                        .addApiResponse(
                                            "200", createObject(APIResponse.class)
                                                .description("OK")
                                        )
                                )
                        )
                )
        );
  }
}