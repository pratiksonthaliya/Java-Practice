package H_Interfaces;

public class Main {
    public static void main(String[] args) {
        System.out.println("Interfaces");

        Bird eagle = new Eagle();
        Bird hen = new Hen();

        eagle.fly();
        hen.fly();

        Bird.NonFlyingBird penguin = new Penguin();
        System.out.println("Penguin can run? " + penguin.canRun());

        eagle.getMinimunFlyingHeight();
    }
}
