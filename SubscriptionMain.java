import java.util.Scanner;

public class SubscriptionMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Subscription subscription = new Subscription();

        System.out.print("Enter Service Name: ");
        subscription.service = input.nextLine();
        System.out.print("Enter User Name: ");
        subscription.user = input.nextLine();
        System.out.print("Enter Start Date: ");
        subscription.startDate = input.nextLine();
        System.out.print("Enter End Date: ");
        subscription.endDate = input.nextLine();
        System.out.print("Enter Price: ");
        subscription.price = input.nextDouble();
        input.nextLine();
        System.out.print("Enter Renewal Frequency: ");
        subscription.renewalFrequency = input.nextLine();
        System.out.print("Enter Status: ");
        subscription.status = input.nextLine();

        System.out.println("\nSubscription Details:");
        System.out.println("Service: " + subscription.service);
        System.out.println("User: " + subscription.user);
        System.out.println("Start Date: " + subscription.startDate);
        System.out.println("End Date: " + subscription.endDate);
        System.out.println("Price: $" + subscription.price);
        System.out.println("Renewal Frequency: " + subscription.renewalFrequency);
        System.out.println("Status: " + subscription.status);
    }
}
