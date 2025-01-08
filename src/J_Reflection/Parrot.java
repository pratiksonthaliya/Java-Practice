package J_Reflection;

public class Parrot {

    Parrot() {}

    public String breed;
    private boolean canFly;

    public void fly(int intParams, boolean boolParams, String stringParams){
        System.out.println("Fly" + " " + intParams + " " + boolParams + " " + stringParams);
    }
}
