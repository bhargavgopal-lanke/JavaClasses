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
        if (productId > 100) {
            try {
                throw new ProductExceptions("Invalid product id");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    public void checkInventory(int quantity) {
        // assignment
        // if quantity is more than 10 throw an error message "out of stock"
        if (quantity > 10) {
            try {
                throw new CheckInventoryExceptions("out of stock");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }
        } else {
            System.out.println("quantity " + quantity);
        }

    }

    public void processPayment(int productId, int quantity, int price) {

    }

}
