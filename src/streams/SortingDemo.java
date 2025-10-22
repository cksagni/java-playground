package streams;

import java.util.Comparator;
import java.util.List;

public class SortingDemo {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User("Chandan", 10),
                new User("Neha", 15),
                new User("Roshan", 20)
        );


        // this version uses compareTo from User's implementation of comparable interface
        users.stream()
                .sorted()
                .map(User::getName)
                .forEach(System.out::println);

        // custom comparator
        users.stream()
                .sorted(Comparator.comparing(User::getName).reversed())
                .map(User::getName)
                .forEach(System.out::println);
    }
}
