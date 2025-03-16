package src.main.java.multithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public class MyThreads extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("thread started running");
        System.out.println("thread completed successfully");
    }

    public static void main(String[] args) {

        MyThreads th = new MyThreads();
        th.run();

        Thread th2 = new Thread(()-> {
            System.out.println("thread-2 is running");
        });

        th2.start();
    }
}
