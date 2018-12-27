package fr.jmini.empoa.javapoet;

import static org.assertj.core.api.Assertions.*;
import static org.eclipse.microprofile.openapi.OASFactory.*;

import java.nio.file.Path;
import java.util.Arrays;

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
        assertThat(block.toString()).isEqualToNormalizingWhitespace("createSecurityRequirement()\n" +
                "        .addScheme(\"api_key\")\n" +
                "        .addScheme(\"some_auth\", \"read\")\n" +
                "        .addScheme(\n" +
                "                \"oauth2\", java.util.Arrays.asList(\n" +
                "                        \"read\",\n" +
                "                        \"write\"\n" +
                "                )\n" +
                "        )");
    }

    public static Path toFile(Path srcFolder, String packageName, String className) {
        Path file = srcFolder.resolve(packageName.replace(".", "/") + "/" + className + ".java");
        return file;
    }
}
