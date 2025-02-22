package U_Multithreading_5_Lock_Free_Mechanism;

public class SharedResource {
    int counter;

    public void increment() {
        counter++;
    }

    public int get(){
        return counter;
    }
}
