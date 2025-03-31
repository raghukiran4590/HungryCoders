package src.main.java.designpatterns.creational.prototype;

public class Rectangle implements Shape{

    @Override
    public Shape clone() {
        return new Rectangle();
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}
