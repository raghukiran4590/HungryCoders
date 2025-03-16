package src.main.java.multithreading;

public class ThreadRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Runnable thread started");
        System.out.println("Runnable thread completed");
    }

    public static void main(String[] args) {

        ThreadRunnable tl = new ThreadRunnable();
        Thread th1 = new Thread(tl);
        th1.start();
    }
}
