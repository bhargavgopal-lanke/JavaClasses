public class Oopspractice {

    String userEmail = "tony@gmail.com";
    String userPwd = "12345678";

    public Oopspractice(String inpMail, String inpPwd) {
        this.userEmail = inpMail;
        this.userPwd = inpPwd;
    }

    public static void main(String[] args) {
        Oopspractice newObj1 = new Oopspractice("testObj1@gmail.com", "9154924525");
        // newObj1.userEmail = "testObj1@gmail.com";
        // newObj1.userPwd = "9154924525";
        System.out.println(newObj1.userEmail);
        System.out.println(newObj1.userPwd);

        Oopspractice obj2 = new Oopspractice("testobj2@gmail.com", "874874357843587");
        // obj2.userEmail = "testobj2@gmail.com";
        // newObj1.userPwd = "874874357843587";
        System.out.println(obj2.userEmail);
        System.out.println(newObj1.userPwd);
    }
}
