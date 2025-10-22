package collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
//        Map<String, Customer> map = new HashMap<>();
//        map.put("a", new Customer("Chandan"));
//        System.out.println(map);
//        map.put("b", new Customer("Neha"));
//        map.put("c", new Customer("Rahul"));
//        map.put("d", new Customer("Abhi"));
//        map.put("e", new Customer("Arnav"));
//        System.out.println(map);
//        for (var entry: map.entrySet())
//            System.out.println("Key=" + entry.getKey() +", Value=" + entry.getValue());
//
//        for (var key: map.keySet())
//            System.out.println(key);
//
//        for (var val: map.values())
//            System.out.println(val);

        Map<Customer, String> newMap = new HashMap<>();
        var c = new Customer("Vinay", "email1");
        newMap.put(c, "a");
        System.out.println(newMap);
        System.out.println(newMap.get(new Customer("Vinay", "email1")));
    }
}
