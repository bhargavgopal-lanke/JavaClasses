public class VedioActions {
    public static void main(String[] args) {
        VedioActions CreateObj = new VedioActions();
        CreateObj.like(); // calling methods or executing methods

        // create a reference or object to a class
        // call the method with method name
        Authentication AuthObj = new Authentication();
        AuthObj.Login();
        Courses CourseObj = new Courses();
        CourseObj.BuyCourse();
    }

    public void like() {
        System.out.println("like");
    }

    public void dislike() {
        System.out.println("Dislike");
    }

    public void share() {
        System.out.println("Share");
    }

    public void AddComment() {
        System.out.println("Add a comment");
    }

    public void DeleteComment() {
        System.out.println("Delete the comment");
    }

    public void UpdateComment() {
        System.out.println("Update the comment");
    }

}