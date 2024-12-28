package A_OOPs;

public class Vehicle {
    boolean engine = true;
    boolean getEngine(){
        return this.engine;
    }
}

class Bike extends Vehicle{
    String type = "Two wheeler";
    String getType(){
        return type;
    }
}
