package fr.jmini.empoa.internal;

import org.assertj.core.api.Assertions;
import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.models.OpenAPI;
import org.testng.annotations.Test;

import com.google.gson.Gson;

import fr.jmini.empoa.gson.OASGsonSerializer;

public class OASGsonSerializerTest {

    @Test
    public void testSerializePing() {
        OpenAPI openAPI = OASFactory.createObject(org.eclipse.microprofile.openapi.models.OpenAPI.class);
        openAPI.setOpenapi("3.0.1");
        openAPI.setInfo(OASFactory.createObject(org.eclipse.microprofile.openapi.models.info.Info.class)
                .title("Ping Specification")
                .version("1.0"));
        openAPI.addServer(OASFactory.createObject(org.eclipse.microprofile.openapi.models.servers.Server.class)
                .url("http://localhost:8000/"));
        openAPI.setPaths(OASFactory.createObject(org.eclipse.microprofile.openapi.models.Paths.class)
                .addPathItem("/ping",
                        OASFactory.createObject(org.eclipse.microprofile.openapi.models.PathItem.class)
                                .GET(OASFactory.createObject(org.eclipse.microprofile.openapi.models.Operation.class)
                                        .operationId("pingGet")
                                        .responses(OASFactory.createObject(org.eclipse.microprofile.openapi.models.responses.APIResponses.class)
                                                .addApiResponse("200",
                                                        OASFactory.createObject(org.eclipse.microprofile.openapi.models.responses.APIResponse.class)
                                                                .description("OK"))))));

        Assertions.assertThat(openAPI)
                .isNotNull();

        Gson gson = OASGsonSerializer.instance();
        String json = gson.toJson(openAPI);
        Assertions.assertThat(json)
                .isEqualToNormalizingNewlines("XXX");
    }

}
