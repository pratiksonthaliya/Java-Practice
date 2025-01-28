package N_Collections;

import java.util.ArrayDeque;

public class DequePractice {
    public static void main(String[] args) {
        // Deque -> can acts as both stack and queue
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offerFirst(56);
        dq.offerLast(536);
        dq.offerFirst(6);
        dq.offerLast(89);

        dq.forEach((val) -> System.out.print(val + " "));
        System.out.println();

        while (!dq.isEmpty()){
            System.out.println(dq.poll());
        }
    }
}
