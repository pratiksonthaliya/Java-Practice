package F_Generic_Classes;

import java.util.List;

public class Print {
    Object value;

    public Object getValue(){
        return value;
    }

    public void setValue(Object value){
        this.value = value;
    }

//    public void setPrintValues(List<? extends Vehicle> vehicleList){}

    public void setPrintValues(List<? super Vehicle> vehicleList){}

    // Wildcards -> both can be different
    public void computeList(List<? extends Number> src, List<? extends Number> dest){}

    // Generics -> more restriction --> both list should be of same type
    public <T extends Number> void computeList1(List<T>src, List<T> dest){}
}
