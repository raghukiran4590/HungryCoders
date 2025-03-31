package src.main.java.designpatterns.structural.adapter;

public class RectangleAdapter implements Square {

    private Rectangle rectangle;

    public RectangleAdapter(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    @Override
    public void draw() {
        rectangle.drawRectangle();
    }
}
