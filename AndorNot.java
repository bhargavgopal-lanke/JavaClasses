import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

class AndorNot {
    public static void main(String[] args) {
        int adminId = 20;
        int userId = 15;
        int editorId = 21;
        int viewId = 22;

        // if(adminId == userId) {
        // System.out.println("Welcome Admin " + userId);
        // };

        // if(editorId == userId) {
        // System.out.println("Welcome Editor");
        // };

        // if(editorId == userId || adminId == userId) {
        // System.out.println("You can edit the files");
        // } else if(viewId == userId) {
        // System.out.println("You can view the files");
        // } else {
        // System.out.println("You dont have access");
        // }

        switch (userId) {
            case 20:
                System.out.println("Welcome Admin" + " " + userId);
                break;
            case 21:
                System.out.println("You can edit the files" + " " + userId);
                break;
            case 22:
                System.out.println("You can view the files" + " " + userId);
                break;
            default:
                System.out.println("You dont have access.");

        }

    }
}

class SwitchCase {
    public static void main(String[] args) {
        String videoCategory = "music";

        switch (videoCategory) {
            case "sports":
                System.out.println("Display sports related vedios");
                break;
            case "drama":
                System.out.println("Display drama related vedios");
                break;
            case "adventure":
                System.out.println("Display adventure related vedios");
                break;
            case "music":
                System.out.println("Display music related vedios");
                break;
            default:
                System.out.println("No vedios found on this category");
        }
    }
}

class ArrayConcepts {
    public static void main(String[] args) {
        String product1title = "This is one";
        String product2title = "This is two";
        String product3title = "This is three";

        String[] titles = { "This is one", "This is two", "This is three" };

        // System.out.println(titles[0]);
        // System.out.println(titles[1]);
        // System.out.println(titles[2]);

        titles[0] = "This is phone 17 blue";
        titles[1] = "This is phone 16 white";
        titles[2] = "This is phone 15 red";

        System.out.println(titles[0]);
        System.out.println(titles[1]);
        System.out.println(titles[2]);

        int[] prices = { 85000, 90000, 100000 };
        prices[0] = 20000;
        prices[1] = 5000;
        prices[2] = 10000;

        System.out.println(prices[0]);
        System.out.println(prices[1]);
        System.out.println(prices[2]);
    }

}

class ArrayLoops {
    public static void main(String[] args) {
        String[] titles = { "Apple iPhone 17 (Black, 256 GB)", "Apple iPhone 17 (Sage, 512 GB)",
                "Apple iPhone 17 (Lavender, 256 GB)", "Apple iPhone 17 (Black, 512 GB)"
        };
        // for (int i = 0; i < titles.length; i++) {
        // System.out.println(titles[i]);
        // }

        // prices loop
        int[] prices = { 400000, 20000, 10000 };

        // for (int i = 0; i < prices.length; i++) {
        // System.out.println(prices[i]);
        // }

        // prices reverse loop

        for (int i = prices.length - 1; i >= 0; i--) {
            System.out.println(prices[i]);
        }
    };

}

class LoopsTwo {
    public static void main(String[] args) {
        int[] prices = { 40000, 200000, 333000, 25000, 10000 };
        // for (int i = 0; i < prices.length; i++) {
        // System.out.println(prices[i]);
        // if (prices[i] == 25000) {
        // // if the value is 25000 skip the next iterations
        // break;
        // }
        // }

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == 25000) {
                continue;
            }
            System.out.println(prices[i]);
        }
    }
}

class WhileLoops {
    public static void main(String[] args) {
        int[] prices = { 30000, 20000, 10000, 60000, 70000 };

        int i = 0;
        boolean morethanfifty = false;

        while (morethanfifty == false) {
            if (prices[i] > 50000) {
                morethanfifty = true;
                System.out.println("found more than 50000 at index" + " " + i);
            }
            i++;
        }

    }
}

class WhileLoopsTwo {
    public static void main(String[] args) {
        String[] mails = { "test@mail.com", "test1@gmail.com", "test2@gmail.com" };
        boolean mailSent = false;
        int i = 0;
        while (mailSent == false) {
            if (mails[i] == "test@gmail.com") {
                System.out.println("Mail is sent to" + " " + i);
                mailSent = true;
            }
            i++;
        }
    }
}

class OopsOnePractice {

