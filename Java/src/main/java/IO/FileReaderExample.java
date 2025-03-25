package src.main.java.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        FileReader fileReader = new FileReader("src/resources/example.txt");
        int character;
        while((character = fileReader.read()) != -1) {
            System.out.print((char) character);
        }
    }
}
