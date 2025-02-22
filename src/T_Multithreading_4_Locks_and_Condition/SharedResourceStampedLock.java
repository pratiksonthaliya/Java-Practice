package T_Multithreading_4_Locks_and_Condition;

import java.util.concurrent.locks.StampedLock;

public class SharedResourceStampedLock {
    boolean isAvailable = true;
    StampedLock lock = new StampedLock();

    public void producer() {
        long stamp = lock.tryOptimisticRead();
        if(lock.validate(stamp)){
            // Read Shared Resource
            System.out.println("No Lock Acquired");
        } else {
            stamp = lock.readLock();
            try {
                System.out.println("ReadLock acquired by: " + Thread.currentThread().getName());
                isAvailable = true;
            } catch (Exception ex) {
                //
            } finally {
                lock.unlockRead(stamp);
                System.out.println("ReadLock released by: " + Thread.currentThread().getName());
            }
        }
    }

    public void consumer() {
        long stamp1 = lock.writeLock();
        try {
            System.out.println("WriteLock acquired by: " + Thread.currentThread().getName());
            isAvailable = true;
        } catch (Exception ex) {
            //
        } finally {
            lock.unlockWrite(stamp1);
            System.out.println("WriteLock released by: " + Thread.currentThread().getName());
        }
    }
}
