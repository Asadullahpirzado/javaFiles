import java.util.Scanner;

public class CoffeeMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Coffee coffee = new Coffee();

        System.out.print("Enter Coffee Origin: ");
        coffee.origin = input.nextLine();
        System.out.print("Enter Roast Type (Light/Medium/Dark): ");
        coffee.roast = input.nextLine();
        System.out.print("Enter Flavor Notes: ");
        coffee.flavor = input.nextLine();
        System.out.print("Enter Caffeine Content (mg per serving): ");
        coffee.caffeine = input.nextDouble();
        input.nextLine();
        System.out.print("Enter Grind Size (Fine/Medium/Coarse): ");
        coffee.grindSize = input.nextLine();
        System.out.print("Enter Brew Method: ");
        coffee.brewMethod = input.nextLine();
        System.out.print("Enter Aroma Description: ");
        coffee.aroma = input.nextLine();

        System.out.println("\nCoffee Details:");
        System.out.println("Origin: " + coffee.origin);
        System.out.println("Roast: " + coffee.roast);
        System.out.println("Flavor: " + coffee.flavor);
        System.out.println("Caffeine: " + coffee.caffeine + " mg");
        System.out.println("Grind Size: " + coffee.grindSize);
        System.out.println("Brew Method: " + coffee.brewMethod);
        System.out.println("Aroma: " + coffee.aroma);
    }
}
