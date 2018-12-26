/**
 *
 */
package fr.jmini.empoa.generator.tck;

import java.io.IOException;
import java.nio.file.Paths;

import fr.jmini.empoa.specs.OpenAPISpec;
import fr.jmini.empoa.util.FileUtil;
import fr.jmini.empoa.util.StringUtil;

/**
 * @author jbr
 *
 */
public class TckExtendsClassGeneratorMain {

    public static void main(String[] args) throws Exception {
        createTests("fr.jmini.empoa.simple.tck", "../empoa-simple-models-impl/src/test/java");
        createTests("fr.jmini.empoa.smallrye.tck", "../empoa-smallrye/src/test/java");
    }

    private static void createTests(String packageName, String path) throws IOException {
        for (Class<?> cls : OpenAPISpec.interfaces()) {
            createTest(cls.getCanonicalName(), packageName, path);
        }
    }

    private static void createTest(String fqName, String rootPackage, String path) throws IOException {
        String pkgName = StringUtil.computePackage(fqName.replace("org.eclipse.microprofile.openapi", rootPackage));
        String clsName = StringUtil.computeSimpleName(fqName) + "TckTest";
        String tckPckName = TckInitialClassGeneratorMain.toExtendedTckPackage(fqName);
        String tckClsName = TckInitialClassGeneratorMain.toExtendedTckClassName(fqName);

        StringBuilder sb = new StringBuilder();
        sb.append("package " + pkgName + ";\n");
        sb.append("\n");
        sb.append("import org.testng.annotations.Test;\n");
        sb.append("\n");
        sb.append("import " + tckPckName + "." + tckClsName + ";\n");
        sb.append("\n");
        sb.append("public class " + clsName + " extends " + tckClsName + " {\n");
        sb.append("\n");
        sb.append("    @Test\n");
        sb.append("    public void detect() throws Exception {\n");
        sb.append("        // This is requested by the gradle build to detect this test class, see https://docs.gradle.org/current/userguide/java_testing.html#sec:test_detection\n");
        sb.append("    }\n");
        sb.append("}\n");
        FileUtil.writeJavaClass(Paths.get(path), pkgName, clsName, sb.toString());
    }
}
