package src.main.java.multithreading;


import java.util.concurrent.*;

public class ExecutorServiceExamples {

    public static void main(String[] args) {

       ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);

        System.out.println("Fixed Thread Pool");

        for(int i = 1; i<= 5; i++) {
            final int taskId = i;
            fixedThreadPool.execute(() -> {
                System.out.println("Fixed Thread Task "+taskId+" executed by Thread : "+Thread.currentThread().getName());
            });
        }

      /*  ExecutorService singleThreadPoll = Executors.newSingleThreadExecutor();

        System.out.println("Single Thread Pool");

        for(int i = 1; i<= 5; i++) {
            final int taskId = i;
            singleThreadPoll.execute(() -> {
                System.out.println("Fixed Thread Task "+taskId+" executed by Thread : "+Thread.currentThread().getName());
            });
        }*/

       /* ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

        System.out.println("Cached Thread Pool");

        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            cachedThreadPool.execute(() -> {
                System.out.println("Fixed Thread Task " + taskId + " executed by Thread : " + Thread.currentThread().getName());
            });
        }*/

        /*ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);

        System.out.println("Scheduled Thread Pool");

        scheduledExecutorService.scheduleWithFixedDelay(()-> {
            System.out.println("Scheduled with fixed delay");
        }, 0, 5, TimeUnit.SECONDS);

        scheduledExecutorService.scheduleAtFixedRate(()-> {
            System.out.println("Scheduled with fixed delay");
        }, 0, 5, TimeUnit.SECONDS);*/
    }
}
