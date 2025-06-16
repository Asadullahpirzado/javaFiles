import java.util.Scanner;

public class MessageMain {
    public static void main(String[] args) {
        Message message = new Message();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Sender Name: ");
        message.sender = input.next();
        System.out.println("Enter Receiver Name: ");
        message.receiver = input.next();
        System.out.println("Enter Message Content: ");
        message.content = input.next();
        System.out.println("Enter Timestamp: ");
        message.timestamp = input.next();
        System.out.println("Enter Status: ");
        message.status = input.next();
        System.out.println("Enter Platform: ");
        message.platform = input.next();
        System.out.println("Enter Attachments: ");
        message.attachments = input.next();

        System.out.println("\nMessage Details:");
        System.out.println("Sender: " + message.sender);
        System.out.println("Receiver: " + message.receiver);
        System.out.println("Content: " + message.content);
        System.out.println("Timestamp: " + message.timestamp);
        System.out.println("Status: " + message.status);
        System.out.println("Platform: " + message.platform);
        System.out.println("Attachments: " + message.attachments);
    }
}
