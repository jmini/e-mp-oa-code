package fr.jmini.empoa.extended.tck;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.*;
import static org.assertj.core.api.Assertions.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

import org.eclipse.microprofile.openapi.models.OpenAPI;
import org.testng.annotations.Test;

import fr.jmini.empoa.extended.tck.specs.PingSpec;

public abstract class AbstractSerializerTest {

    private static final String PING = "/extended-tck/specs/ping.json";

    @Test
    public void testSerializePing() throws Exception {
        OpenAPI openAPI = createOpenAPI(PING);
        assertThat(openAPI).isNotNull();

        String expected = readFromResource(PING);
        String json = convertToJson(openAPI);

        assertThatJson(json).isEqualTo(expected);
    }

    protected OpenAPI createOpenAPI(String specPath) throws IOException {
        switch (specPath) {
        case PING:
            return PingSpec.create();
        default:
            throw new IllegalArgumentException("Unknown spec: " + specPath);
        }
    }

    protected abstract String convertToJson(OpenAPI openAPI) throws IOException;

    protected String readFromResource(String name) throws IOException {
        return read(getClass().getResourceAsStream(name));
    }

    public static String read(InputStream inputStream) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {
            return bufferedReader.lines()
                    .collect(Collectors.joining("\n"));
        }
    }
}
