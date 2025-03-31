package src.main.java.designpatterns.creational.singleton;

public class LazyInitialization {

    private static LazyInitialization lazyInitialization;

    // private constructor to prevent instantiating
    private LazyInitialization(){}

    public static LazyInitialization getInstance() {
        if(lazyInitialization == null) {
            lazyInitialization = new LazyInitialization();
        }
        return lazyInitialization;
    }
}
