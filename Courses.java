public class Courses {
    public static void main(String[] args) {
        Courses createObj = new Courses();
        createObj.GetCoursesList();
        createObj.GetSingleCourseDetails();
        createObj.BuyCourse();
    }

    public void GetCoursesList() {
        System.out.println("get Courses list");
    }

    public void GetSingleCourseDetails() {
        System.out.println("Get Single course details");
    }

    public void BuyCourse() {
        System.out.println("Buy a course");
    }
}