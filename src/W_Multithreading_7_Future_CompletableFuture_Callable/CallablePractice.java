package W_Multithreading_7_Future_CompletableFuture_Callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CallablePractice {
    // Callable -> Callable represents the task which need to be executed just like runnable
    // // Runnable doesn't have return type but callable has.

    // Runnable Interface
    @FunctionalInterface
    public interface Runnable {
        public abstract void run();
    }

    // Callable Interface
    @FunctionalInterface
    public interface Callable<V> {
        V call() throws Exception;
    }

    public static void main(String[] args) {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.HOURS,
                new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        // Usecase 1:
        java.util.concurrent.Future<?> futureObj = poolExecutor.submit(() -> {
            System.out.println("Task1 with runnable");
        });
        try {
            Object object = futureObj.get();
            System.out.println(object);
        } catch (Exception ex){}

        // Usecase 2:
        List<Integer> output = new ArrayList<>();
        java.util.concurrent.Future<List<Integer>> futureObj2 = poolExecutor.submit(() -> {
            output.add(100);
            System.out.println("Task 2 with Runnable and return object");
        }, output);
        try {
            List<Integer> outputFromFutureObject2 = futureObj2.get();
            System.out.println(outputFromFutureObject2.get(0));
        } catch (Exception ex){}


        // Usecase 3:
        java.util.concurrent.Future<List<Integer>> futureObj3 = poolExecutor.submit(() -> {
            System.out.println("Task 3 with Callable");
            List<Integer> list = new ArrayList<>();
            list.add(200);
            return list;
        });
        try {
            List<Integer> outputFromFutureObject3 = futureObj3.get();
            System.out.println(outputFromFutureObject3.get(0));
        } catch (Exception ex){}
    }
}
