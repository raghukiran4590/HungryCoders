package src.main.java.multithreading;

import java.util.concurrent.Callable;

public class DaemonThread {

    public static void main(String[] args) {
        Thread myDaemon = new Thread(() -> {
            while (true) {
                try {
                    System.out.println("Daemon thread is running...");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Runnable run;

        Callable callable;

        myDaemon.setDaemon(true);
        myDaemon.start();

    }
}
