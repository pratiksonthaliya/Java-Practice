package T_Multithreading_4_Locks_and_Condition;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;

public class SharedResourceReadWriteLock {
    boolean isAvailable = false;

    public void producer(ReadWriteLock lock){
        try {
            lock.readLock().lock();
            System.out.println("Read Lock acquired by: " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(5000);
        } catch (Exception ex){
            //
        } finally {
            lock.readLock().unlock();
            System.out.println("Read Lock released by: " + Thread.currentThread().getName());
        }
    }

    public void consumer(ReadWriteLock lock) {
        try {
            lock.writeLock().lock();
            System.out.println("Write Lock acquired by: " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(5000);
        } catch (Exception ex){
            //
        } finally {
            lock.writeLock().unlock();
            System.out.println("Write Lock released by: " + Thread.currentThread().getName());
        }
    }
}
