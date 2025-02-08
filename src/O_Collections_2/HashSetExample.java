package O_Collections_2;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Integer> st1 = new HashSet<>();
        st1.add(12);
        st1.add(16);
        st1.add(17);
        st1.add(67);

        Set<Integer> st2 = new HashSet<>();
        st2.add(12);
        st2.add(88);
        st2.add(99);
        st2.add(6);

        // Union
        st1.addAll(st2);
        System.out.println("after union");
        st1.forEach((Integer val) -> System.out.println(val));

        st1 = new HashSet<>();
        st1.add(12);
        st1.add(16);
        st1.add(17);
        st1.add(67);

        // Intersection
        st1.retainAll(st2);
        System.out.println("after intersection");
        st1.forEach((Integer val) -> System.out.println(val));

        st1 = new HashSet<>();
        st1.add(12);
        st1.add(16);
        st1.add(17);
        st1.add(67);

        // Difference
        st1.removeAll(st2);
        System.out.println("after difference");
        st1.forEach((Integer val) -> System.out.println(val));
    }
}
