package R_Multithreading_2;

public class MonitorLockExample {
    public synchronized void task1(){
        // do something
        try {
            System.out.println("Inside Task1");
            Thread.sleep(5000);
        } catch (Exception ex) {
            //
        }
    }

    public void task2(){
        System.out.println("Inside Task2, Before Synchronized");
        synchronized (this){
            System.out.println("Inside Task2, Inside Synchronized");
        }
    }

    public void task3(){
        System.out.println("Task3");
    }
}
