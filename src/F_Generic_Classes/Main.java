package F_Generic_Classes;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        System.out.println("Generic Classes");

        // Using Object as Reference
        Print print = new Print();
        print.setValue("Rama");
        System.out.println(print.getValue());

        print.setValue(25);
        System.out.println(print.getValue());
        if((int)print.getValue() == 1){
            // do something
            System.out.println("1 hai");
        }

        // Using Generics
        GPrint<Integer> gPrint = new GPrint<>();
        gPrint.setValue(2);
        System.out.println(gPrint.getValue());

        // Non-generic subclass
        ColorPrint colorPrint = new ColorPrint();
        colorPrint.setValue("2");
        System.out.println(colorPrint.getValue());

        // Generic subclass
        GColorPrint<Integer> gColorPrint = new GColorPrint<>();
        gColorPrint.setValue(2);

        GColorPrint<String> gColorPrint1 = new GColorPrint<>();
        gColorPrint1.setValue("Rama");

        Pair<String, Integer> pair = new Pair<>();
        pair.put("Ram", 25);

        GColorPrint<Pair<String, Integer>> pairGColorPrint = new GColorPrint<>();
        pairGColorPrint.setValue(pair);
        pairGColorPrint.getValue();

        // If we don't use generic to define the type. It internally uses Object as parameterized type and can be changed dynamically.
        // Not a good practice
        GPrint gPrint1 = new GPrint();
        gPrint1.setValue("Rama");
        System.out.println(gPrint1.getValue());
        gPrint1.setValue(23);
        System.out.println(gPrint1.getValue());


        Random<Integer> randomSting = new Random<>();
        randomSting.setRandomValue(23);
        System.out.println(randomSting.getRandomValue());

        A<Random> a = new A<>();

        // Upper Bound Wildcard  =>  <? extends UpperBoundClassName>  => className and below
        // Lower Bound Wildcard  =>  <? Super UpperBoundClassName>    => className and above
        // Unbound Wildcard      =>  <?>                              => className and below

        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Bike());
        vehicleList.add(new Car());

        List<Car> carList = new ArrayList<>();

        // vehicleList = carList; -> b/c vehicleList can have both bike nad car list, and it is reference only ie, if we add anything other than Bike to vehicleList it will invalidate the Bike type
        // carList = vehicleList; -> b/c vehicleList can have both bike nad car list

        Vehicle vehicle = new Vehicle();
        Bike bike = new Bike();
        vehicle = bike; // will run fine

//        print.setPrintValues(carList);
        print.setPrintValues(vehicleList);

        List<Object> objectList = new ArrayList<>();
        print.setPrintValues(objectList); // we can pass objectList since function is recieving only Vehicle and its super class


        List<Integer> wildCardIntegerSourceList = new ArrayList<>();
        List<Double> wildCardDoubleDestinationList = new ArrayList<>();

        print.computeList(wildCardIntegerSourceList, wildCardDoubleDestinationList);
        // print.computeList1(wildCardIntegerSourceList, wildCardDoubleDestinationList); -> Error


    }
}
