package fr.jmini.empoa.extended.tck.models.responses;

import static org.assertj.core.api.Assertions.assertThat;

import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.models.responses.APIResponses;
import org.testng.annotations.Test;

public class APIResponsesTest {

    @Test
    public void testCreateAPIResponses() {
        APIResponses aPIResponses = OASFactory.createAPIResponses();
        assertThat(aPIResponses).isNotNull();
    }

}
