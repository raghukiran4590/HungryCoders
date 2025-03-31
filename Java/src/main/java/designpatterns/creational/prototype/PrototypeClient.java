package src.main.java.designpatterns.creational.prototype;

public class PrototypeClient {

    public static void main(String[] args) {
        Shape circlePrototype = new Circle();
        Shape rectanglePrototype = new Rectangle();

        //create new shapes by cloning the prototypes
        Shape clonedCircle = circlePrototype.clone();
        Shape clonedRectangle = rectanglePrototype.clone();

        //Draw the cloned shapes
        clonedCircle.draw();
        clonedRectangle.draw();
    }
}