    String useremail = "bhargav@gmail.com";

    public static void main(String[] args) {
        OopsOnePractice userCredentialsObj = new OopsOnePractice();
        userCredentialsObj.useremail = "test@gmail.com";
        System.out.println(userCredentialsObj.useremail);
        userCredentialsObj.Login();

        // This is differnt object and story different memory
        OopsOnePractice userobjTwo = new OopsOnePractice();
        System.out.println(userobjTwo.useremail);
    }

    public void Login() {
        System.out.println("Invalid login credentials");
    }

    public void Signup() {
        System.out.println("Account created. please check your email");
    }

    public void resetpassword() {
        System.out.println("Please reset your email and password");
    }
}

class OopsContructorExPrac {
    String userEmail = "";
    String userPwd = "";

    public OopsContructorExPrac(String email, String pwd) {
        userEmail = email;
        userPwd = pwd;
    }

    public static void main(String[] args) {
        OopsContructorExPrac ob1user = new OopsContructorExPrac("test1@gmail.com", "hgdashgdghasdga");
        System.out.println(ob1user.userEmail);
        OopsContructorExPrac obj2user = new OopsContructorExPrac("test2@gmail.com", "sdghfjdfsjdf");
        System.out.println(obj2user.userPwd);
    }
}

// inheritance very important and in real time we use it a lot

// This is parent class
class inheritOne {
    String userEmail = "bhargav@gmail.com";
    String userPwd = "123456";

    public void Login() {
        System.out.println("Logged in");
    }

    public void Signup() {
        System.out.println("Account Created");
    }
}

// we have to use the word extends to inherit the properties or methods from
// another class

// This is child class
class inheritTwo extends inheritOne {
    public static void main(String[] args) {
        inheritTwo inheritOneObj = new inheritTwo();
        System.out.println(inheritOneObj.userEmail);
        System.out.println(inheritOneObj.userPwd);
    }
}

// ArrayList

class ArrayOnePractice {
    public static void main(String[] args) {
        ArrayList<String> productsArray = new ArrayList<>();
        System.out.println(productsArray.size());
        productsArray.add("bhargav");
        productsArray.add("bhargav");
        productsArray.add("bhargav Gopal");
        productsArray.add("bhargav 2");
        productsArray.add("bhargav 3");
        System.out.println(productsArray.get(0));
        for (int i = 0; i < productsArray.size(); i++) {
            System.out.println(productsArray.get(i));
        }
    }
}

// Linked list practice

class LinkedListPracticeOne {
    public static void main(String[] args) {
        LinkedList<String> RetailProducts = new LinkedList<String>();
        RetailProducts.add("Iphon 17");
        RetailProducts.add("Iphone 16");
        RetailProducts.add("Iphone 15");
        System.out.println(RetailProducts.size());
        RetailProducts.set(1, "Xbox gaming");
        for (int i = 0; i < RetailProducts.size(); i++) {
            System.out.println(RetailProducts.get(i));
        }
    }
}

// Hash Map prctice
// key is unique
// stores key value pairs
// remove method removes one value
// clear method emptys the hashmap

class HashMapPractice {
    public static void main(String[] args) {
        HashMap<String, String> keyValueproducts = new HashMap<String, String>();
        keyValueproducts.put("title", "The art of living");
        keyValueproducts.put("price", "200");
        keyValueproducts.put("Author", "Bhargav Gopal");
        keyValueproducts.put("Sellers", "Amazon");
        System.out.println(keyValueproducts.get("title"));
        System.out.println(keyValueproducts.size());
        keyValueproducts.remove("Author");
        System.out.println(keyValueproducts.size());
        keyValueproducts.clear();
        System.out.println(keyValueproducts.size());

    }
}

// Hashset Practice
// Its stores data but wont accept duplicates
class hashsetPractice {
    public static void main(String[] args) {
        HashSet<String> noDuplicatesArray = new HashSet<String>();
        noDuplicatesArray.add("This is bhargav");
        noDuplicatesArray.add("This is bhargav");
        System.out.println(noDuplicatesArray.size());
    }
}

// Exception Handling in java
// basic example

class ExceptionJavaErrors {
    public static void main(String[] args) {
        try {
            String[] emailsList = { "test1@gmail.com", "test2@gmail.com" };
            System.out.println(emailsList[2]);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

// create our own custom class for exception handling
