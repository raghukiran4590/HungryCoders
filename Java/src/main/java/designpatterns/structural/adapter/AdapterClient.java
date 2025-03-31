package src.main.java.designpatterns.structural.adapter;

public class AdapterClient {

    public static void main(String[] args) {
        //Create an instance of Rectangle (Adaptee)
        Rectangle rectangle = new Rectangle();

        //Create an adapter to adpat Rectangle to Square interface (Adapter)
        RectangleAdapter rectangleAdapter = new RectangleAdapter(rectangle);

        // Call draw method on the Square interface
        rectangleAdapter.draw();
    }
}
