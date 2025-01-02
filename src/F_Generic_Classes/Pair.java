package F_Generic_Classes;

public class Pair<K,V> {
    private K key;
    public V value;

    public void put(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey(){
        return key;
    }

    public V getValue(){
        return value;
    }
}
