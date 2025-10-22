package streams;

import java.util.List;
import java.util.stream.Collectors;

public class PartitioningDemo {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User("Chandan", 10, UserType.ADMIN),
                new User("Neha", 15, UserType.CONSUMER),
                new User("Roshan", 20, UserType.CONSUMER)
        );

        var usersWithMoreThan20Likes = users.stream().collect(
                Collectors.partitioningBy(u -> u.getLikes() > 15)
        );
        System.out.println(usersWithMoreThan20Likes);

        var userNamesWithMoreThan20Likes = users.stream().collect(
                Collectors.partitioningBy(u -> u.getLikes() > 15,
                        Collectors.mapping(User::getName,
                                Collectors.joining(", ")))
        );
        System.out.println(userNamesWithMoreThan20Likes);
        for(var entry: userNamesWithMoreThan20Likes.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());
    }
}
