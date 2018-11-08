package fr.jmini.empoa.gson;

import org.assertj.core.api.Assertions;
import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.models.OpenAPI;
import org.junit.jupiter.api.Test;

import com.google.gson.Gson;

public class OASGsonSerializerTest {

    @Test
    public void testSerializePing() throws Exception {
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
                .isEqualTo("{\n" +
                        "  \"openapi\": \"3.0.1\",\n" +
                        "  \"info\": {\n" +
                        "    \"title\": \"Ping Specification\",\n" +
                        "    \"version\": \"1.0\"\n" +
                        "  },\n" +
                        "  \"servers\": [\n" +
                        "    {\n" +
                        "      \"url\": \"http://localhost:8000/\"\n" +
                        "    }\n" +
                        "  ],\n" +
                        "  \"paths\": {\n" +
                        "    \"/ping\": {\n" +
                        "      \"get\": {\n" +
                        "        \"operationId\": \"pingGet\",\n" +
                        "        \"responses\": {\n" +
                        "          \"200\": {\n" +
                        "            \"description\": \"OK\"\n" +
                        "          }\n" +
                        "        }\n" +
                        "      }\n" +
                        "    }\n" +
                        "  }\n" +
                        "}");
    }

}
