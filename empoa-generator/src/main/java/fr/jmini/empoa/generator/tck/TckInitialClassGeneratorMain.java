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
public class TckInitialClassGeneratorMain {
    public static void main(String[] args) throws Exception {
        for (Class<?> cls : OpenAPISpec.interfaces()) {
            createTest(cls.getCanonicalName());
        }
    }

    private static void createTest(String fqName) throws IOException {
        String pkgName = toExtendedTckPackage(fqName);
        String clsName = toExtendedTckClassName(fqName);
        String simpleNmae = StringUtil.computeSimpleName(fqName);
        String varName = StringUtil.decapitalize(simpleNmae);

        StringBuilder sb = new StringBuilder();
        sb.append("package " + pkgName + ";\n");
        sb.append("\n");
        sb.append("import static org.assertj.core.api.Assertions.assertThat;\n");
        sb.append("\n");
        sb.append("import org.eclipse.microprofile.openapi.OASFactory;\n");
        sb.append("import " + fqName + ";\n");
        sb.append("import org.testng.annotations.Test;\n");
        sb.append("\n");
        sb.append("public class " + clsName + " {\n");
        sb.append("\n");
        sb.append("    @Test\n");
        sb.append("    public void testCreate" + simpleNmae + "() {\n");
        sb.append("        " + simpleNmae + " " + varName + " = OASFactory.create" + simpleNmae + "();\n");
        sb.append("        assertThat(" + varName + ").isNotNull();\n");
        sb.append("    }\n");
        sb.append("\n");
        sb.append("}\n");
        FileUtil.writeJavaClass(Paths.get("../empoa-extended-tck/src/main/java"), pkgName, clsName, sb.toString());
    }

    static String toExtendedTckPackage(String fqName) {
        return StringUtil.computePackage(fqName.replace("org.eclipse.microprofile.openapi", "fr.jmini.empoa.extended.tck"));
    }

    static String toExtendedTckClassName(String fqName) {
        return StringUtil.computeSimpleName(fqName) + "Test";
    }
}
