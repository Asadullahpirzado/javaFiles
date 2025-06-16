import java.util.Scanner;

public class InsuranceMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Insurance insurance = new Insurance();

        System.out.print("Enter Insurance Type: ");
        insurance.type = input.nextLine();
        System.out.print("Enter Provider: ");
        insurance.provider = input.nextLine();
        System.out.print("Enter Policyholder Name: ");
        insurance.policyholder = input.nextLine();
        System.out.print("Enter Premium Amount: ");
        insurance.premium = input.nextDouble();
        input.nextLine();
        System.out.print("Enter Coverage Details: ");
        insurance.coverage = input.nextLine();
        System.out.print("Enter Deductible Amount: ");
        insurance.deductible = input.nextDouble();
        input.nextLine();
        System.out.print("Enter Expiration Date: ");
        insurance.expirationDate = input.nextLine();

        System.out.println("\nInsurance Details:");
        System.out.println("Type: " + insurance.type);
        System.out.println("Provider: " + insurance.provider);
        System.out.println("Policyholder: " + insurance.policyholder);
        System.out.println("Premium: $" + insurance.premium);
        System.out.println("Coverage: " + insurance.coverage);
        System.out.println("Deductible: $" + insurance.deductible);
        System.out.println("Expiration Date: " + insurance.expirationDate);
    }
}
