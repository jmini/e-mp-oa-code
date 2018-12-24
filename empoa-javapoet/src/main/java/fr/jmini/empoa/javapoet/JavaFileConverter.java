package fr.jmini.empoa.javapoet;

import javax.lang.model.element.Modifier;

import org.eclipse.microprofile.openapi.OASFactory;
import org.eclipse.microprofile.openapi.models.OpenAPI;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;

public class JavaFileConverter {

    public static JavaFile createOpenAPI(OpenAPI openAPI, String packageName, String className) {
        ClassName oasFactory = ClassName.get(OASFactory.class);

        MethodSpec main = MethodSpec.methodBuilder("create")
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .returns(OpenAPI.class)
                .addStatement("return $L", CodeBlockConverter.createOpenAPI(openAPI))
                .build();

        TypeSpec type = TypeSpec.classBuilder(className)
                .addModifiers(Modifier.PUBLIC, Modifier.FINAL)
                .addMethod(main)
                .build();

        JavaFile javaFile = JavaFile.builder(packageName, type)
                .skipJavaLangImports(true)
                .addStaticImport(oasFactory, "*")
                .build();

        return javaFile;
    }
}
