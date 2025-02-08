package E_Basic_Classes;

public class Main {
    public static void main(String[] args){
        System.out.println("Classes");

        // O_Collections_2.Main obj = new O_Collections_2.Main();

        // Object -> Parent of All Class --> that's why we can keep reference of all/any objects in Object class
        Object obj1 = new Person(1);
        Object obj2 = new Audi(10);

        System.out.println(obj1.getClass());
        System.out.println(obj2.getClass());

        //Static Nested Class
        OuterClass.NestedClass nestedClass = new OuterClass.NestedClass();
        nestedClass.print();

        // Static Nested Class within Outer Class
        OuterClass outerClassObj = new OuterClass();
        outerClassObj.display();

        // Non-static Inner Class
        OuterClass.InnerClass innerClassObj = outerClassObj.new InnerClass();
        innerClassObj.print();

        //Local Inner Class
        outerClassObj.func();

        //Inheritance in Inner Class
        OuterClass.InnerClass2 inner2 = outerClassObj.new InnerClass2();
        inner2.display();

        //Inheritance in Static Inner Class
        OuterClass.InnerClass4 inner4 = outerClassObj.new InnerClass4();
        inner4.display();

        // Anonymous Class -> Inner Class without any name.
        Car audiObj = new Car(20){
            @Override
            public void pressBrake() {
                // implementation
            }
            @Override
            public void pressClutch() {
                // implementation
            }
        };
        audiObj.pressBrake();


    }
}
