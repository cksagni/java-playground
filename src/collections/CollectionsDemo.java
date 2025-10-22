package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        Collections.addAll(stringList, "a", "b", "c", "a");
        System.out.println(stringList.lastIndexOf("a"));
    }
}
