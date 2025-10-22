package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class GenerateStreamsDemo {

    public static void main(String[] args) {
        var userList = List.of(
                new User("Chandan", 20),
                new User("Neha", 25),
                new User("Roshan", 10)
        );

        var countUsersMoreThan10Likes =
                userList.stream()
                        .filter(user -> user.getLikes() > 10).count();

        System.out.println(countUsersMoreThan10Likes);


        int[] numbers = {1, 2, 3};
        System.out.println(Arrays.stream(numbers).filter(num -> num % 2 == 0).count());

        var randomNumberGenerator = Stream.generate(() -> (int) (Math.random()*10));

        long evenCount = randomNumberGenerator.limit(10).filter(num -> num % 2 == 0).count();
        System.out.println(evenCount);

        var incrementIterator = Stream.iterate(1, n -> n+1);
        evenCount = incrementIterator.limit(10).filter(num -> num % 2 == 0).count();
        System.out.println(evenCount);

    }
}
