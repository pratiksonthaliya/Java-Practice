package T_Multithreading_4_Locks_and_Condition;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResourceReentrantLock {
    boolean isAvailable = false;
    ReentrantLock lock = new ReentrantLock();

    public void producer() {
        try {
            lock.lock();
            System.out.println("Lock acquired by: " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(5000);
        } catch (Exception ex) {
            //
        } finally {
            lock.unlock();
            System.out.println("Lock released by: " + Thread.currentThread().getName());
        }
    }

}
