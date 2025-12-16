import java.util.Arrays;

public class ArraysDemo {
    public static void main() {
        String[] users = { "bhargav", "gopal" };
        // we can modify the existing values
        System.out.println(users.length);
        System.out.println(users[0]);
        users[1] = "tony";
        System.out.println("modify existing values " + users[1]);
        users[1] = "";
        users[0] = "";
        System.out.println(Arrays.toString(users));
        System.out.println(users.length);

        // working with integer in arrays
    }
}
