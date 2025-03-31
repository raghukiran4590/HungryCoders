package src.main.java.designpatterns.creational.factory;

public class SpreadsheetApplication extends Application{
    @Override
    protected Document createDocument() {
        return new SpreadsheetDocument();
    }
}
