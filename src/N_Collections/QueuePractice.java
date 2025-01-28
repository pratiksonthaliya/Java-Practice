package N_Collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePractice {
    public static void main(String[] args) {

        // Queue
        Queue<Integer> q = new LinkedList<>();
        q.offer(57);
        q.offer(8);
        q.offer(89);

        while (!q.isEmpty()){
            System.out.print(q.poll() + " ");
        }
        System.out.println();

        // min PQ
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();
        minPQ.offer(57);
        minPQ.offer(8);
        minPQ.offer(89);

        while (!minPQ.isEmpty()){
            System.out.print(minPQ.poll() + " ");
        }
        System.out.println();

        // max PQ
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>((a, b) -> b - a);
        maxPQ.offer(57);
        maxPQ.offer(8);
        maxPQ.offer(89);

        // Printing values
        maxPQ.forEach((Integer a) -> System.out.print(a + " "));
        System.out.println();

        while (!maxPQ.isEmpty()){
            System.out.print(maxPQ.poll() + " ");
        }
    }
}
