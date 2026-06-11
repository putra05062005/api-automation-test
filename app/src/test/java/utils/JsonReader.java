package utils;

import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonReader {
    public static String readJson(String path) throws Exception {
        return new String(Files.readAllBytes(Paths.get(path)));
    }
}