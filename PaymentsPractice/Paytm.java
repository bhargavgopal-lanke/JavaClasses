package PaymentsPractice;

public class Paytm extends Payments implements VedioActionsInterface, CommentsInterface {
    public static void main(String[] args) {
        Paytm obj1 = new Paytm();
        obj1.processPayment();
        obj1.CreateOrderId(); 

        obj1.editComment();
    }

    public void processPayment() {
        System.out.println("Processing the payment " + orderId);
    }

    public void verifyPayment() {
        System.out.println("verified the payment for the " + orderId);
    }

    public void like() {
        System.out.println("Liked the vedio");
    }

    public void dislike() {
        System.out.println("Disliked the vedio");
    }

    public void clip() {
        System.out.println("Clip the vedio");
    }

    public void share() {
        System.out.println("Share the vedio");
    }

    public void download() {
        System.out.println("Download the vedio");
    }

    public void addcomment() {
        System.out.println("Added the comment");
    }

    public void deleteComment() {
        System.out.println("Deleted the comment");
    }

    public void editComment() {
        System.out.println("Edited the comment");
    }
}
