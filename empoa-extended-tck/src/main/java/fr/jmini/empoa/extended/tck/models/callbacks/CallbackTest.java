package fr.jmini.empoa.extended.tck.models.callbacks;

import static org.assertj.core.api.Assertions.assertThat;

import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.models.callbacks.Callback;
import org.testng.annotations.Test;

public class CallbackTest {

    @Test
    public void testCreateCallback() {
        Callback callback = OASFactory.createCallback();
        assertThat(callback).isNotNull();
    }

}
