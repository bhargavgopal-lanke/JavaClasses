public class Oops {
    String userEmail = "";
    String userPassword = "";

    public static void main(String[] args) {
        Oops oopObjOne = new Oops();
        oopObjOne.userEmail = "firstObjemail@gmail.com";
        oopObjOne.userPassword = "firstObjPwd";
        System.out.println(oopObjOne.userEmail);
        System.out.println(oopObjOne.userPassword);

        Oops oopObjTwo = new Oops();
        oopObjTwo.userEmail = "secondObjEmail@gmail.com";
        oopObjTwo.userPassword = "second obj password";
        System.out.println(oopObjTwo.userEmail);
        System.out.println(oopObjTwo.userPassword);

    }

    public void getLoginDetails() {
        System.out.println("login");
    }

}