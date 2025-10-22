package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingDemo {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
//        Collections.addAll(customers, new Customer("chandan"), new Customer("rahul"), new Customer("abhay"));
        Collections.sort(customers);
        System.out.println(customers);
    }
}
