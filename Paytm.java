public class Paytm extends Payments {
    public static void main(String[] args) {
        Paytm obj1 = new Paytm();
        obj1.orderId = 30;
        obj1.CreateOrderId();
    }

    // override is used to override the methods
    // @Override
    // public void CreateOrderId() {
    //     orderId = 25;
    //     System.out.println("create order id " + orderId);
    // }

    public void ProcessPayment() {
        System.out.println("Processing payment for the order id " + orderId);
    }

    public void VerifyPayment() {
        System.out.println("Verifying payment " + orderId);
    }
}
