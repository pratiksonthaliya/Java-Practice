package U_Multithreading_5_Lock_Free_Mechanism;

public class SynchronizedSharedResource {
    int counter;

    public synchronized void increment() {
        counter++;
    }

    public int get(){
        return counter;
    }
}
