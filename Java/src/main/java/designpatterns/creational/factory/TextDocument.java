package src.main.java.designpatterns.creational.factory;

//Concrete Products
public class TextDocument implements Document{
    @Override
    public void open() {
        System.out.println("Opening Text Document");
    }

    @Override
    public void save() {
        System.out.println("Saving Text Document");
    }

    @Override
    public void close() {
        System.out.println("Closing Text Document");
    }
}
