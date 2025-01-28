package N_Collections;

import java.util.Arrays;

public class SortingPractice {
    public static void main(String[] args) {
        int[] arr = {6, 5, 7, 9, 2, 4};
        Arrays.sort(arr);

        for(int val : arr) System.out.print(val + " ");
        System.out.println();

        Car[] cars = new Car[3];
        cars[0] = new Car("SUV", "petrol");
        cars[1] = new Car("Sedan", "diesel");
        cars[2] = new Car("HatchBack", "CNG");

        // M1
        Arrays.sort(cars, (Car a, Car b) -> a.carType.compareTo(b.carType));
        for(Car car : cars) System.out.print(car.carName + " ");
        System.out.println();

        // M2
        Arrays.sort(cars, new CarNameComparator());
        for(Car car : cars) System.out.print(car.carName + " ");
        System.out.println();

        // M3
        Arrays.sort(cars, new Car());
        for(Car car : cars) System.out.print(car.carName + " ");
        System.out.println();



    }
}
