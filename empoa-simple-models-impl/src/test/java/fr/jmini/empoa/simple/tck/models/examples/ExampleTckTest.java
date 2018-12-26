package fr.jmini.empoa.simple.tck.models.examples;

import org.testng.annotations.Test;

import fr.jmini.empoa.extended.tck.models.examples.ExampleTest;

public class ExampleTckTest extends ExampleTest {

    @Test
    public void detect() throws Exception {
        // This is requested by the gradle build to detect this test class, see https://docs.gradle.org/current/userguide/java_testing.html#sec:test_detection
    }
}
