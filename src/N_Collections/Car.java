package N_Collections;

import java.util.Comparator;

public class Car implements Comparator<Car> {
    String carName;
    String carType;

    Car(){}

    Car(String name, String type){
        this.carName = name;
        this.carType = type;
    }

    @Override
    public int compare(Car ob1, Car ob2){
        return ob2.carName.compareTo(ob1.carName);
    }
}
