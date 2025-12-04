public class Comparison {
    public static void main(String[] args) {
        int adminId = 10;
        int userId = 5;
        String dbEmail = "contact@gmail.com";
        String dbpassword = "12345678";
        String userEmail = "contact@gmail.com";
        String userpassword = "12345678";
        int loggedinUserId = 8;
        System.out.println(loggedinUserId != adminId);

        System.out.println(userEmail == dbEmail);
        System.out.println(dbpassword == userpassword);
        System.out.println(adminId == userId);

        int billTotal = 300;
        int minAmount = 200;

        System.out.println(billTotal > minAmount);
        System.out.println(billTotal < minAmount);
        System.out.println(billTotal <= minAmount);
        System.out.println(billTotal >= minAmount);

        // logical operators

        Boolean UserDetails = userEmail == dbEmail && dbpassword == userpassword;
        System.out.println("UserDetails: " + UserDetails);

    }
}