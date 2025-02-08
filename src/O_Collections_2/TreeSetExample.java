package O_Collections_2;

import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        // Sorted Set
        SortedSet<Integer> st1 = new TreeSet<>((a, b) -> b-a);
        st1.add(12);
        st1.add(96);
        st1.add(17);
        st1.add(67);

        Iterator it = st1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
