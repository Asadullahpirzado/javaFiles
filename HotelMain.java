import java.util.Scanner;

public class HotelMain {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Hotel Name: ");
        hotel.name = input.next();
        System.out.println("Enter Address: ");
        hotel.address = input.next();
        System.out.println("Enter Number of Stars: ");
        hotel.stars = input.nextInt();
        System.out.println("Enter Number of Rooms: ");
        hotel.rooms = input.nextInt();
        System.out.println("Enter Amenities: ");
        hotel.amenities = input.next();
        System.out.println("Enter Check-In Time: ");
        hotel.checkInTime = input.next();
        System.out.println("Enter Check-Out Time: ");
        hotel.checkOutTime = input.next();

        System.out.println("\nHotel Details:");
        System.out.println("Name: " + hotel.name);
        System.out.println("Address: " + hotel.address);
        System.out.println("Stars: " + hotel.stars);
        System.out.println("Rooms: " + hotel.rooms);
        System.out.println("Amenities: " + hotel.amenities);
        System.out.println("Check-In Time: " + hotel.checkInTime);
        System.out.println("Check-Out Time: " + hotel.checkOutTime);
    }
}
