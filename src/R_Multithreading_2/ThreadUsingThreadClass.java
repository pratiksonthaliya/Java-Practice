package R_Multithreading_2;

public class ThreadUsingThreadClass extends Thread{
    @Override
    public void run(){
        System.out.println("Code executed by thread: " + Thread.currentThread().getName());
    }
}
