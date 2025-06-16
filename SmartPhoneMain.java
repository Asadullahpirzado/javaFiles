import java.util.Scanner;

public class SmartPhoneMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SmartPhone smartphone = new SmartPhone();

        System.out.print("Enter Brand: ");
        smartphone.brand = input.nextLine();
        System.out.print("Enter Model: ");
        smartphone.model = input.nextLine();
        System.out.print("Enter Operating System: ");
        smartphone.operatingSystem = input.nextLine();
        System.out.print("Enter Battery Capacity (mAh): ");
        smartphone.battery = input.nextInt();
        input.nextLine();
        System.out.print("Enter Camera Details: ");
        smartphone.camera = input.nextLine();
        System.out.print("Enter Screen Size (in inches): ");
        smartphone.screenSize = input.nextDouble();
        input.nextLine();
        System.out.print("Enter Processor: ");
        smartphone.processor = input.nextLine();

        System.out.println("\nSmartphone Details:");
        System.out.println("Brand: " + smartphone.brand);
        System.out.println("Model: " + smartphone.model);
        System.out.println("Operating System: " + smartphone.operatingSystem);
        System.out.println("Battery: " + smartphone.battery + " mAh");
        System.out.println("Camera: " + smartphone.camera);
        System.out.println("Screen Size: " + smartphone.screenSize + " inches");
        System.out.println("Processor: " + smartphone.processor);
    }
}
