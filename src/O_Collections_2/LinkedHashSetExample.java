package O_Collections_2;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Maintains insertion order
        Set<Integer> st1 = new LinkedHashSet<>();
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
