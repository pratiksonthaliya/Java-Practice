package I_Functional_Interfaces;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Functional Interfaces");

        // Method 1: Normal Class
        Bird eagleBird = new Eagle();
        eagleBird.fly("Woooo");

        // Method 2: Using Anonymous Class
        Bird eagleBirdObj = new Bird() {
            @Override
            public void fly(String val) {
                System.out.println("It can Fly");
            }
        };
        eagleBirdObj.fly("Speedy");

        // Method 3: Using Lambda Expression in Functional Interfaces b/c of single method
        Bird eagle = (String val) -> {
            System.out.println("Fly");
        };
        eagle.fly("vertical");


        // Types of builtin Functional Interfaces:

        // 1. Consumer
        Consumer<Integer> consumer = (Integer val) -> {
            if(val > 50) System.out.println(val);
        };
        consumer.accept(67);

        // 2. Supplier
        Supplier<String> supplier = () -> {
            return "Pratik";
        };
        Supplier<String> supplier2 = () -> "Pratik";
        System.out.println(supplier.get());

        // 3. Function
        Function<Integer, String> function = (val) -> {
            return val.toString();
        };
        function.apply(56);

        // - Predicate
        Predicate<Integer> isEven = (Integer val) -> {
            return (val%2 == 0);
        };
        System.out.println(isEven.test(8));
        System.out.println(isEven.test(9));

    }
}
