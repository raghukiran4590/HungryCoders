package src.main.java.multithreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {

    private static final int BUFFER_SIZE = 5;
    private final BlockingQueue<Integer> buffer = new ArrayBlockingQueue<>(BUFFER_SIZE);
    private int value = 0;

    class Producer implements Runnable {

        @Override
        public void run() {
            while (true) {
                try {
                    value++;
                    //Will automatically block if the buffer is full
                    buffer.put(value);
                    System.out.println("Produced : " + value);
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
                    //Will automatically block if the buffer is empty
                    int value = buffer.take();
                    System.out.println("Consumed : " + value);
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
