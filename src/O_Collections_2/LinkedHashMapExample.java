package O_Collections_2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Helps maintain insertion/retrieval order

        Map<Integer, String> mp = new LinkedHashMap<>();
        mp.put(1, "A");
        mp.put(2, "B");
        mp.put(39, "C");
        mp.put(4, "D");
        mp.put(57, "E");

        mp.forEach((Integer key, String val) -> System.out.println(key + " " + val));

        // Access Order -> recent access goes to last
        Map<Integer, String> mp1 = new LinkedHashMap<>(16, 75F, true);
        mp1.put(1, "A");
        mp1.put(2, "B");
        mp1.put(39, "C");
        mp1.put(4, "D");
        mp1.put(57, "E");

        mp1.get(57);
        mp1.get(1);

        mp1.forEach((Integer key, String val) -> System.out.println(key + " " + val));
    }
}
