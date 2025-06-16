import java.util.Scanner;

public class BuildingMain {
    public static void main(String[] args) {
        Building structure = new Building();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Building Address: ");
        structure.address = input.next();
        System.out.println("Enter Number of Floors: ");
        structure.floors = input.nextInt();
        System.out.println("Enter Square Footage: ");
        structure.squareFootage = input.nextDouble();
        System.out.println("Enter Year Built: ");
        structure.yearBuilt = input.nextInt();
        System.out.println("Enter Owner's Name: ");
        structure.owner = input.next();
        System.out.println("Enter Occupancy Rate (in percentage): ");
        structure.occupancyRate = input.nextDouble();
        System.out.println("Enter Building Type: ");
        structure.buildingType = input.next();

        System.out.println("\nBuilding Details:");
        System.out.println("Address: " + structure.address);
        System.out.println("Floors: " + structure.floors);
        System.out.println("Square Footage: " + structure.squareFootage);
        System.out.println("Year Built: " + structure.yearBuilt);
        System.out.println("Owner: " + structure.owner);
        System.out.println("Occupancy Rate: " + structure.occupancyRate + "%");
        System.out.println("Building Type: " + structure.buildingType);
    }
}

