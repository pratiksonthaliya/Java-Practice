package R_Multithreading_2;

public class ThreadUsingRunnableInterface implements Runnable{
    @Override
    public void run() {
        System.out.println("Code Executed by Thread: " + Thread.currentThread().getName());
    }
}
