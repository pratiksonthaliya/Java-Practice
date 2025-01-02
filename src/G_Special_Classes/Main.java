package G_Special_Classes;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        System.out.println("Special Classes: POJO, ENUM, Final, Singleton, Immutable, Wrapper Class");

        /* Common Enum functions
            * values() -> returns all values
            * ordinal() -> ordinal of value stored
            * valueOf() -> value
            * name()
        */

        // Enum -> .values(), .ordinal()
        for(EnumSample sample : EnumSample.values()){
            System.out.println(sample.ordinal() + " " + sample);
        }

        // ENUM -> .valueOf(), .name()
        EnumSample enumVariable = EnumSample.valueOf("FRIDAY");
        System.out.println(enumVariable.name());

        // Custom ENUM:
        EnumWithCustomValues enumWithCustomValues = EnumWithCustomValues.getEnumValue(104);
        System.out.println(enumWithCustomValues);

        EnumWithCustomValues enumWithCustomValues1 = EnumWithCustomValues.MONDAY;
        System.out.println(enumWithCustomValues1.name());
        System.out.println(enumWithCustomValues1.getComment());
        System.out.println(EnumWithCustomValues.SATURDAY.getComment());

        //Custom Enum with override method
        EnumWithOverrideByConstant enumWithOverrideByConstant = EnumWithOverrideByConstant.MONDAY;
        System.out.println(enumWithOverrideByConstant);
        enumWithOverrideByConstant.dummyMethod();

        EnumWithOverrideByConstant enumWithOverrideByConstant1 = EnumWithOverrideByConstant.SATURDAY;
        System.out.println(enumWithOverrideByConstant1);
        enumWithOverrideByConstant1.dummyMethod();

        //Custom Enum with Abstract method
        EnumWithAbstractClass enumWithAbstractClass = EnumWithAbstractClass.MONDAY;
        enumWithAbstractClass.dummyMethod();

        EnumWithAbstractClass enumWithAbstractClass1 = EnumWithAbstractClass.WEDNESDAY;
        enumWithAbstractClass1.dummyMethod();

        //Custom Enum Implements Interface
        EnumImplementsInterface enumImplementsInterface = EnumImplementsInterface.FRIDAY;
        System.out.println(enumImplementsInterface.toLowerCase());

        List<Object> petNames = new ArrayList<>();
        petNames.add("aj");
        petNames.add("pj");

        MyImmutableClass myImmutableClass = new MyImmutableClass("name", petNames);
        myImmutableClass.getPetNameList().add("Hello");
        System.out.println(petNames);

    }
}
