package fr.jmini.empoa.smallrye.tck.models.tags;

import org.testng.annotations.Test;

import fr.jmini.empoa.extended.tck.models.tags.TagTest;

public class TagTckTest extends TagTest {

    @Test
    public void detect() throws Exception {
        // This is requested by the gradle build to detect this test class, see https://docs.gradle.org/current/userguide/java_testing.html#sec:test_detection
    }
}