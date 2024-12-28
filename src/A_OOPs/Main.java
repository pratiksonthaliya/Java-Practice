package A_OOPs;

public class Main {
    public static void main(String[] args) {
        System.out.println("Object Oriented Programming");

        System.out.println("Hello world!");

        Student student = new Student(21, "Pratik", "Bangalore");
        System.out.println("Name: " + student.getName());

        Dog dog = new Dog();
        dog.setColor("Black");
        System.out.println("Color: " + dog.getColor());

        Bike pulsar = new Bike();
        System.out.println("Engine: " + pulsar.getEngine());
        System.out.println("Type: " + pulsar.getType());

        Vehicle vehicle = new Vehicle();
        // vehicle.getType(); //Error

        System.out.println(Calculate.sum(1,2));
        System.out.println(Calculate.sum(1,2,3));
        System.out.println(Calculate.sum(1,2,3,4));

        B b = new B();
        System.out.println(b.getEngine());
    }
}