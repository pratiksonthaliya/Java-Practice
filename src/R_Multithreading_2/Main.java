package R_Multithreading_2;

public class Main {
    public static void main(String[] args) {
        System.out.println("MultiThreading Part 2");

//        // Using Runnable Interface
//        System.out.println("Going Inside Main Thread: " + Thread.currentThread().getName());
//        ThreadUsingRunnableInterface runnableObj = new ThreadUsingRunnableInterface();
//        Thread thread = new Thread(runnableObj);
//        thread.start();
//        System.out.println("Finish Main Method: " + Thread.currentThread().getName());
//
//        // Using Thread Class
//        System.out.println("Going Inside Main Thread: " + Thread.currentThread().getName());
//        ThreadUsingThreadClass runnableObj1 = new ThreadUsingThreadClass();
//        Thread thread1 = new Thread(runnableObj);
//        thread1.start();
//        System.out.println("Finish Main Method: " + Thread.currentThread().getName());

//        MonitorLockExample obj = new MonitorLockExample();
//
//        Thread t1 = new Thread(() -> obj.task1());
//        Thread t2 = new Thread(() -> obj.task2());
//        Thread t3 = new Thread(obj::task3);
//
//        t1.start();
//        t2.start();
//        t3.start();

//        SharedResource resource = new SharedResource();
//        Thread t1 = new Thread(() -> resource.consumeItem());
//        Thread t2 = new Thread(() -> resource.produceItem());
//        Thread t3 = new Thread(() -> resource.consumeItem());
//        Thread t4 = new Thread(resource::produceItem);
//
//        t4.start();
//        t1.start();
//        t2.start();
//        t3.start();



    }
}
