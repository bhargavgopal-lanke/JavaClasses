// if we want devs to create mandatory menthods inside child class then
// we use this abstract methods.
public abstract class Payments {
    int orderId = 0;

    public void CreateOrderId() {
        System.out.println("create order id " + orderId + ProductCategory.HOMEAPPLIANCES);
    }

    public void Refund() {
        CreateOrderId();
        System.out.println("Refund amount " + orderId);
    }

    public void CancelOrder() {
        System.out.println("cancel order id " + orderId);
    }

    public abstract void ProcessPayment();

    public abstract void VerifyPayment();

}