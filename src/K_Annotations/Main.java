package K_Annotations;

import java.util.Arrays;

@SuppressWarnings("unused")
public class Main {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        System.out.println("Annotations: ");

        Mobile mobile = new Mobile();
        mobile.dummyMethod();


        ChildClass childClass = new ChildClass();
        System.out.println(Arrays.toString(childClass.getClass().getAnnotations()));
    }

    @SuppressWarnings("all")
    public void doNothing(){}
}
