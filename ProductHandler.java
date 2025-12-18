public class ProductHandler {
    public static void main(String[] args) {
        ProductHandler productObject = new ProductHandler();
        productObject.getProductDetails(150);
        productObject.checkInventory(9);
    }

    // get product details
    // quanity
    // payment

    public void getProductDetails(int productId) {
        try {
            if (productId > 100) {
                throw new ProductExceptions("Invalid product id");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }

    }

    public void checkInventory(int quantity) {
        // assignment
        // if quantity is more than 10 throw an error message "out of stock"
        try {
            if (quantity > 10) {

                throw new CheckInventoryExceptions("out of stock");
            } else {
                System.out.println("quantity added in the database " + quantity);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }

    }

    public void processPayment(int productId, int quantity, int price) {
        try {
            if (price < 100) {
                System.out.println("Payment Successful");
            } else {
                throw new PaymentExceptions("Insufficient funds");
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

}
