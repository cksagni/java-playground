package generics;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        var list = new ArrayList<User>();
        list.add(new User(10));
        list.add(new User(20));
//        Utils.printUsers(list);

        print(list);
    }

    public static <T extends Object> void print(List<T> list){
        System.out.println(list.getFirst());
    }
}
