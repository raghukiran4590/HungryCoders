package src.main.java.multithreading;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class SemaphoreExample {

    private static final int BUFFER_SIZE = 5;
    private final Queue<Integer> buffer = new LinkedList<>();
    private final Semaphore emptySlots = new Semaphore(BUFFER_SIZE);
    private final Semaphore filledSlots = new Semaphore(0);
    private final Semaphore bufferLock = new Semaphore(1);
    private int value = 0;

    class Producer implements Runnable {

        @Override
        public void run() {
            while (true) {
                try {
                    emptySlots.acquire();
                    bufferLock.acquire();
                    value++;
                    buffer.add(value);
                    System.out.println("Produced : "+value);
                    bufferLock.release();
                    filledSlots.release();
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }

    class Consumer implements Runnable {

        @Override
        public void run() {
            while (true) {
                try {
                    filledSlots.acquire();
                    bufferLock.acquire();
                    int value = buffer.poll();
                    System.out.println("Consumed : "+value);
                    bufferLock.release();
                    emptySlots.release();
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }

    public void start() {
        new Thread(new Producer()).start();
        new Thread(new Consumer()).start();
    }

    public static void main(String[] args) {
        new BlockingQueueExample().start();
    }
}
