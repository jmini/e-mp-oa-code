package fr.jmini.empoa.gson;

import org.assertj.core.api.Assertions;
import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.models.OpenAPI;
import org.eclipse.microprofile.openapi.models.Operation;
import org.eclipse.microprofile.openapi.models.PathItem;
import org.eclipse.microprofile.openapi.models.Paths;
import org.eclipse.microprofile.openapi.models.info.Info;
import org.eclipse.microprofile.openapi.models.responses.APIResponse;
import org.eclipse.microprofile.openapi.models.responses.APIResponses;
import org.eclipse.microprofile.openapi.models.servers.Server;
import org.junit.jupiter.api.Test;

import com.google.gson.Gson;

public class OASGsonSerializerTest {

    @Test
    public void testSerializePing() throws Exception {
        OpenAPI openAPI = OASFactory.createObject(OpenAPI.class);
        openAPI.setOpenapi("3.0.1");
        openAPI.setInfo(OASFactory.createObject(Info.class)
                .title("Ping Specification")
                .version("1.0"));
        openAPI.addServer(OASFactory.createObject(Server.class)
                .url("http://localhost:8000/"));
        openAPI.setPaths(OASFactory.createObject(Paths.class)
                .addPathItem("/ping", OASFactory.createObject(PathItem.class)
                        .GET(OASFactory.createObject(Operation.class)
                                .operationId("pingGet")
                                .responses(OASFactory.createObject(APIResponses.class)
                                        .addApiResponse("200", OASFactory.createObject(APIResponse.class)
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
