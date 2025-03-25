package src.main.java.IO;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
        public static void main(String[] args) throws IOException {
            try(FileWriter fileWriter = new FileWriter("src/resources/writer.txt")){
                String data = "Hello World!";
                fileWriter.write(data);
            }
        }
    }
