package src.main.java.multithreading;

public class Synchronization {

    private int count;

    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}
