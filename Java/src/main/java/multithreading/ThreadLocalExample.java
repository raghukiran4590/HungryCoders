package src.main.java.multithreading;

public class ThreadLocalExample {

    ThreadLocal<Long> userIDThreadLocal = new ThreadLocal<>();
    InheritableThreadLocal<String> userIDInheritedThreadLocal = new InheritableThreadLocal<>();

    public static void main(String[] args) {

        ThreadLocalExample threadLocalExample = new ThreadLocalExample();

        Long userID = 1234L;
        Long userID2 = 45678L;

        new Thread(()-> {
            System.out.println("Thread-1 started");
            threadLocalExample.userIDThreadLocal.set(userID);
            System.out.println("Thread-1 Local UserID : "+threadLocalExample.userIDThreadLocal.get());
            threadLocalExample.userIDThreadLocal.remove();
            System.out.println("Thread-1 Local UserID : "+threadLocalExample.userIDThreadLocal.get());
        }).start();

        new Thread(()-> {
            System.out.println("Thread-2 started");
            threadLocalExample.userIDThreadLocal.set(userID2);
            System.out.println("Thread-2 Local UserID : "+threadLocalExample.userIDThreadLocal.get());
            threadLocalExample.userIDThreadLocal.remove();
            System.out.println("Thread-2 Local UserID : "+threadLocalExample.userIDThreadLocal.get());
        }).start();

        new Thread(()-> {
            System.out.println("Thread-3 started");
            threadLocalExample.userIDInheritedThreadLocal.set("Google");
            System.out.println("Thread-3 Local UserID : "+threadLocalExample.userIDInheritedThreadLocal.get());
            new Thread(() -> {
                System.out.println("Thread-3 Child Thread started");
                System.out.println("Thread-3 Child Thread UserID : "+threadLocalExample.userIDInheritedThreadLocal.get());
                threadLocalExample.userIDInheritedThreadLocal.remove();
            }).start();
            System.out.println("Thread-3 Local UserID after removed : "+threadLocalExample.userIDInheritedThreadLocal.get());
        }).start();

    }
}
