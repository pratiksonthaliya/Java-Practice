package P_Collections_3;

import A_OOPs.A;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> salaries = new ArrayList<>();

        salaries.add(50000);
        salaries.add(60000);
        salaries.add(70000);
        salaries.add(90000);
        salaries.add(80000);
        salaries.add(50000);

        // Filter
        long count = salaries.stream().filter((Integer sal) -> sal > 50000).count();
        System.out.println(count);

        Stream<Integer> sal = salaries.stream();

    // Intermediate Operations
        // Map
        Stream<Integer> incrementedSalary = salaries.stream().filter((Integer sala) -> sala > 50000).map(sala -> sala + 60000);
        incrementedSalary.forEach((Integer sal1) -> System.out.println(sal1));
        System.out.println();

        // Distinct
        Stream<Integer> distinctSalaries = salaries.stream().distinct();
        distinctSalaries.forEach((Integer sal2) -> System.out.println(sal2));
        System.out.println();

        // Sorted
        Stream<Integer> sortedSalaries = salaries.stream().sorted();
//        sortedSalaries.forEach((Integer sal2) -> System.out.println(sal2));
        System.out.println();

        // Peek -> see intermediate results
        Stream<Integer> numbers = salaries.stream().filter((Integer val) -> val > 50000).peek((Integer val) -> System.out.println(val)).map(val -> -1*val);
        numbers.forEach((Integer sal1) -> System.out.println(sal1));
        System.out.println();

        // Limit -> max size of stream
        Stream<Integer> sortedLimitedSalaries = salaries.stream().sorted().distinct().limit(4);
        sortedLimitedSalaries.forEach((Integer sal2) -> System.out.println(sal2));
        System.out.println();

        // Skip -> skips first n occurrences
        Stream<Integer> skippedSalaries = salaries.stream().distinct().skip(2);
        skippedSalaries.forEach((Integer sal2) -> System.out.println(sal2));
        System.out.println();

        // mapToInt, mapToDouble, mapToLong
        List<String> nums = Arrays.asList("2", "7", "9", "50");
        IntStream numsStream = nums.stream().mapToInt((String num) -> Integer.parseInt(num));
        numsStream.forEach((val) -> System.out.println(val));


    // Terminal Operations
        // forEach
//        skippedSalaries.forEach(val -> System.out.println(val));

        //toArray
//        Object[] sortedSalariesArray1 = sortedSalaries.toArray();
//        Integer[] sortedSalariesArray = sortedSalaries.toArray((int sz) -> new Integer[sz]);

        //Reduce
//        System.out.println(sortedSalaries.reduce((val1, val2) -> val1 + val2).get());

        // Collect
//        List<Integer> sortedSalariesList = sortedSalaries.collect(Collections.toList());

        // max
//        System.out.println(sortedSalaries.min((val1, val2) -> val2 - val1).get());

        // min
//        System.out.println(sortedSalaries.min((val1, val2) -> val1 - val2).get());

        // count
//        System.out.println(sortedSalaries.count());

        // anyMatch, allMatch, noneMatch -> true/false
//        System.out.println(sortedSalaries.anyMatch((Integer val) -> val > 70000));

        //findFirst
//        System.out.println(sortedSalaries.filter((Integer val) -> val > 60000).findFirst().get());




    }
}
