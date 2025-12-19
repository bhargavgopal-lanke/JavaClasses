public class Emailer {
    public static void main(String[] args) {
        System.out.println("this is task1");
        System.out.println("this is task2");
        // for sending an email it'll take 2 secs
        // System.out.println("Send an email");
        // for time taking tasks we need to use a thread
        // Create a new thread, this task runs in the background and called later
        SendGridEmailer sendGridEmailer = new SendGridEmailer();
        Thread tEmail = new Thread(sendGridEmailer);
        tEmail.start();

        // final task
        System.out.println("last task");
    }

}
