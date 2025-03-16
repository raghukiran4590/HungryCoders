package src.main.java.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

class SharedResource {

//    private volatile boolean flag = false;
    private  boolean flag = false; // Can be achieved by using the synchronized keyword for methods

    public synchronized boolean isFlag() {
        return flag;
    }

    public synchronized void setFlag(boolean flag) {
        this.flag = flag;
    }

    public static void main(String[] args) {

        SharedResource sharedResource = new SharedResource();

        //Thread 1
        new Thread(() -> {
            try {
                System.out.println("Thread-1 logic started");
                Thread.sleep(1000);
                System.out.println("Thread-1 logic completed");
                sharedResource.setFlag(true);
                System.out.println("Flag set by Thread-1");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();

        new Thread(() -> {
                System.out.println("Thread-2 logic started");
                while(!sharedResource.isFlag()) {
                    //It will run until the flag is set to true
                }
            System.out.println("Thread-2 logic completed");
        }).start();
    }

}
