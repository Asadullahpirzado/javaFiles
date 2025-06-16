import java.util.Scanner;

public class EmailMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Email email = new Email();

        System.out.print("Enter Sender: ");
        email.sender = input.nextLine();
        System.out.print("Enter Recipient: ");
        email.recipient = input.nextLine();
        System.out.print("Enter Subject: ");
        email.subject = input.nextLine();
        System.out.print("Enter Email Body: ");
        email.body = input.nextLine();
        System.out.print("Enter Sent Time: ");
        email.sentTime = input.nextLine();
        System.out.print("Enter Attachments (if any, else type 'None'): ");
        email.attachments = input.nextLine();
        System.out.print("Enter Priority (High/Medium/Low): ");
        email.priority = input.nextLine();

        System.out.println("\nEmail Details:");
        System.out.println("Sender: " + email.sender);
        System.out.println("Recipient: " + email.recipient);
        System.out.println("Subject: " + email.subject);
        System.out.println("Body: " + email.body);
        System.out.println("Sent Time: " + email.sentTime);
        System.out.println("Attachments: " + email.attachments);
        System.out.println("Priority: " + email.priority);
    }
}
