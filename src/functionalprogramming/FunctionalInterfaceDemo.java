package functionalprogramming;

import java.util.List;

public class FunctionalInterfaceDemo {

    private static String prefix = "!!";

    public FunctionalInterfaceDemo() {
    }

    public FunctionalInterfaceDemo(String message) {
        System.out.println("Using constructor reference:" + message);
    }



    private static void consolePrint(Printer printer){
        printer.print("Hello World!!!");
    }
    private void show(String message){
        System.out.println("instance method reference:" + message);
    }
    public static void showStatic(String message){
        System.out.println("static method ref:" + message);
    }
    public static void main(String[] args) {
        // Anonymous class
        consolePrint(new Printer() {
            @Override
            public void print(String message) {
                System.out.println("message:-" + message);
            }
        });

        // same code using lambda (can be used only with Functional Interface)
        consolePrint(message -> System.out.println("print with lambda:-" + message));

        // using method reference with inbuild method
        consolePrint(System.out::println);

        //using method reference with instance method
        var test = new FunctionalInterfaceDemo();
        consolePrint(test::show);

        // static method reference
        consolePrint(FunctionalInterfaceDemo::showStatic);

        // constructor reference
        consolePrint(FunctionalInterfaceDemo::new);

    }
}
