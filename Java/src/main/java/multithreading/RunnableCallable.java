package src.main.java.multithreading;

import java.util.concurrent.*;

public class RunnableCallable {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Runnable task = () -> {
            System.out.println("Runnable Task");
        };

        Callable<Object> callable = Executors.callable(task);

        Callable<String> callTask = () -> {
            Thread.sleep(1000);
            return "Callable Task Started";
        };

        Runnable runnable = () -> {
            try {
                callTask.call();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        };

        Thread th1 = new Thread(task);
        th1.start();

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(task);
        executorService.shutdown();
        System.out.println("Runnable Task Shutdown");

        ExecutorService callTaskService = Executors.newSingleThreadExecutor();
        Future<String> submit = callTaskService.submit(callTask);
        System.out.println(submit.isDone());
//        System.out.println(submit.resultNow());
        System.out.println(submit.get());
        System.out.println(submit.isDone());
        callTaskService.shutdown();
        System.out.println("Callable Task Shutdown");

    }

}
