import java.util.Scanner;

public class CameraMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Camera camera = new Camera();

        System.out.print("Enter Camera Brand: ");
        camera.brand = input.nextLine();
        System.out.print("Enter Model: ");
        camera.model = input.nextLine();
        System.out.print("Enter Megapixels: ");
        camera.megapixels = input.nextDouble();
        input.nextLine();
        System.out.print("Enter Lens Type: ");
        camera.lensType = input.nextLine();
        System.out.print("Enter Sensor Size: ");
        camera.sensorSize = input.nextLine();
        System.out.print("Enter Shutter Speed: ");
        camera.shutterSpeed = input.nextLine();
        System.out.print("Enter ISO Range: ");
        camera.iso = input.nextInt();

        System.out.println("\nCamera Details:");
        System.out.println("Brand: " + camera.brand);
        System.out.println("Model: " + camera.model);
        System.out.println("Megapixels: " + camera.megapixels);
        System.out.println("Lens Type: " + camera.lensType);
        System.out.println("Sensor Size: " + camera.sensorSize);
        System.out.println("Shutter Speed: " + camera.shutterSpeed);
        System.out.println("ISO Range: " + camera.iso);
    }
}
