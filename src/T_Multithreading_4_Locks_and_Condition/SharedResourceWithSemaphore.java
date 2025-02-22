package T_Multithreading_4_Locks_and_Condition;

import java.util.concurrent.Semaphore;

public class SharedResourceWithSemaphore {
    // Allows limited number of locks to be acquired at a time. -> when we have limited number of resources

    boolean[] isAvailable = new boolean[4];
    Semaphore lock = new Semaphore(4);

    public void producer() {
        try {
            lock.acquire();
            System.out.println("Lock acquired by: " + Thread.currentThread().getName());
            for(int i=0; i<4; i++){
                if(!isAvailable[i]){
                    isAvailable[i] = true;
                    break;
                }
            }
            Thread.sleep(4000);
        } catch (Exception ex) {
            //
        } finally {
            System.out.println("Lock released by: " + Thread.currentThread().getName());
            lock.release();
        }
    }
}
