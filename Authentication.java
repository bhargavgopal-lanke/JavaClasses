public class Authentication { // class

    public static void main(String[] args) {
        // System.out.println("main is the main method in class to execute other
        // methods");
        Authentication createObj = new Authentication();
        createObj.Login();
        createObj.CreateAccount();
        createObj.ResetPassword();

    }

    public void Login() { // method
        System.out.println("Logged in");
    }

    public void CreateAccount() {
        System.out.println("Account Created");
    }

    public void ResetPassword() {
        System.out.println("Password reset");
    }
}