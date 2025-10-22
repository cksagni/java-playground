package streams;

import java.util.List;
import java.util.stream.Collectors;

public class GroupingDemo {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User("Chandan", 10, UserType.ADMIN),
                new User("Neha", 15, UserType.CONSUMER),
                new User("Roshan", 20, UserType.CONSUMER)
        );

        var usersByType = users.stream().collect(
                Collectors.groupingBy(User::getGenre, Collectors.toSet())
        );
        System.out.println(usersByType);

        var userCountByType = users.stream().collect(
                Collectors.groupingBy(User::getGenre, Collectors.counting())
        );
        System.out.println(userCountByType);

        var userNamesByType = users.stream().collect(
                Collectors.groupingBy(User::getGenre, Collectors.mapping(User::getName, Collectors.joining(", ")))
        );
        for(var entry: userNamesByType.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());

    }
}
