import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayAndLinkedList {
    public static void main() {
        ArrayList<String> usersArrayList = new ArrayList<String>();

        usersArrayList.add("Maguire");
        usersArrayList.add("Dr Octopus");
        usersArrayList.add("Home Coming");
        usersArrayList.set(0, "tobey");
        usersArrayList.set(2, "Gwen");
        System.out.println(usersArrayList);
        System.out.println(usersArrayList.remove(0));
        System.out.println(usersArrayList);

        // we can use the same methods for linked list too. both are recommended while
        // working with collectiions

        LinkedList<String> usersLinkedArray = new LinkedList<String>();

        usersLinkedArray.add("one");
        usersLinkedArray.add("two");
        usersLinkedArray.add("three");
        usersLinkedArray.add("four");
        usersLinkedArray.add("five");
        usersLinkedArray.set(0, "1");
        usersLinkedArray.set(1, "2");
        usersLinkedArray.set(2, "3");
        System.out.println(usersLinkedArray);
        System.out.println(usersLinkedArray.remove(4));
        System.out.println(usersLinkedArray); // removed array

    }
}