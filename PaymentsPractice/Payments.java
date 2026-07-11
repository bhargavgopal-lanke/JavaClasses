
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
        orderId = 15;
        System.out.println("Order was cancelled for this" + " " + orderId);
    }

    public void refundOrder() {
        orderId = 40;
        System.out.println("Refund initiated for order" + " " + orderId);
    }

}
