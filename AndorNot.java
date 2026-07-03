public class AndorNot {
    public static void main(String[] args) {
        int adminId = 20;
        int userId = 15;
        int editorId = 21;
        int viewId = 22;

        // if(adminId == userId) {
        //     System.out.println("Welcome Admin " + userId);
        // };

        // if(editorId == userId) {
        //     System.out.println("Welcome Editor");
        // };

        // if(editorId == userId || adminId == userId) {
        //     System.out.println("You can edit the files");
        // } else if(viewId == userId) {
        //     System.out.println("You can  view the files");
        // } else {
        //     System.out.println("You dont have access");
        // }

        switch(userId) {
            case 20:
                System.out.println("Welcome Admin" + " " + userId);
                break;
            case 21:
                System.out.println("You can edit the files" + " " + userId);
                break;
            case 22:
                System.out.println("You can view the files" + " " + userId);
                break;
            default:
                System.out.println("You dont have access.");
                
        }

    }
}

