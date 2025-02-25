package W_Multithreading_7_Future_CompletableFuture_Callable;

import java.util.concurrent.*;

public class CompletableFuturePractice {
    public static void main(String[] args) {
        // Completable Future:
        // // 1. helps in async programming
        // // 2. helps in chaining

        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.HOURS,
                new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        // 1. CompletableFuture.applyAsync
        try {
            CompletableFuture<String> asyncTask1 = CompletableFuture.supplyAsync(() -> {
                return "Task Completed";
            }, poolExecutor);

            System.out.println(asyncTask1.get());
        } catch (Exception ex){}

        // 2. CompletableFuture.thenApply / CompletableFuture.thenApplyAsync
        // // thenApply -> synchronous -> uses same thread which completed previous async task
        // // thenApplyAsync -> asynchronous -> uses different thread (from fork join pool,...)
        // //                   ordering can't be guaranteed in multiple thenApplyAsync
        try {
            CompletableFuture<String> asyncTask2 = CompletableFuture.supplyAsync(() -> {
                // Task which thread needs to execute
                return "Concept and ";
            }, poolExecutor).thenApply((val) -> {
                return val + "Coding";
            });

            System.out.println(asyncTask2.get());
        } catch (Exception ex){}

        // 3. CompletableFuture.thenCompose / CompletableFuture.thenComposeAsync
        // // chains together dependent async operations. Next operation depends on result of previous async one
        // // Brings ordering for async tasks
        try {
            CompletableFuture<String> asyncTask3 = CompletableFuture.supplyAsync(() -> {
                // Task which thread needs to execute
                System.out.println("Thread which runs supplyAsync: " + Thread.currentThread().getName());
                return "Concept and ";
            }, poolExecutor).thenCompose((String val) -> {
                return CompletableFuture.supplyAsync(() -> {
                    System.out.println("Thread which runs thenCompose: " + Thread.currentThread().getName());
                    return val + "Coding";
                });
            });

            System.out.println(asyncTask3.get());
        } catch (Exception ex){}

        // 4. CompletableFuture.thenAccept / CompletableFuture.thenAcceptAsync
        // // generally end stage, in the chain of async operations
        // // It doen't return anything
        try {
            CompletableFuture<Void> asyncTask4 = CompletableFuture.supplyAsync(() -> {
                // Task which thread needs to execute
                System.out.println("Thread which runs supplyAsync: " + Thread.currentThread().getName());
                return "Concept and ";
            }, poolExecutor).thenAccept((String val) -> {
                System.out.println("All Stages completed");
            });

            System.out.println(asyncTask4.get());
        } catch (Exception ex){}

        // 5. CompletableFuture.thenCombine / CompletableFuture.thenCombineAsync
        // // chains together dependent async operations. Next operation depends on result of previous async one
        // // Brings ordering for async tasks
        try {
            CompletableFuture<String> asyncTask5 = CompletableFuture.supplyAsync(() -> {
                // Task which thread needs to execute
                System.out.println("Thread which runs supplyAsync: " + Thread.currentThread().getName());
                return "Concept and ";
            }, poolExecutor);
            CompletableFuture<String> asyncTask6 = CompletableFuture.supplyAsync(() -> {
                System.out.println("Thread which runs supplyAsync: " + Thread.currentThread().getName());
                return "Coding";
            }, poolExecutor);
            CompletableFuture<String> ans = asyncTask5.thenCombine(asyncTask6, (String val1, String val2) -> val1 + val2);
            System.out.println(ans.get());
        } catch (Exception ex){}
    }
}
