package fr.jmini.empoa.smallrye.tck.models.info;

import org.testng.annotations.Test;

import fr.jmini.empoa.extended.tck.models.info.LicenseTest;

public class LicenseTckTest extends LicenseTest {

    @Test
    public void detect() throws Exception {
        // This is requested by the gradle build to detect this test class, see https://docs.gradle.org/current/userguide/java_testing.html#sec:test_detection
    }
}
