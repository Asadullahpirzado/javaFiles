import java.util.Scanner;

public class CreditCardMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CreditCard creditCard = new CreditCard();

        System.out.print("Enter Credit Card Number: ");
        creditCard.number = input.nextLine();
        System.out.print("Enter Card Holder Name: ");
        creditCard.holder = input.nextLine();
        System.out.print("Enter Expiration Date (MM/YY): ");
        creditCard.expirationDate = input.nextLine();
        System.out.print("Enter CVV: ");
        creditCard.cvv = input.nextInt();
        System.out.print("Enter Credit Limit: ");
        creditCard.creditLimit = input.nextDouble();
        input.nextLine();
        System.out.print("Enter Card Issuer: ");
        creditCard.issuer = input.nextLine();
        System.out.print("Enter Reward Program (if any, else type 'None'): ");
        creditCard.rewardProgram = input.nextLine();

        System.out.println("\nCredit Card Details:");
        System.out.println("Number: " + creditCard.number);
        System.out.println("Holder: " + creditCard.holder);
        System.out.println("Expiration Date: " + creditCard.expirationDate);
        System.out.println("CVV: " + creditCard.cvv);
        System.out.println("Credit Limit: $" + creditCard.creditLimit);
        System.out.println("Issuer: " + creditCard.issuer);
        System.out.println("Reward Program: " + creditCard.rewardProgram);
    }
}
