package E_Basic_Classes;

// Abstract Class
public abstract class Car {
    int mileage;

    Car(int mileage){
        this.mileage = mileage;
    }

    public abstract void pressBrake();

    public abstract void pressClutch();

    public int getNumberOfWheels(){
        return 4;
    }
}

abstract class LuxaryCar extends Car {
    LuxaryCar(int mileage){
        super(mileage);
    }

    public abstract void pressDualBrakeSystem();

    @Override
    public void pressBrake(){
        // Implementation
    }
}

class Audi extends LuxaryCar {
    Audi(int mileage){
        super(mileage);
    }

    @Override
    public void pressClutch(){
        // Implementation
    }

    @Override
    public void pressDualBrakeSystem(){
        // Implementation
    }
}