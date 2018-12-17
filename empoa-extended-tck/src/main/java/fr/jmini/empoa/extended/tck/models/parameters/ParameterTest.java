package fr.jmini.empoa.extended.tck.models.parameters;

import static org.assertj.core.api.Assertions.assertThat;

import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.models.parameters.Parameter;
import org.testng.annotations.Test;

public class ParameterTest {

    @Test
    public void testCreateParameter() {
        Parameter parameter = OASFactory.createParameter();
        assertThat(parameter).isNotNull();
    }

}
