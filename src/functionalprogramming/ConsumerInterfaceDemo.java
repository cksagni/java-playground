package functionalprogramming;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceDemo {

    public static void main(String[] args) {

        List<String> list = List.of("a", "b", "c");
        list.forEach(System.out::print);

        System.out.println();

        Consumer<String> printLowerCase = message -> System.out.print("-" + message.toLowerCase());
        Consumer<String> printUpperCase = message -> System.out.print(message.toUpperCase());

        list.forEach(printLowerCase.andThen(printUpperCase).andThen(System.out::println));


    }
}
