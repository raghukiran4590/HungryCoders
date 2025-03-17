package src.main.java.multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerExample {

    private static final int BUFFER_SIZE = 5;
    private final Queue<Integer> buffer = new LinkedList<>();
    private final Object lock = new Object();
    private int value = 0;

    class Producer implements Runnable {

        @Override
        public void run() {
            while (true) {
                synchronized (lock) {
                    //Wait till the buffer is full to produce new data
                    while (buffer.size() == BUFFER_SIZE) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                    }

                    value++;
                    buffer.add(value);
                    System.out.println("Produced : " + value);
                    lock.notifyAll();// Notify all waiting threads
                }

                //Slow down the production for demo
                try {
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
                synchronized (lock) {
                    //Wait till the buffer is empty to consume new data
                    while (buffer.isEmpty()) {
                        try {
                            lock.wait(); //Wait and release the lock
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                    }

                    int value = buffer.poll();
                    System.out.println("Consumed : " + value);
                    lock.notifyAll();// Notify all waiting threads
                }

                //Slow down the production for demo
                try {
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
