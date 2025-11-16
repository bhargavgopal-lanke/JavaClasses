public class StringVariables {
    public static void main(String[] args) {
        String userName = "BhargavGopallanke";
        System.out.println(userName.length());
        String FirstName = "bhargavgopal";
        String lastName = "lanke";
        System.out.println(FirstName + lastName);
        String CouponCode = "NOV50";
        String userCouponCode = "nov50";
        userCouponCode = userCouponCode.toLowerCase();
        CouponCode = CouponCode.toLowerCase();
        System.out.println(userCouponCode.equals(userCouponCode));
    }
}