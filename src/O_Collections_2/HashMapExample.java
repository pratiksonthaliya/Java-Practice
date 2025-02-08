package O_Collections_2;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> mp = new HashMap<>();
        mp.put(null, "TEST");
        mp.put(8, null);
        mp.put(7, "Ram");

        mp.putIfAbsent(7, "SHYAM");

        for(Map.Entry<Integer, String> entry : mp.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("isEmpty() " + mp.isEmpty());
        System.out.println("size() " + mp.size());
        System.out.println("containsKey() " + mp.containsKey(8));
        System.out.println("containsValue() " + mp.containsValue("YEST"));
        System.out.println("get() " + mp.get(null));
        System.out.println("remove() " + mp.remove(null));

        for(Map.Entry<Integer, String> entry : mp.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // keySet()
        for(Integer key : mp.keySet()){
            System.out.println(key);
        }

        // values()
        for(String val : mp.values()){
            System.out.println(val);
        }

    }

}
