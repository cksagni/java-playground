package generics;

public class Utils {

    public static <T extends User> void printUsers(GenericList<T> users){
        for (int i=0; i < 2; i++)
            System.out.println(users.get(i));
    }
}
