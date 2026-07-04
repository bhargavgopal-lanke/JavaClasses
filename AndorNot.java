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

        // pricees reverse loop

        for (int i = prices.length - 1; i >= 0; i--) {
            System.out.println(prices[i]);
        }
    };

}

class LoopsTwo {
    public static void main(String[] args) {
        int[] prices = { 40000, 200000, 333000, 25000, 10000 };
        // for (int i = 0; i < prices.length; i++) {
        //   System.out.println(prices[i]);
        //     if (prices[i] == 25000) {
        //         // if the value is 25000 skip the next iterations
        //         break;
        //     }
        // }

        for(int i = 0; i < prices.length; i++) {
            if(prices[i] == 25000) {
                continue;
            }
            System.out.println(prices[i]);
        }
    }
}
