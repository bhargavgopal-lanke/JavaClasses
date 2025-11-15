public class Cart {
    public static void main(String[] args) {
        Cart CartObj = new Cart();
        CartObj.AddTocart();
        CartObj.Updatecart();
    }

    public void AddTocart() {
        System.out.println("Add to cart");
    }

    public void Updatecart() {
        System.out.println("Update items in cart");
    }

    public void Deletecart() {
        System.out.println("Delete the items in cart");
    }
}