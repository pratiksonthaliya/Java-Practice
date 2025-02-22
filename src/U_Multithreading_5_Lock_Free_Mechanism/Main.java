package U_Multithreading_5_Lock_Free_Mechanism;

public class Main {
    public static void main(String[] args) {
        System.out.println("MultiThreading Part 5: ");

        // Using Main Thread:
//        SharedResource resource = new SharedResource();
//        for(int i=0; i<400; i++){
//            resource.increment();
//        }
//        System.out.println(resource.get());

        // Using Multiple Threads -> Try running multiple times and you will get different results
//        SharedResource resource = new SharedResource();
//        Thread t1 = new Thread(() -> {
//            for (int i=0; i<200; i++){
//                resource.increment();
//            }
//        });
//        Thread t2 = new Thread(() -> {
//            for (int i=0; i<200; i++){
//                resource.increment();
//            }
//        });
//        t1.start();
//        t2.start();
//
//        try {
//            // wait for both threads to complete its work before moving forward
//            t1.join();
//            t2.join();
//        } catch (Exception ex){//
//        }
//        System.out.println(resource.get());


        // Solution 1: Using Synchronized Method
//        SynchronizedSharedResource resource = new SynchronizedSharedResource();
//        Thread t1 = new Thread(() -> {
//            for (int i=0; i<200; i++){
//                resource.increment();
//            }
//        });
//        Thread t2 = new Thread(() -> {
//            for (int i=0; i<200; i++){
//                resource.increment();
//            }
//        });
//        t1.start();
//        t2.start();
//
//        try {
//            // wait for both threads to complete its work before moving forward
//            t1.join();
//            t2.join();
//        } catch (Exception ex){//
//        }
//        System.out.println(resource.get());

        // Solution 2: Using lock free operation like AtomicInteger
        AtomicSharedResource resource = new AtomicSharedResource();
        Thread t1 = new Thread(() -> {
            for (int i=0; i<200; i++){
                resource.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i=0; i<200; i++){
                resource.increment();
            }
        });
        t1.start();
        t2.start();

        try {
            // wait for both threads to complete its work before moving forward
            t1.join();
            t2.join();
        } catch (Exception ex){//
        }
        System.out.println(resource.get());
    }
}
