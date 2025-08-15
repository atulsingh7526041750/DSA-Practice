package tightcouplingandloosecouplign;

 class EmailService {
    public void sendMessage(String message , String receiver){
        System.out.println("Hello from email");
    }
}
class NotificationService{
     private final EmailService emailService = new EmailService();

    public void sendNotification(String message, String receiver) {
        emailService.sendMessage(message, receiver);
    }

}


public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification("Hello World!", "user@example.com");


        /**
         * Problems with this approach:
         *
         * NotificationService is directly creating an instance of EmailService
         *
         * Hard to change the messaging service (e.g., to SMS)
         *
         * Difficult to test NotificationService in isolation
         *
         * No flexibility to switch implementations
         */
    }
}
