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
        System.out.println(count); // 5
        // post incremnt
        System.out.println(1 + count++); // 1 + 5 = 6
        System.out.println(1 + count++); // 1 + 6 = 7
        // pre increment
        System.out.println(1 + ++count); // 1 + 1 + 7 = 9;

        // Otp Generation

        double randomNumber = Math.random();
        System.out.println("randomNumber: " + randomNumber);
        int otp = (int) (randomNumber * 10000);
        System.out.println("otp: " + otp);

    }
}