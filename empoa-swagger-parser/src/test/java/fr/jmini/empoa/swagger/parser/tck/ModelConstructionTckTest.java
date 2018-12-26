package fr.jmini.empoa.swagger.parser.tck;

import org.eclipse.microprofile.openapi.tck.ModelConstructionTest;
import org.testng.annotations.Test;

public class ModelConstructionTckTest extends ModelConstructionTest {

    @Override
    public void schemaTest() {
    }

    @Override
    public void apiResponsesTest() {
    }

    @Test
    public void detect() throws Exception {
        // This is requested by the gradle build to detect this test class, see https://docs.gradle.org/current/userguide/java_testing.html#sec:test_detection
    }
}
