package R_Multithreading_2.ProducerConsumer;

public class ProduceTask implements Runnable{
    SharedResource resource;

    ProduceTask(SharedResource resource){
        this.resource = resource;
    }

    @Override
    public void run() {
        System.out.println("Produce Thread: " + Thread.currentThread().getName());
        try{
            Thread.sleep(10000);
        } catch (Exception ex){
            //
        }
        resource.produceItem();
    }
}
