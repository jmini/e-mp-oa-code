package fr.jmini.empoa.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileUtil {

    public static void writeJavaClass(Path srcFolder, String packageName, String className, String content) throws IOException {
        Path file = srcFolder.resolve(packageName.replace(".", "/") + "/" + className + ".java");
        Files.createDirectories(file.getParent());
        Files.write(file, content.getBytes());
    }
}
