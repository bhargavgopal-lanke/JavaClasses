
package PaymentsPractice;

public class Payments {

    int orderId = 0;
    public static void main(String[] args) {
        Payments paymentObj = new Payments();
        paymentObj.CreateOrderId();
        paymentObj.CancelOrder();
        paymentObj.refundOrder();        
    }

    public void CreateOrderId() {
        orderId = 22;
        System.out.println("OrderId was created" + " " + orderId);
    }

    public void CancelOrder() {
        System.out.println("Order was cancelled");
    }

    public void refundOrder() {
        System.out.println("Refund has been processed");
    }

}
