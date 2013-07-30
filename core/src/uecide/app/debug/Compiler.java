package uecide.app.debug;

import java.io.*;
import java.util.*;

import uecide.app.*;

public class Compiler {
    public PropertyFile properties;
    public File folder;
    public File compilerFile;

    public boolean valid;

    public Compiler(File dir) {
        valid = false;
        folder = dir;
        compilerFile = new File(dir, "compiler.txt");
        if (!compilerFile.exists()) {
            return;
        }

        properties = new PropertyFile(compilerFile);

        valid = true;
    }

    public String getName() {
        return properties.get("name");
    }

    public String getVersion() {
        return properties.get("version");
    }

    public PropertyFile getProperties() {
        return properties;
    }

    public boolean isValid() {
        return valid;
    }

    public File getFolder() {
        return folder;
    }
}
