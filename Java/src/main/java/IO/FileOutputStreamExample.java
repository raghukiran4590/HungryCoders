package src.main.java.IO;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        try {
            String data = "Hello, World!";
            fileOutputStream = new FileOutputStream("src/resources/output.txt");
            byte[] byteArray = data.getBytes();
            fileOutputStream.write(byteArray);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fileOutputStream!= null)
                    fileOutputStream.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
