package D_Methods_and_Constructors;

public class Main {
    public static void main(String[] args) {
        //Methods
        System.out.println("Methods");

        Calculation calculation = new Calculation();
        int price = calculation.getPriceOfPenBox();
        System.out.println(price);

        int val = calculation.multiply(2,3,4,5,6,5);
        System.out.println(val);

        //Overloaded -> same name with either different type or number of arguments
        //Overridden -> same method in class and subclass
        //Static -> class method -> can be used without creating objects
        //Final -> can't be overridden by child class
        //Abstract -> only declaration is done, implementation in child class


        //Constructors
        System.out.println("Constructors");

        ChildCalculation childCalculation = new ChildCalculation();

        //By using super we are getting parent class data fields/variables in child class
        int empId = childCalculation.empId;
        String name = childCalculation.name;
        System.out.println(name + " " + empId);

        //Private Constructor -> Singleton Design Pattern
        // Using static keyword to call function w/o creating object
        Singleton singleton = Singleton.getInstance();

    }
}
