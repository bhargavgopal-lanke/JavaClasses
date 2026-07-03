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

        System.out.println(titles[0]);
        System.out.println(titles[1]);
        System.out.println(titles[2]);
    }
}
