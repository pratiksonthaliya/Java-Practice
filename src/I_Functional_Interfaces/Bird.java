package I_Functional_Interfaces;

@FunctionalInterface //Single Abstract Method, can have other methods which aren't default
public interface Bird {
    void fly(String val);

    default int getHeight(){
        return 10;
    }

    static boolean canFly(){
        return true;
    }

    String toString(); //This method is inherited by Object Class -> we are just using it here.
}
