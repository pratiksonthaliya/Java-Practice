package J_Reflection;

import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        System.out.println("Reflections:");

//        class Bird{}
//
//        // Method 1:
//        Class birdClass1 = Class.forName("Bird");
//
//        // Method 2:
//        Class birdClass2 = Bird.class;
//
//        // Method 3:
//        Bird bird = new Bird();
//        Class birdClass3 = bird.getClass();


        Class eagleClass = Eagle.class;
        System.out.println(eagleClass.getName());
        System.out.println(eagleClass.getDeclaredFields()[0]);
        System.out.println(Modifier.toString(eagleClass.getModifiers()));

        Method[] methods = eagleClass.getDeclaredMethods();
        for(Method method : methods){
            System.out.println("Method Name: " + method.getName());
            System.out.println("Method Return Type: " + method.getReturnType());
            System.out.println("Method Parameter Count: " + method.getParameters().length);
        }


        // Invoking using reflection
        Class parrotClass = Parrot.class;
        Object parrotObject = parrotClass.newInstance();

        Method flyMethod = parrotClass.getMethod("fly", int.class, boolean.class, String.class);
        flyMethod.invoke(parrotObject,67, true, "rtgh");

    // Setting value of public field
        Class eagleClass1 = Eagle.class;
        Eagle eagle = new Eagle();

        Field field = eagleClass1.getField("breed");
        field.set(eagle, "Wild");
        System.out.println(eagle.breed);

    // --> Setting value of private field --> wrong method
        // Field field1 = eagleClass1.getDeclaredField("canFly");
        // field.set(eagle, true);

        Field field1 = eagleClass1.getDeclaredField("canFly");
        field1.setAccessible(true);
        field1.set(eagle, true);
        if(field1.getBoolean(eagle)){
            System.out.println("value is set to true");
        }

        // Can create object of class with private constructor using reflections -> not a good practice
        Class duckClass = Duck.class;

        Constructor[] duckConstructors = duckClass.getDeclaredConstructors();
        for(Constructor duckConstructor : duckConstructors){
            System.out.println(duckConstructor.getName());
            System.out.println(Modifier.toString(duckConstructor.getModifiers()));

            duckConstructor.setAccessible(true);
            Duck duck = (Duck) duckConstructor.newInstance();
            duck.fly();
        }



    }
}
