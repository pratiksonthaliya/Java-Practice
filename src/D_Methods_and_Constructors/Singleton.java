package D_Methods_and_Constructors;

public class Singleton {
    //Private Constructor
    private Singleton(){}

    public static Singleton getInstance(){
        return new Singleton();
    }
}
