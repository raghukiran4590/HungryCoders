package src.main.java.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {

    private AtomicInteger counter = new AtomicInteger(0);

    public void increment() {
        counter.incrementAndGet();
    }

    public int getCounter() {
        return counter.get();
    }
}
