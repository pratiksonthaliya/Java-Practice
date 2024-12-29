package E_Basic_Classes;

public class OuterClass {
    int instanceVariable = 10;
    static int classVariable = 20;

    // Static Inner Class
    static class NestedClass {
        public void print() {
            //System.out.println(classVariable + instanceVariable); // Error
            System.out.println("Nested Class: " + classVariable);
        }
    }

    public void display() {
        //Static Nested Class within outer Class
        NestedClass nestedObj = new NestedClass();
        nestedObj.print();
    }

    // Non-static Inner Class
    class InnerClass {
        public void print() {
            System.out.println("Inner Class: " + instanceVariable + " " + classVariable);
        }
    }


    public void func() {
        int methodLocalVariable = 3;

        // Local Inner Class
        class LocalInnerClass{
            int localInnerVariable = 5;

            public void print() {
                System.out.println("Local Inner Class: " + localInnerVariable);
            }
        }

        LocalInnerClass localObj = new LocalInnerClass();
        localObj.print();
    }

    // Inheritance in Nested Class
    class InnerClass1 {
        int var1 = 3;
    }

    class InnerClass2 extends InnerClass1 {
        int var2 = 6;

        void display(){
            System.out.println(var1 + var2);
        }
    }

    static class StaticInnerClass {
        int var3 = 7;
        void display(){
            System.out.println(var3 + classVariable);
        }
    }

    class InnerClass4 extends StaticInnerClass {
        void display1(){
            display();
        }
    }
}

class SomeOtherClass extends OuterClass.InnerClass {
    SomeOtherClass(){
        new OuterClass().super(); // To invoke the constructor of parent class before the constructor of child class is being called
    }

    public void display1(){
        print();
    }
}
