package src.main.java.designpatterns.creational.singleton;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton threadSafeSingleton;

    // private constructor to prevent instantiating
    private ThreadSafeSingleton(){}

    public static synchronized ThreadSafeSingleton getInstance() {
        if(threadSafeSingleton == null) {
            threadSafeSingleton = new ThreadSafeSingleton();
        }
        return threadSafeSingleton;
    }
}
