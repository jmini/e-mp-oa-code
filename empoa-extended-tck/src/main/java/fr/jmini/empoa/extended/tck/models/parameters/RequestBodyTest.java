package fr.jmini.empoa.extended.tck.models.parameters;

import static org.assertj.core.api.Assertions.assertThat;

import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.models.parameters.RequestBody;
import org.testng.annotations.Test;

public class RequestBodyTest {

    @Test
    public void testCreateRequestBody() {
        RequestBody requestBody = OASFactory.createObject(RequestBody.class);
        assertThat(requestBody).isNotNull();
    }

}
