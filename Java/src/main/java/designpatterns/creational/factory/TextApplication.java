package src.main.java.designpatterns.creational.factory;

public class TextApplication extends Application{
    @Override
    protected Document createDocument() {
        return new TextDocument();
    }
}
