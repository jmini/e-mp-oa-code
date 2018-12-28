package fr.jmini.empoa.extended.tck.models.responses;

import static org.assertj.core.api.Assertions.assertThat;

import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.models.responses.APIResponse;
import org.testng.annotations.Test;

public class APIResponseTest {

    @Test
    public void testCreateAPIResponse() {
        APIResponse apiResponse = OASFactory.createObject(APIResponse.class);
        assertThat(apiResponse).isNotNull();
    }

}
