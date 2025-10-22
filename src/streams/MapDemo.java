package streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class MapDemo {

    public static void main(String[] args) {
        List<User> users = List.of(
                new User("Chandan", 10),
                new User("Neha", 15),
                new User("Roshan", 20)
        );
        List<User> copyUsers = new ArrayList<>(users);

        users.stream()
                .map(User::getName)
                .forEach(System.out::println);

        var stream = Stream.of(users, copyUsers);

        stream.flatMap(Collection::stream).map(user -> user.getLikes()).forEach(list -> System.out.println(list));


    }
}
