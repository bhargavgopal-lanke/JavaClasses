import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapAndHashSet {
    public static void main(String[] args) {
        // Arrays example
        String[] emailsArray = { "contact@gmail.com", "contact@gmail.com" };
        System.out.println("emailsArray " + emailsArray.length);
        System.out.println("emailsArray " + emailsArray[0]);
        System.out.println("emailsArray " + emailsArray[1]);
        // we cant add new values inside an array
        // below code throws an error
        // emailsArray[2] = "Something";
        System.out.println("added new value " + Arrays.toString(emailsArray));

        // Array List examples
        ArrayList<String> emailArrayList = new ArrayList<String>();
        System.out.println("emailArrayList size " + emailArrayList.size());
        emailArrayList.add("test@gmail.com");
        emailArrayList.add("test@gmail.com");
        System.out.println(emailArrayList.get(0));
        System.out.println(emailArrayList.get(1));
        emailArrayList.set(1, "newemail@gmail.com");
        System.out.println(emailArrayList);

        // hashmap allows to store all the properties
        HashMap<String, String> emailList = new HashMap<String, String>();
        emailList.put("mobile", "iphone12");
        emailList.put("model", "2012");
        emailList.put("color", "red");
        emailList.put("storage", "512gb");
        System.out.println(emailList.get("mobile"));
        emailList.forEach((key, value) -> {
            System.out.println("Key: " + key + ", Value: " + value);
        });

        // Haset wont allow duplicates
        HashSet<String> setEmailUSers = new HashSet<String>();
        setEmailUSers.add("test@gmail.com");
        setEmailUSers.add("test@gmail.com");
        System.out.println("HashSet duplicates " + setEmailUSers.size());
        setEmailUSers.add("bhargav@gmail.com");
        setEmailUSers.add("apple");
        setEmailUSers.add("banana");
        setEmailUSers.add("cherry");
        System.out.println(setEmailUSers.size());
        System.out.println(setEmailUSers);
        setEmailUSers.forEach((email) -> {
            System.out.println("HashSet ====> " + email);
        });
    }
}