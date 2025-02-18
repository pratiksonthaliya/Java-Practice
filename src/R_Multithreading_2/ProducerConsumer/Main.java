package R_Multithreading_2.ProducerConsumer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main Thread Start");

        SharedResource resource = new SharedResource();

        Thread producerThread = new Thread(new ProduceTask(resource));
        Thread consumerThread = new Thread(new ConsumeTask(resource));

        consumerThread.start();
        producerThread.start();

        System.out.println("Main Thread End");
    }
}
