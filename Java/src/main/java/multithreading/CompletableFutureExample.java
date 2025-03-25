package src.main.java.multithreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {

    //Introduced in Java 8 to run the

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> future_thread = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("Future Thread");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Ok";
        });
        String s = future_thread.get();
        System.out.println(s);
        System.out.println("Main Thread");

        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("f1 Thread");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Ok";
        }).thenApply(x-> x + x);

        CompletableFuture<String> f2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("f2 Thread");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Ok";
        }).thenApply(x-> x + x);

//        f2.orTimeout(1, TimeUnit.SECONDS).exceptionally(e -> "Timeout Occurred");

        CompletableFuture<Void> f = CompletableFuture.allOf(f1, f2);
        f.join();
        System.out.println("End");
    }
}
