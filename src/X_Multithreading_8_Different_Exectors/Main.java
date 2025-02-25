package X_Multithreading_8_Different_Exectors;

import W_Multithreading_7_Future_CompletableFuture_Callable.Future;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        // 1. newFixedThreadPool Executor -> method to create a thread pool with a fixed no. of Threads
        // // min-size, max-size => same
        // // when we know how many threads/async tasks are needed
        ExecutorService poolExecutor1 = Executors.newFixedThreadPool(5);
        poolExecutor1.submit(() -> "This is the async task");

        // 2. newCachedThreadPool Executor -> method to create a thread pool that creates a new thread as needed (dynamically)
        // // min-size = 0, max-size = Integer.MAX_VALUE
        // // Good to handle burst of short-lived tasks
        ExecutorService poolExecutor2 = Executors.newCachedThreadPool();
        poolExecutor2.submit(() -> "This is the async task");

        // 3. newSingleThreadExecutor -> Executor with single worker thread
        // // min-size = 1, max-size = 1
        // // one by one execution
        ExecutorService poolExecutor3 = Executors.newSingleThreadExecutor();
        poolExecutor3.submit(() -> "This is the async task");

        // 4. WorkStealing Pool Executor -> It creates a fork-join pool executor
        // // no. of threads depend on available processors or we can specify in the parameter
        // // There are two queues => 1. Submission Queue  2. Work-Stealing Queue for each Thread (It's a Deque)
        ForkJoinPool pool = ForkJoinPool.commonPool();
        ForkJoinTask<Integer> futureObj = pool.submit(new ComputeSumTask(0, 100));
        try {
            System.out.println(futureObj.get());
        } catch (Exception ex) {
            //
        }
    }
}

class ComputeSumTask extends RecursiveTask<Integer> {

    int start, end;
    ComputeSumTask(int start, int end){
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        if(end - start <= 4){
            int sum = 0;
            for(int i = start; i <= end; i++){
                sum += i;
            }
            return sum;
        } else {
            int mid = (start + end) / 2;

            ComputeSumTask leftTask = new ComputeSumTask(start, mid);
            ComputeSumTask rightTask = new ComputeSumTask(mid + 1, end);

            leftTask.fork();
            rightTask.fork();

            int leftResult = leftTask.join();
            int rightResult = rightTask.join();

            return leftResult + rightResult;
        }
    }
}
