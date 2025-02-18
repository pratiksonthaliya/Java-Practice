package N_Collections_1;

import java.util.Comparator;

public class CarNameComparator implements Comparator<Car> {
    @Override
    public int compare(Car ob1, Car ob2){
        return ob2.carName.compareTo(ob1.carName);
    }
}
