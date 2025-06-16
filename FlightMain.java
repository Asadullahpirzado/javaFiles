import java.util.Scanner;

public class FlightMain {
    public static void main(String[] args) {
        Flight flight = new Flight();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Flight Number: ");
        flight.flightNumber = input.next();
        System.out.println("Enter Departure Time: ");
        flight.departureTime = input.next();
        System.out.println("Enter Arrival Time: ");
        flight.arrivalTime = input.next();
        System.out.println("Enter Origin: ");
        flight.origin = input.next();
        System.out.println("Enter Destination: ");
        flight.destination = input.next();
        System.out.println("Enter Aircraft Type: ");
        flight.aircraft = input.next();
        System.out.println("Enter Gate: ");
        flight.gate = input.next();

        System.out.println("\nFlight Details:");
        System.out.println("Flight Number: " + flight.flightNumber);
        System.out.println("Departure Time: " + flight.departureTime);
        System.out.println("Arrival Time: " + flight.arrivalTime);
        System.out.println("Origin: " + flight.origin);
        System.out.println("Destination: " + flight.destination);
        System.out.println("Aircraft: " + flight.aircraft);
        System.out.println("Gate: " + flight.gate);
    }
}
