package src.main.java.designpatterns.creational.prototype;

public interface Shape extends Cloneable{
    Shape clone();
    void draw();
}
