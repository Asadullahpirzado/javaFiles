import java.util.Scanner;

public class MobiePhoneMain {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Brand: ");
        phone.brand = input.next();
        System.out.println("Enter Model: ");
        phone.model = input.next();
        System.out.println("Enter Screen Size: ");
        phone.screenSize = input.nextDouble();
        System.out.println("Enter Storage Capacity: ");
        phone.storage = input.nextInt();
        System.out.println("Enter Battery Capacity: ");
        phone.battery = input.nextInt();
        System.out.println("Enter Camera Specs: ");
        phone.camera = input.next();
        System.out.println("Enter Operating System: ");
        phone.operatingSystem = input.next();

        System.out.println("\nMobile Phone Details:");
        System.out.println("Brand: " + phone.brand);
        System.out.println("Model: " + phone.model);
        System.out.println("Screen Size: " + phone.screenSize + " inches");
        System.out.println("Storage: " + phone.storage + " GB");
        System.out.println("Battery: " + phone.battery + " mAh");
        System.out.println("Camera: " + phone.camera);
        System.out.println("Operating System: " + phone.operatingSystem);
    }
}
