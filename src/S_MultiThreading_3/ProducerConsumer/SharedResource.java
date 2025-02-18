package S_MultiThreading_3.ProducerConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {
    Queue<String> items = new LinkedList<>();
    int capacity = 5;

    public synchronized void produceItem(){
        System.out.println("ProduceItem Method invoked by " + Thread.currentThread().getName());

        while (items.size() == capacity){
            try {
                System.out.println("Queue is Full, Producer is waiting for Consumer");
                wait();
            } catch (Exception ex){
                //
            }
        };

        items.offer("Item");
        System.out.println("Item produced by " + Thread.currentThread().getName() + " and invoking all threads which are awaiting");
        notifyAll();
    }

    public synchronized void consumeItem(){
        System.out.println("ConsumeItem Method invoked by " + Thread.currentThread().getName());

        while (items.isEmpty()){
            try {
                System.out.println("Queue is empty, Consumer is waiting for Producer");
                wait();
            } catch (Exception ex){
                //
            }
        };

        System.out.println("Item Consumed by " + Thread.currentThread().getName());
        items.poll();
        notifyAll();
    }

}
