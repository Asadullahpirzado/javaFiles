import java.util.Scanner;

public class HouseMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        House house = new House();

        System.out.print("Enter House Address: ");
        house.address = input.nextLine();
        System.out.print("Enter Number of Rooms: ");
        house.rooms = input.nextInt();
        System.out.print("Enter Square Footage: ");
        house.squareFootage = input.nextDouble();
        System.out.print("Enter Year Built: ");
        house.yearBuilt = input.nextInt();
        System.out.print("Enter Price: ");
        house.price = input.nextDouble();
        input.nextLine();
        System.out.print("Enter House Style: ");
        house.style = input.nextLine();
        System.out.print("Enter Amenities: ");
        house.amenities = input.nextLine();

        System.out.println("\nHouse Details:");
        System.out.println("Address: " + house.address);
        System.out.println("Rooms: " + house.rooms);
        System.out.println("Square Footage: " + house.squareFootage + " sq. ft.");
        System.out.println("Year Built: " + house.yearBuilt);
        System.out.println("Price: $" + house.price);
        System.out.println("Style: " + house.style);
        System.out.println("Amenities: " + house.amenities);
    }
}
