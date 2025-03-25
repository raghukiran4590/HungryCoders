package src.main.java.IO;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {

    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("src/resources/example.txt");
            int content;
            while((content = fileInputStream.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fileInputStream!= null)
                    fileInputStream.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
