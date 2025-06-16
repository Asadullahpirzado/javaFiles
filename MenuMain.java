import java.util.Scanner;

public class MenuMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();

        System.out.print("Enter Restaurant Name: ");
        menu.restaurant = input.nextLine();
        System.out.print("Enter Items: ");
        menu.items = input.nextLine();
        System.out.print("Enter Prices: ");
        menu.prices = input.nextLine();
        System.out.print("Enter Categories: ");
        menu.categories = input.nextLine();
        System.out.print("Enter Special Offers: ");
        menu.specialOffers = input.nextLine();
        System.out.print("Enter Allergen Information: ");
        menu.allergenInfo = input.nextLine();
        System.out.print("Enter Available Times: ");
        menu.availableTimes = input.nextLine();

        System.out.println("\nMenu Details:");
        System.out.println("Restaurant: " + menu.restaurant);
        System.out.println("Items: " + menu.items);
        System.out.println("Prices: " + menu.prices);
        System.out.println("Categories: " + menu.categories);
        System.out.println("Special Offers: " + menu.specialOffers);
        System.out.println("Allergen Info: " + menu.allergenInfo);
        System.out.println("Available Times: " + menu.availableTimes);
    }
}
