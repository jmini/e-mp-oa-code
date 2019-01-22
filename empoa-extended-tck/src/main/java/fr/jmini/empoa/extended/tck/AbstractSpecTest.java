package fr.jmini.empoa.extended.tck;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

import org.eclipse.microprofile.openapi.models.OpenAPI;
import org.testng.annotations.Test;

import fr.jmini.empoa.extended.tck.specs.HelloSpec;
import fr.jmini.empoa.extended.tck.specs.PingSpec;
import fr.jmini.empoa.extended.tck.specs.TodoappSpec;

public abstract class AbstractSpecTest {

    protected static enum Specs {
        PING, HELLO, TODOAPP
    }

    @Test
    public void testPingSpec() throws Exception {
        runTest(Specs.PING);
    }

    @Test
    public void testHelloSpec() throws Exception {
        runTest(Specs.HELLO);
    }

    @Test
    public void testTodoappSpec() throws Exception {
        runTest(Specs.TODOAPP);
    }

    protected abstract void runTest(Specs spec) throws Exception;

    protected OpenAPI createOpenAPI(Specs spec) throws IOException {
        switch (spec) {
        case PING:
            return PingSpec.create();
        case HELLO:
            return HelloSpec.create();
        case TODOAPP:
            return TodoappSpec.create();
        default:
            throw new IllegalArgumentException("Unknown spec: " + spec);
        }
    }

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
