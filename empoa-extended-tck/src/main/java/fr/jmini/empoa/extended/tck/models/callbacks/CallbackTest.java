package fr.jmini.empoa.extended.tck.models.callbacks;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collections;

import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.models.callbacks.Callback;
import org.testng.annotations.Test;

public class CallbackTest {

    @Test
    public void testCreateCallback() {
        Callback callback = OASFactory.createCallback();
        assertThat(callback).isNotNull();
    }

    @Test
    public void testSetPathItems() {
        Callback callback = OASFactory.createCallback();

        callback.setPathItems(
                Collections.singletonMap(
                        "/path", OASFactory.createPathItem()
                )
        );
        assertThat(callback.getPathItems()).containsOnlyKeys("/path");

        callback.setPathItems(Collections.emptyMap());
        assertThat(callback.getPathItems()).isEmpty();
    }

}
