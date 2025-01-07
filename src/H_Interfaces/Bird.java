package H_Interfaces;

public interface Bird {
    int MAX_HEIGHT_IN_FEET = 2000;
    // or
    public static final int MAX_HEIGHT = 4000;

    public void fly();
    // void hasBeak();
        // -> Methods are public implicitly


    // Nested Interfaces can have any access modifier
    public interface NonFlyingBird {
        public boolean canRun();
    }

    default int getMinimunFlyingHeight(){
        return 100;
    }

    // If overridden in subclass, will be treated as new methods/functions
    static boolean hasLegs(){
        return (numberOfLegs() > 0 ? true : false);
    }

    // Private static -> can be called in static functions only
    private static int numberOfLegs(){
        return 2;
    }

    // private fns can be called by default methods -> ued to hide internal computation
    private void speak(){
        System.out.println("Speaking in their language");
    }

    default void saySomething(){
        speak();
    }

}
