package fr.jmini.empoa.extended.tck.models.responses;

import static org.assertj.core.api.Assertions.*;

import java.util.Collections;

import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.models.responses.APIResponses;
import org.testng.annotations.Test;

public class APIResponsesTest {

    @Test
    public void testCreateAPIResponses() {
        APIResponses apiResponses = OASFactory.createAPIResponses();
        assertThat(apiResponses).isNotNull();
    }

    @Test
    public void testSetAPIResponses() {
        APIResponses apiResponses = OASFactory.createAPIResponses();

        apiResponses.setAPIResponses(
                Collections.singletonMap(
                        "200", OASFactory.createAPIResponse()
                                .description("OK")
                )
        );
        assertThat(apiResponses.getAPIResponses()).containsOnlyKeys("200");

        apiResponses.setAPIResponses(Collections.emptyMap());
        assertThat(apiResponses.getAPIResponses()).isEmpty();
    }

    @Test
    public void testAddAPIResponses() {
        APIResponses apiResponses = OASFactory.createAPIResponses();

        apiResponses.addAPIResponse(
                "200", OASFactory.createAPIResponse()
                        .description("OK")
        );
        assertThat(apiResponses.getAPIResponses()).containsOnlyKeys("200");

        apiResponses.addAPIResponse("200", null);
        assertThat(apiResponses.getAPIResponses()).isEmpty();
    }
}
