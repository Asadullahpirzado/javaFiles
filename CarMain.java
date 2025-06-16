import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Car Model: ");
        car.model = input.next();
        System.out.println("Enter Car Year: ");
        car.year = input.nextInt();
        System.out.println("Enter Car Color: ");
        car.color = input.next();
        System.out.println("Enter Car Mileage: ");
        car.mileage = input.nextDouble();
        System.out.println("Enter Fuel Type: ");
        car.fuelType = input.next();
        System.out.println("Enter Transmission Type: ");
        car.transmission = input.next();

        System.out.println("\nCar Details:");
        System.out.println("Model: " + car.model);
        System.out.println("Year: " + car.year);
        System.out.println("Color: " + car.color);
        System.out.println("Mileage: " + car.mileage);
        System.out.println("Fuel Type: " + car.fuelType);
        System.out.println("Transmission: " + car.transmission);
    }
}
