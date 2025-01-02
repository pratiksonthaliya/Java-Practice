package G_Special_Classes;

import java.util.ArrayList;
import java.util.List;

public final class MyImmutableClass {
    private final String name;
    private final List<Object> petNameList;

    MyImmutableClass(String name, List<Object> petNameList){
        this.name = name;
        this.petNameList = petNameList;
    }

    public String getName(){
        return name;
    }

    public List<Object> getPetNameList(){
            //  return petNameList; -> wrong: sends original list
        return new ArrayList<>(petNameList); // To avoid changing of values in original list
        // sends copy array
    }
}
