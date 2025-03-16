package src.main.java;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureThreadExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<String> future = executorService.submit(() -> {
            Thread.sleep(1000);
            return "Hello, Future!";
        });

        System.out.println(future.isDone() ? future.get() : "Not yet completed!");
        executorService.shutdown();
    }
}
