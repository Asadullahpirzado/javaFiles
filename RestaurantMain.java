import java.util.Scanner;

public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant eatery = new Restaurant();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Restaurant Name: ");
        eatery.name = input.next();
        System.out.println("Enter Address: ");
        eatery.address = input.next();
        System.out.println("Enter Cuisine Type: ");
        eatery.cuisine = input.next();
        System.out.println("Enter Rating (out of 5): ");
        eatery.rating = input.nextDouble();
        System.out.println("Enter Opening Hours: ");
        eatery.openingHours = input.next();
        System.out.println("Enter Capacity: ");
        eatery.capacity = input.nextInt();
        System.out.println("Enter Chef's Name: ");
        eatery.chef = input.next();

        System.out.println("\nRestaurant Details:");
        System.out.println("Name: " + eatery.name);
        System.out.println("Address: " + eatery.address);
        System.out.println("Cuisine: " + eatery.cuisine);
        System.out.println("Rating: " + eatery.rating);
        System.out.println("Opening Hours: " + eatery.openingHours);
        System.out.println("Capacity: " + eatery.capacity);
        System.out.println("Chef: " + eatery.chef);
    }
}
