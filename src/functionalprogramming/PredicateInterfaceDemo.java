package functionalprogramming;

import java.util.function.Predicate;

public class PredicateInterfaceDemo {

    public static void main(String[] args) {
        Predicate<String> hasLeftBrace = str -> str.startsWith("{");
        Predicate<String> hasRightBrace = str -> str.endsWith("}");

        System.out.println(hasLeftBrace.and(hasRightBrace).test("{}"));
        System.out.println(hasLeftBrace.and(hasRightBrace).test("{a"));
        System.out.println(hasLeftBrace.or(hasRightBrace).test("b}"));
        System.out.println(hasLeftBrace.or(hasRightBrace).test("abc"));

        System.out.println(hasLeftBrace.or(hasRightBrace).negate().test("{abc"));

    }
}
