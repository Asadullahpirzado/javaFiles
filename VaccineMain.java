import java.util.Scanner;

public class VaccineMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Vaccine vaccine = new Vaccine();

        System.out.print("Enter Vaccine Name: ");
        vaccine.name = input.next();
        System.out.print("Enter Manufacturer: ");
        vaccine.manufacturer = input.next();
        System.out.print("Enter Target Disease: ");
        vaccine.targetDisease = input.next();
        System.out.print("Enter Effectiveness Rate (%): ");
        vaccine.effectivenessRate = input.nextDouble();
        System.out.print("Enter Number of Doses Required: ");
        vaccine.dosesRequired = input.nextInt();
        System.out.print("Enter Side Effects: ");
        input.nextLine();
        vaccine.sideEffects = input.nextLine();
        System.out.print("Enter Approval Date: ");
        vaccine.approvalDate = input.next();

        System.out.println("\nVaccine Details:");
        System.out.println("Name: " + vaccine.name);
        System.out.println("Manufacturer: " + vaccine.manufacturer);
        System.out.println("Target Disease: " + vaccine.targetDisease);
        System.out.println("Effectiveness Rate: " + vaccine.effectivenessRate + "%");
        System.out.println("Doses Required: " + vaccine.dosesRequired);
        System.out.println("Side Effects: " + vaccine.sideEffects);
        System.out.println("Approval Date: " + vaccine.approvalDate);
    }
}
