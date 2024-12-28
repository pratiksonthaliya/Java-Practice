package B_Primitive_Variables;

public class Main {
    public static void main(String[] args) {
        System.out.println("Primitive Variables");

        char ch = 'A'; // (16 bits)
        byte b = 5; // -128 to 127 (8 bits)
        short s = 5; // (16 bits)
        int a = 5; // (32 bits) -2^31 to 2^31 - 1
        long l = 23456; // (64 bits)

        boolean flag = false;

        // Widening
        long var = a;

        // Narrowing
        int var2 = (int) var; // Might overflow for some cases

        // Promotion during expression
        byte x = 1;
        byte y = 127;
        // byte sum = x + y; //wrong
        int sum = x + y;
        byte sum2 = (byte) (x+y);
        System.out.println(sum + " " + sum2);

        int aa = 34;
        double doubleVar = 20.5d;
        // int sum3 = aa + doubleVar; //wrong

        double sum3 = aa + doubleVar;
        int sum4 = aa + (int) doubleVar;
        System.out.println(sum3 + " " + sum4);



    }
}