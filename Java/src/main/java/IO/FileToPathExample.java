package src.main.java.IO;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileToPathExample {

    public static void main(String[] args) {
        // Create a File object
        File file = new File("example.txt");

        // Convert File to Path using toPath() method
        Path path = file.toPath();

        // Alternatively, you can use Paths.get() method
        // Path path = Paths.get(file.getAbsolutePath());

        // Now you have a Path object that represents the same file
        System.out.println("Path: " + path);
    }
}
