public class VedioActions implements VedioActionsInterface {
    public static void main(String[] args) {
        VedioActions CreateObj = new VedioActions();
        CreateObj.Like(); // calling methods or executing methods

        // create a reference or object to a class
        // call the method with method name
        Authentication AuthObj = new Authentication();
        AuthObj.Login();
        Courses CourseObj = new Courses();
        CourseObj.BuyCourse();

        VedioActions createObj2 = new VedioActions();
        createObj2.Like();
        createObj2.Clip();
    }

    public void Like() {
        System.out.println("like the vedio");
    }

    public void Dislike() {
        System.out.println("Dislike the vedio");
    }

    public void Download() {
        System.out.println("Download the vedio");
    }

    public void Save() {
        System.out.println("Save the vedio");
    }

    public void Clip() {
        System.out.println("Clip the vedio");
    }

    public void Report() {
        System.out.println("report the vedio");
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