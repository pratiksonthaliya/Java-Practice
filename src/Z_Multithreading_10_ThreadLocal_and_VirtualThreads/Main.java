package Z_Multithreading_10_ThreadLocal_and_VirtualThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ThreadLocal<String> threadLocalObj = new ThreadLocal<>();
        // create one object and used it for all threads
        // gives value of that thread which is under execution on that line.

        // main thread
        threadLocalObj.set(Thread.currentThread().getName());

        Thread th1 = new Thread(() -> {
            threadLocalObj.set(Thread.currentThread().getName());
            System.out.println("th1 Thread: " + threadLocalObj.get());
        });
        th1.start();

        try {
            Thread.sleep(2000);
        } catch (Exception ex) {}
        System.out.println("Main Thread: " + threadLocalObj.get());

        // Cleanup of ThreadLocal
        ExecutorService poolObj = Executors.newFixedThreadPool(5);
        poolObj.submit(() -> {
            threadLocalObj.set(Thread.currentThread().getName());
            threadLocalObj.remove();
        });

        for(int i=0; i<15; i++){
            poolObj.submit(() -> {
                System.out.println(threadLocalObj.get());
            });
        }
    }
}
