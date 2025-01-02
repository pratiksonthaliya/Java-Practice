package F_Generic_Classes;

//public class A extends Main implements Interface1, Interface2{
//
//}

// Same as above -> Multiple Bound
public class A<T extends Random & Interface1 & Interface2> {

}

interface Interface1 {

}

interface Interface2 {

}