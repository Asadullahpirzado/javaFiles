import java.util.Scanner;

public class PatientMain {
    public static void main(String[] args) {
        Patient patient = new Patient();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Patient Name: ");
        patient.name = input.next();
        System.out.println("Enter Patient ID: ");
        patient.id = input.next();
        System.out.println("Enter Medical History: ");
        patient.medicalHistory = input.next();
        System.out.println("Enter Blood Type: ");
        patient.bloodType = input.next();
        System.out.println("Enter Height: ");
        patient.height = input.nextDouble();
        System.out.println("Enter Weight: ");
        patient.weight = input.nextDouble();
        System.out.println("Enter Insurance Plan: ");
        patient.insurancePlan = input.next();

        System.out.println("\nPatient Details:");
        System.out.println("Name: " + patient.name);
        System.out.println("ID: " + patient.id);
        System.out.println("Medical History: " + patient.medicalHistory);
        System.out.println("Blood Type: " + patient.bloodType);
        System.out.println("Height: " + patient.height + " cm");
        System.out.println("Weight: " + patient.weight + " kg");
        System.out.println("Insurance Plan: " + patient.insurancePlan);
    }
}
