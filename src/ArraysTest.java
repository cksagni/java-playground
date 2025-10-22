import java.util.Arrays;

public class ArraysTest {

    public static void main(String[] args) {
        int[] numbers = {5,4,1,3,2};
        Arrays.sort(numbers);
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));


        // 2-d array
        int[][] twoDNumbers = {{3, 2, 1}, {4, 6, 5}};
        System.out.println(twoDNumbers);
        System.out.println(Arrays.toString(twoDNumbers));
        System.out.println(Arrays.deepToString(twoDNumbers));
    }
}
