import java.util.Scanner;

public class MedicationMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Medication medication = new Medication();

        System.out.print("Enter Medication Name: ");
        medication.name = input.nextLine();
        System.out.print("Enter Dosage: ");
        medication.dosage = input.nextLine();
        System.out.print("Enter Active Ingredient: ");
        medication.activeIngredient = input.nextLine();
        System.out.print("Enter Side Effects: ");
        medication.sideEffects = input.nextLine();
        System.out.print("Enter Manufacturer: ");
        medication.manufacturer = input.nextLine();
        System.out.print("Is Prescription Required (true/false): ");
        medication.prescriptionRequired = input.nextBoolean();
        input.nextLine();
        System.out.print("Enter Storage Requirements: ");
        medication.storageRequirements = input.nextLine();

        System.out.println("\nMedication Details:");
        System.out.println("Name: " + medication.name);
        System.out.println("Dosage: " + medication.dosage);
        System.out.println("Active Ingredient: " + medication.activeIngredient);
        System.out.println("Side Effects: " + medication.sideEffects);
        System.out.println("Manufacturer: " + medication.manufacturer);
        System.out.println("Prescription Required: " + medication.prescriptionRequired);
        System.out.println("Storage Requirements: " + medication.storageRequirements);
    }
}
