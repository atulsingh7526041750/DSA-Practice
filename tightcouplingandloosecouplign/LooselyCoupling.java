package tightcouplingandloosecouplign;


import java.util.ArrayList;
import java.util.List;

public class LooselyCoupling {
    public static void main(String[] args) {



        MessageService messageService = new EmailService1();
        MessageService messageService1 = new SMSService();

        NotificationService1 notificationService1 = new NotificationService1(messageService1);
        notificationService1.sendNotification("13","23");
    }



}
class NotificationService1{
    private MessageService messageService;
    public NotificationService1(MessageService messageService){
        this.messageService = messageService;
    }

    public void sendNotification(String message, String receiver) {
        messageService.sendMessage(message, receiver);
    }

}

interface MessageService {
    void sendMessage(String message, String receiver);
}

class EmailService1 implements MessageService {
    @Override
    public void sendMessage(String message, String receiver) {
        System.out.println("Email sent to " + receiver + " with message: " + message);
    }
}

// SMS service implementation
class SMSService implements MessageService {
    @Override
    public void sendMessage(String message, String receiver) {
        System.out.println("SMS sent to " + receiver + " with message: " + message);
    }
}
