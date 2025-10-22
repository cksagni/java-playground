package functionalprogramming;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class NaryOpInterfaceDemo {

    public static void main(String[] args) {

        BinaryOperator<Integer> add = (a, b) -> a + b;
        UnaryOperator<Integer> square = a -> a * a;

        System.out.println(add.andThen(square).apply(2,3));
    }
}
