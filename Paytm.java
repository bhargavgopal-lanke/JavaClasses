public class Paytm extends Payments {
    public static void main(String[] args) {
        Paytm obj1 = new Paytm();
        obj1.CancelOrder();
        obj1.CreateOrderId();
    }

    public void ProcessPayment() {
        System.out.println("Processing payment for the order id " + orderId);
    }

    public void VerifyPayment() {
        System.out.println("Verifying payment " + orderId);
    }
}
