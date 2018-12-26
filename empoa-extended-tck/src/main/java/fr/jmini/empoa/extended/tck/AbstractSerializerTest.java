package fr.jmini.empoa.extended.tck;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

import org.assertj.core.api.Assertions;
import org.eclipse.microprofile.openapi.models.OpenAPI;
import org.testng.annotations.Test;

import fr.jmini.empoa.extended.tck.specs.PingSpec;

public abstract class AbstractSerializerTest {

    @Test
    public void testSerializePing() throws Exception {
        OpenAPI openAPI = PingSpec.create();
        Assertions.assertThat(openAPI)
                .isNotNull();

        String expected = readFromResource("/extended-tck/specs/ping.json");
        String json = convertToJson(openAPI);

        assertThatJson(json).isEqualTo(expected);
    }

    protected abstract String convertToJson(OpenAPI openAPI) throws IOException;

    private String readFromResource(String name) throws IOException {
        return read(getClass().getResourceAsStream(name));
    }

    public static String read(InputStream inputStream) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {
            return bufferedReader.lines()
                    .collect(Collectors.joining("\n"));
        }
    }
}
