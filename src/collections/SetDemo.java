package collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        System.out.println(Collections.addAll(set, "a", "b", "c", "c", "d"));;
        System.out.println(set);
        System.out.println(set.add("a"));
        System.out.println(set);
        System.out.println(set.remove("a"));
        System.out.println(set.add("a"));
    }
}
