package streams;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectDemo {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User("Chandan", 10),
                new User("Neha", 15),
                new User("Roshan", 20)
        );

        var userNameList = users.stream().map(User::getName).toList();

        System.out.println(userNameList);

        var likesSummary = users.stream().collect(Collectors.summarizingInt(User::getLikes));
        System.out.println(likesSummary);

        var userList = users.stream().filter(u -> u.getLikes() >= 10).collect(Collectors.toList());
        System.out.println(userList);

        var userMap = users.stream().collect(Collectors.toMap(User::getName, Function.identity()));

        System.out.println(userMap);

    }
}
