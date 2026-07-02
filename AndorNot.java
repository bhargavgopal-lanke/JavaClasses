public class AndorNot {
    public static void main(String[] args) {
        int adminId = 20;
        int userId = 15;
        int editorId = 20;

        if(adminId == userId) {
            System.out.println("Welcome Admin " + userId);
        }
        if(userId == editorId) {
            System.out.println("Welcome Editor");
        }
        if(userId == editorId || adminId == editorId) {
            System.out.println("You can edit the files");
        } else {
            System.out.println("You dont have access");
        }
    }
}

