package src.main.java.designpatterns.creational.singleton;

public class SingletonExample {
    //Several Ways to implement singleton design pattern
        //Eager Initialization
        //Lazy Initialization
        //Thread-Safe Singleton
        //Double-Checked Locking
        //Bill Pugh Singleton

    public static void main(String[] args) {
        System.out.println("Eager Initialization : In this approach, the instance of the Singleton class is created at the time of class loading.");
        System.out.println("Lazy Initialization : In this approach, the instance is created only when it is needed for the first time.");
        System.out.println("Thread-Safe Singleton : To make the Lazy Initialization Singleton thread-safe, you can synchronize the getInstance method.");
        System.out.println("Double-Checked Locking : This is a more efficient thread-safe Singleton implementation. It reduces the overhead of acquiring a lock by first checking the instance variable without synchronization.");
        System.out.println("Bill Pugh Singleton : This approach uses a static inner helper class to hold the Singleton instance. This is a thread-safe and efficient way to create a Singleton.");

    }
}
