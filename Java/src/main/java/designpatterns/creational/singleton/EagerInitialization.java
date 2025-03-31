package src.main.java.designpatterns.creational.singleton;

public class EagerInitialization {

    private static final EagerInitialization EAGER_INITIALIZATION = new EagerInitialization();

    // private constructor to prevent instantiating
    private EagerInitialization() {}

    public static EagerInitialization getInstance(){
        return EAGER_INITIALIZATION;
    }

}
