package R_Multithreading_2.ProducerConsumer;

public class SharedResource {
    boolean itemAvailable = false;

    public synchronized void produceItem(){
        itemAvailable = true;
        System.out.println("Item produced by " + Thread.currentThread().getName() + " and invoking all threads which are awaiting");
        notifyAll();
    }

    public synchronized void consumeItem(){
        System.out.println("ConsumeItem Method invoked by " + Thread.currentThread().getName());

        while (!itemAvailable){
            try {
                System.out.println("Thread " + Thread.currentThread().getName() + " is waiting now");
                wait();
            } catch (Exception ex){
                //
            }
        }

        System.out.println("Item Consumed by " + Thread.currentThread().getName());
        itemAvailable = false;
    }

}
