package streams;

import java.util.List;

public class ReduceDemo {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User("Chandan", 10),
                new User("Neha", 15),
                new User("Roshan", 20)
        );

        var firstUser = users.stream().map(User::getName).findFirst();
        System.out.println(firstUser.get());

        var isAnyUserWith20Likes = users.stream().anyMatch(u -> u.getLikes() > 15);
        System.out.println(isAnyUserWith20Likes);

        var totalLikes = users.stream().map(User::getLikes).reduce(0, Integer::sum);
        System.out.println(totalLikes);
    }
}
