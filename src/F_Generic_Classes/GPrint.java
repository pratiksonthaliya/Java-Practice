package F_Generic_Classes;

public class GPrint<T> {
    T value;

    public T getValue(){
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }
}

// Non-generic subclass
class ColorPrint extends GPrint<String> {}

// Generic subclass
class GColorPrint<T> extends GPrint<T> {}

