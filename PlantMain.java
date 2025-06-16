import java.util.Scanner;

public class PlantMain {
    public static void main(String[] args) {
        Plant plant = new Plant();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Species Name: ");
        plant.species = input.next();
        System.out.println("Enter Sun Requirement: ");
        plant.sunRequirement = input.next();
        System.out.println("Enter Water Requirement: ");
        plant.waterRequirement = input.next();
        System.out.println("Enter Bloom Season: ");
        plant.bloomSeason = input.next();
        System.out.println("Enter Native Region: ");
        plant.nativeRegion = input.next();
        System.out.println("Enter Growth Rate: ");
        plant.growthRate = input.next();
        System.out.println("Enter Soil Type: ");
        plant.soilType = input.next();

        System.out.println("\nPlant Details:");
        System.out.println("Species: " + plant.species);
        System.out.println("Sun Requirement: " + plant.sunRequirement);
        System.out.println("Water Requirement: " + plant.waterRequirement);
        System.out.println("Bloom Season: " + plant.bloomSeason);
        System.out.println("Native Region: " + plant.nativeRegion);
        System.out.println("Growth Rate: " + plant.growthRate);
        System.out.println("Soil Type: " + plant.soilType);
    }
}
