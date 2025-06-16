import java.util.Scanner;

public class AnimalMain {
    public static void main(String[] args) {
        Animal creature = new Animal();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Species: ");
        creature.species = input.next();
        System.out.println("Enter Habitat: ");
        creature.habitat = input.next();
        System.out.println("Enter Diet: ");
        creature.diet = input.next();
        System.out.println("Enter Lifespan (years): ");
        creature.lifespan = input.nextInt();
        System.out.println("Enter Conservation Status: ");
        creature.conservationStatus = input.next();
        System.out.println("Enter Weight (kg): ");
        creature.weight = input.nextDouble();
        System.out.println("Enter Scientific Name: ");
        creature.scientificName = input.next();

        System.out.println("\nAnimal Details:");
        System.out.println("Species: " + creature.species);
        System.out.println("Habitat: " + creature.habitat);
        System.out.println("Diet: " + creature.diet);
        System.out.println("Lifespan: " + creature.lifespan + " years");
        System.out.println("Conservation Status: " + creature.conservationStatus);
        System.out.println("Weight: " + creature.weight + " kg");
        System.out.println("Scientific Name: " + creature.scientificName);
    }
}
