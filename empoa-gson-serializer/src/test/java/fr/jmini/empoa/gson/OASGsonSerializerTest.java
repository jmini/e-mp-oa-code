package fr.jmini.empoa.gson;

import org.assertj.core.api.Assertions;
import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.models.OpenAPI;
import org.testng.annotations.Test;

import com.google.gson.Gson;

public class OASGsonSerializerTest {

    @Test
    public void testSerializePing() throws Exception {
        OpenAPI openAPI = OASFactory.createOpenAPI();
        openAPI.setOpenapi("3.0.1");
        openAPI.setInfo(OASFactory.createInfo()
                .title("Ping Specification")
                .version("1.0"));
        openAPI.addServer(OASFactory.createServer()
                .url("http://localhost:8000/"));
        openAPI.setPaths(OASFactory.createPaths()
                .addPathItem("/ping", OASFactory.createPathItem()
                        .GET(OASFactory.createOperation()
                                .operationId("pingGet")
                                .responses(OASFactory.createAPIResponses()
                                        .addAPIResponse("200", OASFactory.createAPIResponse()
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
