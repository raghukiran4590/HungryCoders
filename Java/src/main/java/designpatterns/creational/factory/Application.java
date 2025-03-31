package src.main.java.designpatterns.creational.factory;

//Creator Class
public abstract class Application {
    protected abstract Document createDocument();

    public void newDocument() {
        Document document = createDocument();
        document.open();
        document.save();
        document.close();
        //More operations
    }
}
