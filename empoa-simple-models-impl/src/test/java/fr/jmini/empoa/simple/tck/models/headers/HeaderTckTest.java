package fr.jmini.empoa.simple.tck.models.headers;

import org.testng.annotations.Test;

import fr.jmini.empoa.extended.tck.models.headers.HeaderTest;

public class HeaderTckTest extends HeaderTest {

    @Test
    public void detect() throws Exception {
        // This is requested by the gradle build to detect this test class, see https://docs.gradle.org/current/userguide/java_testing.html#sec:test_detection
    }
}
