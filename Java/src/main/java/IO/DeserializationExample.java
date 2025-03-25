package src.main.java.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationExample {
    public static void main(String[] args) throws FileNotFoundException {
        try(FileInputStream fileInputStream = new FileInputStream("src/resources/person.ser")) {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Person person = (Person) objectInputStream.readObject();
            System.out.println("Deserialized Person....");
            System.out.println(person.name);
            System.out.println(person.age);
            System.out.println(person.location);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
