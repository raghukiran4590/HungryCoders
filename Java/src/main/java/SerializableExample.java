package src.main.java;

// Serializable Example:
import java.io.*;

public class SerializableExample {
    public static void main(String[] args) {
        MyClass obj = new MyClass(1, "John");

        // Serialize the object
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("object.ser"))) {
            out.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the object
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("object.ser"))) {
            MyClass deserializedObj = (MyClass) in.readObject();
            System.out.println("Deserialized object: " + deserializedObj.getName()); // Deserialized object: John
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class MyClass implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;

    public MyClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
