package PaymentsPractice;

public class Payments {
    public static void main(String[] args) {
        Payments paymentObj = new Payments();
        paymentObj.CancelOrder();
        paymentObj.refundOrder();        
    }

    public void CreateOrderId() {
        System.out.println("OrderId was created");
    }

    public void CancelOrder() {
        System.out.println("Order was cancelled");
    }

    public void refundOrder() {
        System.out.println("Refund has been processed");
    }

}
