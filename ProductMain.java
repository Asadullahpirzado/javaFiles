import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Product item = new Product();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Product Name: ");
        item.name = input.next();
        System.out.println("Enter Product ID: ");
        item.id = input.next();
        System.out.println("Enter Product Price: ");
        item.price = input.nextDouble();
        System.out.println("Enter Category: ");
        item.category = input.next();
        System.out.println("Enter Manufacturer: ");
        item.manufacturer = input.next();
        System.out.println("Enter Stock Quantity: ");
        item.stockQuantity = input.nextInt();
        System.out.println("Enter Weight: ");
        item.weight = input.nextDouble();

        System.out.println("\nProduct Details:");
        System.out.println("Name: " + item.name);
        System.out.println("ID: " + item.id);
        System.out.println("Price: $" + item.price);
        System.out.println("Category: " + item.category);
        System.out.println("Manufacturer: " + item.manufacturer);
        System.out.println("Stock Quantity: " + item.stockQuantity);
        System.out.println("Weight: " + item.weight + " kg");
    }
}
