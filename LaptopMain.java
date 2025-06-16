import java.util.*;
public class LaptopMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Laptop laptop = new Laptop();

        System.out.print("Enter Laptop Brand: ");
        laptop.brand = input.next();
        System.out.print("Enter Model: ");
        laptop.model = input.next();
        System.out.print("Enter Processor: ");
        laptop.processor = input.next();
        System.out.print("Enter RAM (GB): ");
        laptop.ram = input.nextInt();
        System.out.print("Enter Storage (GB): ");
        laptop.storage = input.nextInt();
        System.out.print("Enter Screen Size (inches): ");
        laptop.screenSize = input.nextDouble();
        System.out.print("Enter Battery Life (hours): ");
        laptop.batteryLife = input.nextInt();

        System.out.println("\nLaptop Details:");
        System.out.println("Brand: " + laptop.brand);
        System.out.println("Model: " + laptop.model);
        System.out.println("Processor: " + laptop.processor);
        System.out.println("RAM: " + laptop.ram + "GB");
        System.out.println("Storage: " + laptop.storage + "GB");
        System.out.println("Screen Size: " + laptop.screenSize + " inches");
        System.out.println("Battery Life: " + laptop.batteryLife + " hours");
    }
}
