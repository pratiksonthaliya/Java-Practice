package Y_Multithreading_9_Shutdown_and_ScheduledThreadPoolExecutor;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        // 1. Shutdown -> doesn't accept new task, will work on already submitted tasks
        ExecutorService pool = Executors.newFixedThreadPool(5);
        pool.submit(() -> {
            try {
                Thread.sleep(4000);
                System.out.println("Thread going to start its work");
            } catch (Exception ex) {}
        });
        pool.shutdown();

//        pool.submit(() -> {
//            System.out.println("Thread going to start its work");
//        });

        // 2. awaitTermination -> Returns T/F, if ExecutorService gets shutdown within specific Timeout
        try {
            boolean isExecutorTerminated = pool.awaitTermination(5, TimeUnit.SECONDS);
            System.out.println("Main thread, isExecutorTerminated: " + isExecutorTerminated);
        } catch (Exception ex) {
            //
        }

        // 3. shutdownNow -> tries best to stop/interrupt the already running tasks, returns list of tasks which are awaiting execution


        // ScheduledThreadPoolExecutor
        ScheduledExecutorService scheduledExecutorServiceObj = new ScheduledThreadPoolExecutor(15);
        java.util.concurrent.Future<?> scheduledObj =  scheduledExecutorServiceObj.scheduleAtFixedRate(() -> {
            System.out.println("task going to be started by: " + Thread.currentThread().getName());
            try {
                Thread.sleep(10000);
            } catch (Exception ex) {
                //
            }
        }, 5, 5, TimeUnit.SECONDS);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        scheduledObj.cancel(true);
    }
}
