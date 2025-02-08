package O_Collections_2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // decreasing order
        SortedMap<Integer, String> mp = new TreeMap<>((Integer key1, Integer key2) -> key2 - key1);
        mp.put(1, "A");
        mp.put(256, "B");
        mp.put(39, "C");
        mp.put(4678, "D");
        mp.put(57, "E");
        System.out.println(mp.firstKey());
        System.out.println(mp.lastKey());

        mp.forEach((Integer key, String val) -> System.out.println(key + " " + val));

        // increasing order
//        Map<Integer, String> mp = new TreeMap<>((Integer key1, Integer key2) -> key1 - key2);
//        Map<Integer, String> mp = new TreeMap<>();
//        mp.put(1, "A");
//        mp.put(256, "B");
//        mp.put(39, "C");
//        mp.put(4678, "D");
//        mp.put(57, "E");
//        mp.forEach((Integer key, String val) -> System.out.println(key + " " + val));

    }
}
