public class ExceptionHandling {
    public static void main() {
        // exceptiona handling basic example
        try {
            String[] email = { "contact@gmail.com", "bhargav@gmail.com" };
            // error will be caught in this line
            email[2] = "test@gmail.com";
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}