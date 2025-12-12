public class OopsThree {
    public static void main(String[] args) {
        OopsThree obj1 = new OopsThree();
        obj1.add(2, 3);
        obj1.add(52, 37);
        obj1.add(2, 3 + 5);
        obj1.add("Java", "Oops");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void add(String a, String b) {
        System.out.println(a + b);
    }

    public void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

}
