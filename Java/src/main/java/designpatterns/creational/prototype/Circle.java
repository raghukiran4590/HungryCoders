package src.main.java.designpatterns.creational.prototype;

public class Circle implements Shape{

    @Override
    public Shape clone() {
        return new Circle();
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
