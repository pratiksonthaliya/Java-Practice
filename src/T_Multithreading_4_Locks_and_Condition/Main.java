package T_Multithreading_4_Locks_and_Condition;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {
    public static void main(String[] args) {
        System.out.println("MultiThreading Part 4: ");

        // 1. ReentrantLock
//        SharedResourceReentrantLock resource = new SharedResourceReentrantLock();
//        Thread t1 = new Thread(() -> {
//            resource.producer();
//        });
//        Thread t2 = new Thread(() -> {
//            resource.producer();
//        });
//        t1.start();
//        t2.start();

        // 2. ReadWriteLock
//        SharedResourceReadWriteLock resource1 = new SharedResourceReadWriteLock();
//        ReadWriteLock lock = new ReentrantReadWriteLock();
//        Thread t3 = new Thread(() -> {
//           resource1.producer(lock);
//        });
//        Thread t4 = new Thread(() -> {
//            resource1.producer(lock);
//        });
//        t3.start();
//        t4.start();
//        SharedResourceReadWriteLock resource2 = new SharedResourceReadWriteLock();
//        Thread t5 = new Thread(() -> {
//            resource2.consumer(lock);
//        });
//        t5.start();

        // 3. StampedLock
//        SharedResourceStampedLock resource = new SharedResourceStampedLock();
//        Thread t1 = new Thread(() -> {
//            resource.consumer();
//        });
//        Thread t2 = new Thread(() -> {
//            resource.producer();
//        });
//        t1.start();
//        t2.start();

        // 4. Semaphores
        SharedResourceWithSemaphore resource = new SharedResourceWithSemaphore();
        Thread t1 = new Thread(() -> {
            resource.producer();
        });
        Thread t2 = new Thread(resource::producer);
        Thread t3 = new Thread(resource::producer);
        Thread t4 = new Thread(resource::producer);
        Thread t5 = new Thread(resource::producer);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
