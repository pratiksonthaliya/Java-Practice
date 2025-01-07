package H_Interfaces;

public interface LivingThings {
    default boolean canBreathe(){
        return true;
    }
}

// Method 1:
interface Birdo extends LivingThings {}
class Swan implements Birdo {}

// Method 2:
interface Birdy extends LivingThings {
    boolean canBreathe();
}

class Vulture implements Birdy {
    @Override
    public boolean canBreathe() {
        return true;
    }
}

// Method 3:
interface Birdie extends LivingThings {
    default boolean canBreathe(){
        boolean canBreatheOrNot = LivingThings.super.canBreathe();
        return  canBreatheOrNot;
    }
}

class Peacock implements Birdie {}