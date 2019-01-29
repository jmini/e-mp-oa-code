package fr.jmini.empoa.extended.tck;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.*;
import static org.assertj.core.api.Assertions.*;

import java.io.IOException;

import org.eclipse.microprofile.openapi.models.OpenAPI;

public abstract class AbstractSerializerTest extends AbstractSpecTest {

  protected static final String PING_JSON = "/extended-tck/specs/ping.json";
  protected static final String HELLO_JSON = "/extended-tck/specs/hello.json";
  protected static final String TODOAPP_JSON = "/extended-tck/specs/todoapp.json";

  @Override
  protected void runTest(Specs spec) throws Exception {
    OpenAPI openAPI = createOpenAPI(spec);
    assertThat(openAPI).isNotNull();

    String expected = readExpectedFromResource(spec);
    String json = convertToJson(openAPI);

    assertThatJson(json).isEqualTo(expected);
  }

  protected abstract String convertToJson(OpenAPI openAPI) throws IOException;

  protected String readExpectedFromResource(Specs spec) throws IOException {
    String name = toResourceName(spec);
    return read(getClass().getResourceAsStream(name));
  }

  protected String toResourceName(Specs spec) {
    switch (spec) {
    case PING:
      return PING_JSON;
    case HELLO:
      return HELLO_JSON;
    case TODOAPP:
      return TODOAPP_JSON;
    default:
      throw new IllegalArgumentException("Unknown spec: " + spec);
    }
  }
}
