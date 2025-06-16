import java.util.Scanner;

public class CalendarMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calendar calendar = new Calendar();

        System.out.print("Enter Year: ");
        calendar.year = input.nextInt();
        input.nextLine();
        System.out.print("Enter Months: ");
        calendar.months = input.nextLine();
        System.out.print("Enter Holidays: ");
        calendar.holidays = input.nextLine();
        System.out.print("Enter Events: ");
        calendar.events = input.nextLine();
        System.out.print("Enter Week Start Day: ");
        calendar.weekStart = input.nextLine();
        System.out.print("Enter Timezone: ");
        calendar.timezone = input.nextLine();
        System.out.print("Enter Format (e.g., DD/MM/YYYY): ");
        calendar.format = input.nextLine();

        System.out.println("\nCalendar Details:");
        System.out.println("Year: " + calendar.year);
        System.out.println("Months: " + calendar.months);
        System.out.println("Holidays: " + calendar.holidays);
        System.out.println("Events: " + calendar.events);
        System.out.println("Week Start: " + calendar.weekStart);
        System.out.println("Timezone: " + calendar.timezone);
        System.out.println("Format: " + calendar.format);
    }
}
