package C_NonPrimitive_Variables;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        System.out.println("Non Primitive Variables");
        // String, Interface, Array, Class

        //// String
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");

        // s1 == s2 -> reference comparision
        // s1.equals(s2) -> value comparision

        System.out.println("s1 == s2 : " + (s1 == s2));
        System.out.println("s1.equals(s2) : " + s1.equals(s2));

        System.out.println("s1 == s3 : " + (s1 == s3));
        System.out.println("s1.equals(s3) : " + s1.equals(s3));


        ////Class && Interface
        // Person person = new Person(); -> Error since can't create object from interface

        Person engineer = new Engineer();
        Engineer engineer1 = new Engineer();

        Person teacher = new Teacher();
        Teacher teacher1 = new Teacher();


        //// Array
        int[] arr = new int[5];
        int arr2[] = new int[5];

        int[][] twoDArray = new int[5][5];
        int i=0;
        for(int[] row : twoDArray){
            Arrays.fill(row, i);
            i++;
        }

        for(int[] row : twoDArray){
            for(int val : row){
                System.out.print(val + " ");
            }
            System.out.println();
        }

        // Autoboxing -> primitive to wrapper
        int a = 10;
        Integer aa = a;

        // Unboxing -> wrapper to primitive
        Integer b = 20;
        int bb = b;

        // Constant

        final double PI = 3.14d;
        System.out.println("PI = " + PI);
    }
}