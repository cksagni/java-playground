public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!!");
        System.out.println(10D/3D);
        System.out.println(10/2*2);


        long a = 999999999;
        float b = a + 2; // loss of precision is happening implicitly
        System.out.println(b);
        double c = a + 2;
        System.out.println(c);


        int random = (int) (Math.random() * 100);
        System.out.println(random);

        int roundedNum = (int)Math.round(1.1);
        System.out.println(roundedNum);

        System.out.println((int)Math.ceil(1.1));
        System.out.println(Math.floor(1.1));
    }
}