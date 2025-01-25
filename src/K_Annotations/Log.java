package K_Annotations;

import java.util.ArrayList;
import java.util.List;

public class Log {
    @SafeVarargs
    public static void printLogValues(List<Integer>... logNumberList) {
        Object[] objectList = logNumberList;

        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        objectList[0] = stringList;
    }
}

