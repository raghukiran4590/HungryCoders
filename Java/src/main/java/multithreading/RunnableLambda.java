package src.main.java.multithreading;

public class RunnableLambda {

    public static void main(String[] args) {

        Runnable runnable = () -> {
            System.out.println("Runnable Lambda thread started");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getState());
        };

        Thread runnableThread = new Thread(runnable, "Runnable_Lambda_Thread");

        runnableThread.start();

        new Thread(() -> System.out.println("Shorter Syntax thread Started"), "Short_Syntax_Thread").start();
    }
}
