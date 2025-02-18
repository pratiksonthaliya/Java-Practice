package N_Collections_1;

import java.util.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args) {
        // Implements both deque as well as list -> can act as both
        // Deque -> add and remove from last
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addLast(67);
        ll.addLast(56);
        ll.addFirst(34);
        ll.addFirst(89);
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());

        // List -> add and get from index
        ll.add(4, 90);
        ll.add(3, 23);
        System.out.println(ll.get(4));

        ll.forEach((a) -> System.out.print(a + " "));
    }
}
