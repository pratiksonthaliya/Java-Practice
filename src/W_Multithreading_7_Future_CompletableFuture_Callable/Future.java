package W_Multithreading_7_Future_CompletableFuture_Callable;

import java.util.concurrent.*;

public class Future {
    public static void main(String[] args) {
        System.out.println("MultiThreading Part 7: ");

        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.HOURS,
                new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        java.util.concurrent.Future<?> futureObj = poolExecutor.submit(() -> {
            try {
                Thread.sleep(7000);
                System.out.println("This is the task which Thread will execute");
            } catch (Exception ex) {
                //
            }
        });

        // Future -> Represent result of async task =>
        // // 1. Task Completed or Not
        // // 2. Get the result
        // // 3. Task care of exception if any

        System.out.println("is done: " + futureObj.isDone());

        try {
            futureObj.get(2, TimeUnit.SECONDS);
        } catch (TimeoutException ex){
            System.out.println("Timeout Exception happened");
        } catch (Exception ex) {}

        try {
            futureObj.get();
        } catch (Exception ex){}

        System.out.println("is done: " + futureObj.isDone());
        System.out.println("is cancelled: " + futureObj.isCancelled());
    }
}
