package fr.jmini.empoa.javapoet;

import static org.assertj.core.api.Assertions.*;
import static org.eclipse.microprofile.openapi.OASFactory.*;

import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collections;

import org.eclipse.microprofile.openapi.models.media.Schema;
import org.eclipse.microprofile.openapi.models.parameters.Parameter;
import org.eclipse.microprofile.openapi.models.security.SecurityRequirement;
import org.testng.annotations.Test;

import com.squareup.javapoet.CodeBlock;

public class CodeBlockConverterTest {

    @Test
    public void testAddSecurityRequirements() throws Exception {
        SecurityRequirement securityRequirement = createObject(SecurityRequirement.class);
        securityRequirement.addScheme("api_key");
        securityRequirement.addScheme("some_auth", "read");
        securityRequirement.addScheme("oauth2", Arrays.asList("read", "write"));

        CodeBlock block = CodeBlockConverter.createSecurityRequirement(securityRequirement);
        assertThat(block.toString()).isEqualToNormalizingWhitespace("createObject(org.eclipse.microprofile.openapi.models.security.SecurityRequirement.class)\n" +
                "        .addScheme(\"api_key\")\n" +
                "        .addScheme(\"some_auth\", \"read\")\n" +
                "        .addScheme(\n" +
                "                \"oauth2\", java.util.Arrays.asList(\n" +
                "                        \"read\",\n" +
                "                        \"write\"\n" +
                "                )\n" +
                "        )");
    }

    @Test
    public void testParameter() throws Exception {
        Parameter parameter = createObject(Parameter.class)
                .name("param")
                .in(Parameter.In.PATH)
                .required(true)
                .style(Parameter.Style.SIMPLE)
                .explode(false);

        CodeBlock block = CodeBlockConverter.createParameter(parameter);
        assertThat(block.toString()).isEqualToNormalizingWhitespace("createObject(org.eclipse.microprofile.openapi.models.parameters.Parameter.class)\n" +
                "                .name(\"param\")\n" +
                "                .in(org.eclipse.microprofile.openapi.models.parameters.Parameter.In.PATH)\n" +
                "                .required(true)\n" +
                "                .style(org.eclipse.microprofile.openapi.models.parameters.Parameter.Style.SIMPLE)\n" +
                "                .explode(false)");
    }

    @Test
    public void testSchemaWithReference() throws Exception {
        Schema schmea = createObject(Schema.class)
                .ref("#/components/schemas/Task");

        CodeBlock block = CodeBlockConverter.createSchema(schmea);
        assertThat(block.toString()).isEqualToNormalizingWhitespace("createObject(org.eclipse.microprofile.openapi.models.media.Schema.class)\n" +
                "                .ref(\"#/components/schemas/Task\")");
    }

    @Test
    public void testSchemaWithExtension() throws Exception {
        Schema schmea = createObject(Schema.class)
                .type(Schema.SchemaType.STRING);
        schmea.setExtensions(Collections.singletonMap("x-custom", "value"));

        CodeBlock block = CodeBlockConverter.createSchema(schmea);
        assertThat(block.toString()).isEqualToNormalizingWhitespace("createObject(org.eclipse.microprofile.openapi.models.media.Schema.class)\n" +
                "                .type(org.eclipse.microprofile.openapi.models.media.Schema.SchemaType.STRING)\n" +
                "                .addExtension(\"x-custom\", \"value\")");
    }

    public static Path toFile(Path srcFolder, String packageName, String className) {
        Path file = srcFolder.resolve(packageName.replace(".", "/") + "/" + className + ".java");
        return file;
    }
}
