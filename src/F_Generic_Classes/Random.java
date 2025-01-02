package F_Generic_Classes;

// Upper bound: Number or its subclass only
// Integer, AtomicLong, BigDecimal, BigInteger, Byte, Double, Float, etc
public class Random<T extends Number> implements Interface1, Interface2 {
    T value;

    public T getRandomValue(){
        return value;
    }

    public void setRandomValue(T value){
        this.value = value;
    }
}
