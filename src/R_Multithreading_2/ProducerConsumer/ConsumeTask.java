package R_Multithreading_2.ProducerConsumer;

public class ConsumeTask implements Runnable{
    SharedResource resource;

    ConsumeTask(SharedResource resource){
        this.resource = resource;
    }

    @Override
    public void run(){
        System.out.println("Consumer Thread: " + Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (Exception ex){
            //
        }
        resource.consumeItem();
    }
}
