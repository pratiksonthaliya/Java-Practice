package V_Multithreading_6_ThreadPoolExecutor;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(2, 5, 1,
                TimeUnit.HOURS, new ArrayBlockingQueue<>(10), new CustomThreadFactor(),
                new CustomRejectedHandler());

        poolExecutor.allowCoreThreadTimeOut(true);

        for(int i=0; i<25; i++){
            poolExecutor.submit(() -> {
               try {
                   Thread.sleep(5000);
                   System.out.println("Thread name: " + Thread.currentThread().getName());
               } catch (Exception ex){
                   //
               }
            });
        }

        poolExecutor.shutdown();
    }
}

class CustomRejectedHandler implements RejectedExecutionHandler {

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        // logging
        System.out.println("Task Denied: " + r.toString() + " " + executor.toString());
    }
}

class CustomThreadFactor implements ThreadFactory {

    @Override
    public Thread newThread(Runnable r) {
        return new Thread(r);
    }
}
