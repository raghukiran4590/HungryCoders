package src.main.java.IO;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileOperationsExample {

    public static void main(String[] args) {
        String filePath = "example.txt";
        String dataToWrite = "Hello, World!";
        int bufferSize = 1024; // Size of the buffer

        // Writing data to the file
        try (RandomAccessFile file = new RandomAccessFile(filePath, "rw");
             FileChannel channel = file.getChannel()) {

            // Create a ByteBuffer and put data into it
            ByteBuffer buffer = ByteBuffer.allocate(bufferSize);
            buffer.clear(); // Clear the buffer in case it contains old data
            buffer.put(dataToWrite.getBytes());
            buffer.flip(); // Flip the buffer for writing mode

            // Write data from ByteBuffer to FileChannel
            while (buffer.hasRemaining()) {
                channel.write(buffer);
            }
            System.out.println("Data has been written to the file successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading data from the file
        try (RandomAccessFile file = new RandomAccessFile(filePath, "r");
             FileChannel channel = file.getChannel()) {

            // Create a ByteBuffer to hold the read data
            ByteBuffer buffer = ByteBuffer.allocate(bufferSize);

            // Read data from FileChannel into ByteBuffer
            int bytesRead = channel.read(buffer);
            buffer.flip(); // Flip the buffer for reading mode

            // Convert ByteBuffer data to String and print
            if (bytesRead != -1) {
                byte[] bytes = new byte[bytesRead];
                buffer.get(bytes);
                String dataRead = new String(bytes);
                System.out.println("Data read from file: " + dataRead);
            } else {
                System.out.println("No data read from the file.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// Output:
// Data has been written to the file successfully.
// Data read from file: Hello, World!