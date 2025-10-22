import java.util.Scanner;

public class ReadInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your First Name: ");
        String firstName = scanner.next(); // reads only one token
        System.out.println("Your First Name: " +firstName);

        scanner.nextLine(); // to consume newline from return key press

        System.out.print("Enter Your Full Name: ");
        String fullName = scanner.nextLine();
        System.out.println("Your Full Name: " + fullName);

        System.out.print("Enter 3 integers: ");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        System.out.println("Entered Numbers: " + first + ", " + second + ", " + third);


    }
}
