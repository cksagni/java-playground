package functionalprogramming;

import java.util.function.Function;

public class FunctionInterfaceDemo {

    public static void main(String[] args) {
        Function<String, String> replaceColon = str -> str.replace(":", "=");
        Function<String, String> addBraces = str -> "{" + str + "}";
        Function<String, String> addParanthesis = str -> "(" + str + ")";

        var thenResult = replaceColon.andThen(addBraces).andThen(addParanthesis).apply("key:value");
        var composeResult = addParanthesis.compose(addBraces).compose(replaceColon).apply("key:value");
        System.out.println(thenResult);
        System.out.println(composeResult);
    }
}
