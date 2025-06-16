import java.util.Scanner;

public class ShoeMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Shoe shoe = new Shoe();

        System.out.print("Enter Brand: ");
        shoe.brand = input.nextLine();
        System.out.print("Enter Size: ");
        shoe.size = input.nextInt();
        input.nextLine();
        System.out.print("Enter Style: ");
        shoe.style = input.nextLine();
        System.out.print("Enter Color: ");
        shoe.color = input.nextLine();
        System.out.print("Enter Material: ");
        shoe.material = input.nextLine();
        System.out.print("Enter Price: ");
        shoe.price = input.nextDouble();
        input.nextLine();
        System.out.print("Enter Support Type: ");
        shoe.supportType = input.nextLine();

        System.out.println("\nShoe Details:");
        System.out.println("Brand: " + shoe.brand);
        System.out.println("Size: " + shoe.size);
        System.out.println("Style: " + shoe.style);
        System.out.println("Color: " + shoe.color);
        System.out.println("Material: " + shoe.material);
        System.out.println("Price: $" + shoe.price);
        System.out.println("Support Type: " + shoe.supportType);
    }
}
