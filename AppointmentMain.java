import java.util.Scanner;

public class AppointmentMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Appointment appointment = new Appointment();
        appointment.setName("asad");
        System.out.print("Enter Appointment Date (DD/MM/YYYY): ");
        appointment.date = input.nextLine();
        System.out.print("Enter Appointment Time (HH:MM AM/PM): ");
        appointment.time = input.nextLine();
        System.out.print("Enter Client Name: ");
        appointment.client = input.nextLine();
        System.out.print("Enter Provider Name: ");
        appointment.provider = input.nextLine();
        System.out.print("Enter Purpose of Appointment: ");
        appointment.purpose = input.nextLine();
        System.out.print("Enter Duration (minutes): ");
        appointment.duration = input.nextInt();
        input.nextLine();
        System.out.print("Enter Location: ");
        appointment.location = input.nextLine();

        System.out.println("\nAppointment Details:");
        System.out.println("Date: " + appointment.date);
        System.out.println("Time: " + appointment.time);
        System.out.println("Client: " + appointment.client);
        System.out.println("Provider: " + appointment.provider);
        System.out.println("Purpose: " + appointment.purpose);
        System.out.println("Duration: " + appointment.duration + " minutes");
        System.out.println("Location: " + appointment.location);
    }
}
