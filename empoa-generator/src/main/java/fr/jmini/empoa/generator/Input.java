package fr.jmini.empoa.generator;

import java.nio.file.Path;

public class Input {

	public final Path srcFolder;
	public final String rootPackage;
	
	public Input(Path srcFolder, String rootPackage) {
		this.srcFolder = srcFolder;
		this.rootPackage = rootPackage;
	}
}
