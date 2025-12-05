public class PayU extends Payments {
    public static void main(String[] args) {
        PayU obj1 = new PayU();
        obj1.CancelOrder();
        obj1.CreateOrderId();
    }

    public void ProcessPayment() {
        System.out.println("Processing payment for order" + orderId);
    }

    public void VerifyPayment() {
        System.out.println("Verifying payment for odrer id" + orderId);
    }
}
