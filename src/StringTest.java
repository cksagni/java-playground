public class StringTest {
    public static void main(String[] args) {
        String message = "Hello World!!";
        String messageCopy = message;
        System.out.println(message.replace('!', '*'));
        System.out.println(message.replace("!!", "*"));
        System.out.println(message);
        System.out.println(messageCopy);
        message = messageCopy.replace("Hello", "Hey");
        System.out.println(message);
        System.out.println(messageCopy);

        String test = new String("hello");
        String test2 = test;
        test = "Hey!!";
        System.out.println(test2);
        System.out.println(test);
    }
}
