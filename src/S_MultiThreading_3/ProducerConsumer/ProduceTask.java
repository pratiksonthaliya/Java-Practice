package S_MultiThreading_3.ProducerConsumer;

public class ProduceTask implements Runnable{
    SharedResource resource;

    ProduceTask(SharedResource resource){
        this.resource = resource;
    }

    @Override
    public void run() {
        System.out.println("Produce Thread: " + Thread.currentThread().getName());
        try{
            Thread.sleep((int)(Math.random()*10)*1000);
        } catch (Exception ex){
            //
        }
        resource.produceItem();
    }
}
