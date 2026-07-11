package PaymentsPractice;

public class Paytm extends Payments {
    public static void main(String[] args) {
        Paytm obj1 = new Paytm();
        obj1.processPayment();
        obj1.CreateOrderId();
    }

    public void processPayment() {
        System.out.println("Processing the payment " + orderId);
    }

    public void verifyPayment() {
        System.out.println("verified the payment for the " + orderId);
    }
}
