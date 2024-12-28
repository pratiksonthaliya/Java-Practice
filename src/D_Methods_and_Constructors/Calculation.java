package D_Methods_and_Constructors;

public class Calculation {
    String name;
    int empId;

    // Constructor Chaining using this keyword
    Calculation(){
        this(10);
    }
    Calculation(int empId){
        this(empId, "Ram");
    }
    Calculation(int empId, String name){
        this.name = name;
        this.empId = empId;
    }

    public int multiply(int val1, int val2){
        return val1 * val2;
    }

    public int getPriceOfPenBox(){
        int penPrice = 3;
        int count = 20;
        return multiply(penPrice, count);
    }

    //Overloaded
    public int multiply(int a, int b, int c){
        return a*b*c;
    }

    //Overloaded -> Variable Arguments
    public int multiply(int ...a){
        int val = 1;
        for(int i : a){
            val *= i;
        }
        return val;
    }
}