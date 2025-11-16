public class NumberVariables {
    public static void main(String[] args) {
        String price = "199.9";
        String quantity = "2";
        float totalPrice = Float.parseFloat(price) * Integer.parseInt(quantity);
        System.out.println(totalPrice);
        String outputMsg = "This is final Price " + totalPrice;
        System.out.println(outputMsg);

        // Count Examples with numbers
        int count = 1;
        System.out.println(count);
        count = count + 1;
        System.out.println(count);
        count += 1;
        System.out.println(count);
        count++;
        System.out.println(count);
        count++;
        System.out.println(count);

    }
}