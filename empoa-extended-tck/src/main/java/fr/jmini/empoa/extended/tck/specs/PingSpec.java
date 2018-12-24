package fr.jmini.empoa.extended.tck.specs;

import static org.eclipse.microprofile.openapi.OASFactory.*;

import org.eclipse.microprofile.openapi.models.OpenAPI;

public final class PingSpec {
    public static OpenAPI create() {
        return createOpenAPI()
                .openapi("3.0.1")
                .info(
                        createInfo()
                                .title("Ping Specification")
                                .version("1.0")
                )
                .addServer(
                        createServer()
                                .url("http://localhost:8000/")
                )
                .paths(
                        createPaths()
                                .addPathItem(
                                        "/ping", createPathItem()
                                                .GET(
                                                        createOperation()
                                                                .operationId("pingGet")
                                                                .responses(
                                                                        createAPIResponses()
                                                                                .addAPIResponse(
                                                                                        "200", createAPIResponse()
                                                                                                .description("OK")
                                                                                )
                                                                )
                                                )
                                )
                );
    }
}