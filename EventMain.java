import java.util.Scanner;

public class EventMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Event event = new Event();

        System.out.print("Enter Event Name: ");
        event.name = input.nextLine();
        System.out.print("Enter Event Date: ");
        event.date = input.nextLine();
        System.out.print("Enter Event Location: ");
        event.location = input.nextLine();
        System.out.print("Enter Organizer Name: ");
        event.organizer = input.nextLine();
        System.out.print("Enter Number of Attendees: ");
        event.attendees = input.nextInt();
        System.out.print("Enter Ticket Price: ");
        event.ticketPrice = input.nextDouble();
        System.out.print("Enter Event Duration (in hours): ");
        event.duration = input.nextInt();

        System.out.println("\nEvent Details:");
        System.out.println("Name: " + event.name);
        System.out.println("Date: " + event.date);
        System.out.println("Location: " + event.location);
        System.out.println("Organizer: " + event.organizer);
        System.out.println("Attendees: " + event.attendees);
        System.out.println("Ticket Price: $" + event.ticketPrice);
        System.out.println("Duration: " + event.duration + " hours");
    }
}
