/*******************************************************************************
 * Copyright 2019 Jeremie Bresson
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package fr.jmini.empoa.javapoet;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.assertj.core.api.Assertions;
import org.eclipse.microprofile.openapi.models.OpenAPI;
import org.testng.annotations.Test;

import com.squareup.javapoet.JavaFile;

import fr.jmini.empoa.extended.tck.AbstractSpecTest;
import fr.jmini.empoa.extended.tck.specs.HelloSpec;
import fr.jmini.empoa.extended.tck.specs.PingSpec;
import fr.jmini.empoa.extended.tck.specs.TodoappSpec;

public class JavaFileConverterTest extends AbstractSpecTest {

    private static final String HEADER = "" +
            "/*******************************************************************************\n" +
            " * Copyright 2019 Jeremie Bresson\n" +
            " * \n" +
            " * Licensed under the Apache License, Version 2.0 (the \"License\"); you may not\n" +
            " * use this file except in compliance with the License.  You may obtain a copy\n" +
            " * of the License at\n" +
            " * \n" +
            " *   http://www.apache.org/licenses/LICENSE-2.0\n" +
            " * \n" +
            " * Unless required by applicable law or agreed to in writing, software\n" +
            " * distributed under the License is distributed on an \"AS IS\" BASIS, WITHOUT\n" +
            " * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the\n" +
            " * License for the specific language governing permissions and limitations under\n" +
            " * the License.\n" +
            " ******************************************************************************/\n" +
            "";

    @Override
    protected void runTest(Specs spec) throws Exception {
        String packageName = "fr.jmini.empoa.extended.tck.specs";
        String className = toClassName(spec);

        OpenAPI openAPI = createOpenAPI(spec);
        // tag::usage[]
        JavaFile javaFile = JavaFileConverter.createOpenAPI(openAPI, packageName, className);
        String javaCode = HEADER + javaFile.toString();
        // end::usage[]

        Path file = toFile(Paths.get("../empoa-extended-tck/src/main/java"), packageName, className);
        String content = new String(Files.readAllBytes(file));

        Assertions.assertThat(javaCode)
                .isEqualToNormalizingWhitespace(content);
    }

    private String toClassName(Specs spec) {
        switch (spec) {
        case PING:
            return PingSpec.class.getSimpleName();
        case HELLO:
            return HelloSpec.class.getSimpleName();
        case TODOAPP:
            return TodoappSpec.class.getSimpleName();
        default:
            throw new IllegalArgumentException("Unknown spec: " + spec);
        }
    }

    public static Path toFile(Path srcFolder, String packageName, String className) {
        Path file = srcFolder.resolve(packageName.replace(".", "/") + "/" + className + ".java");
        return file;
    }

    @Test
    public void detect() throws Exception {
        // This is requested by the gradle build to detect this test class, see https://docs.gradle.org/current/userguide/java_testing.html#sec:test_detection
    }
}
