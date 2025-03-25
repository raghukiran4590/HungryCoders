package src.main.java.IO;

import java.io.*;

class Person implements Serializable {
    String name;
    int age;
    String location;
    @Serial
    private static final long serialVersionUID = 1L; // Recommened to maintain the version of the serializable object

    public Person(String name, int age, String location) {
        this.name = name;
        this.age = age;
        this.location = location;
    }
    //Getters and Setters
}

public class SerializationExample {
    public static void main(String[] args) {
        Person person = new Person("Raghu", 35, "Florida");
        try(FileOutputStream fileOutputStream = new FileOutputStream("src/resources/person.ser")) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            //Write the object to the file
            objectOutputStream.writeObject(person);
            System.out.println("Serialized data is saved in person.ser file");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException i) {
            throw new RuntimeException(i);
        }
    }

}
