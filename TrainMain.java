import java.util.Scanner;

public class TrainMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Train train = new Train();

        System.out.print("Enter Train Number: ");
        train.number = input.nextLine();
        System.out.print("Enter Route: ");
        train.route = input.nextLine();
        System.out.print("Enter Departure Time: ");
        train.departureTime = input.nextLine();
        System.out.print("Enter Arrival Time: ");
        train.arrivalTime = input.nextLine();
        System.out.print("Enter Number of Carriages: ");
        train.carriages = input.nextInt();
        System.out.print("Enter Speed (km/h): ");
        train.speed = input.nextDouble();
        input.nextLine();
        System.out.print("Enter Operator: ");
        train.operator = input.nextLine();

        System.out.println("\nTrain Details:");
        System.out.println("Number: " + train.number);
        System.out.println("Route: " + train.route);
        System.out.println("Departure Time: " + train.departureTime);
        System.out.println("Arrival Time: " + train.arrivalTime);
        System.out.println("Carriages: " + train.carriages);
        System.out.println("Speed: " + train.speed + " km/h");
        System.out.println("Operator: " + train.operator);
    }
}
