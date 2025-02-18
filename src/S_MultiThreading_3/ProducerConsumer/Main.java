package S_MultiThreading_3.ProducerConsumer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main Thread Start");

        SharedResource resource = new SharedResource();

        Thread consumerThread = new Thread(() -> {
            try {
                for(int i=0; i<=6; i++){
                    resource.consumeItem();
                }
            } catch (Exception ex){
                //
            }
        });

        Thread producerThread = new Thread(() -> {
            try {
                for(int i=0; i<=6; i++){
                    resource.produceItem();
//                    Thread.sleep(2000);
                }
            } catch (Exception ex){
                //
            }
        });

        consumerThread.start();
        producerThread.start();

        System.out.println("Main Thread End");
    }
}
