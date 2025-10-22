public class SwitchStatement {
    public static void switchCheck(int condition){
        switch (condition){
            case 1:
                System.out.println("It's 1");
                break;
            case 2:
                System.out.println("It's 2");
                break;
            default:
                System.out.println("It's nothing");
        }
    }
    public static void main(String[] args) {
        switchCheck(1);
    }
}
