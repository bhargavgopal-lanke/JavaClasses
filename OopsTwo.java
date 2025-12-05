public class OopsTwo {

    int price = 0;
    String title = "";

    public OopsTwo(int inpPrice, String inpTitle) {
        price = inpPrice;
        title = inpTitle;
    }

    public static void main(String[] args) {
        OopsTwo obj1 = new OopsTwo(200, "socks");
        OopsTwo obj2 = new OopsTwo(100, "Cool Drink");

        System.out.println(obj1.price);
        System.out.println(obj2.title);
    }

}