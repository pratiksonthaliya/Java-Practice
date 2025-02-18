package N_Collections_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorPractice {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);

        System.out.println("Iterating the values using iterator method: ");
        Iterator<Integer> it = values.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();

        System.out.println("Iterating the values using for-each loop: ");
        for(int val : values){
            System.out.print(val + " ");
        }
        System.out.println();

        System.out.println("Iterating the values using for-each method: ");
        values.forEach((Integer val) -> System.out.print(val + " "));
    }
}
