package fr.jmini.empoa.extended.tck.models;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collections;

import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.models.Paths;
import org.testng.annotations.Test;

public class PathsTest {

    @Test
    public void testCreatePaths() {
        Paths paths = OASFactory.createPaths();
        assertThat(paths).isNotNull();
    }

    @Test
    public void testSetPathItems() {
        Paths paths = OASFactory.createPaths();

        paths.setPathItems(
                Collections.singletonMap(
                        "/path", OASFactory.createPathItem()
                )
        );
        assertThat(paths.getPathItems()).containsOnlyKeys("/path");

        paths.setPathItems(Collections.emptyMap());
        assertThat(paths.getPathItems()).isEmpty();
    }

}
