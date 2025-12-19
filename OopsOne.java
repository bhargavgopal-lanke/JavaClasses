public class OopsOne {
    String userName = "";
    String userPwd = "";

    // this is a constructor function
    public OopsOne(String inpMail, String inpPwd) {
        userName = inpMail;
        userPwd = inpPwd;
    }

    public static void main(String[] args) {
        OopsOne obj1 = new OopsOne("test@gmail.com", "123456789");
        OopsOne obj2 = new OopsOne("bhargav@gmail.com", "9154905425");
        System.out.println(obj1.userName);
        System.out.println(obj2.userPwd);
        obj1.Login();
        obj2.Login();       
    }

    public void Login() {
        System.out.println("Please login");
    }
}