package U_Multithreading_5_Lock_Free_Mechanism;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicSharedResource {
    AtomicInteger counter = new AtomicInteger(0);

    public void increment() {
        counter.incrementAndGet();
    }

    public int get(){
        return counter.get();
    }
}
