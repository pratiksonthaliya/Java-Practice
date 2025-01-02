package F_Generic_Classes;

public class GenericMethod {
    // Put generic type before return type that we want to accept in a function
    public <K, V> void printValue(Pair<K, V> pair1, Pair<K, V> pair2){
        if(pair2.getKey().equals(pair1.getKey())){
            // do something
            System.out.println("Keys are equal");
        }
    }
}
