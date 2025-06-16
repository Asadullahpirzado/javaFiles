import java.util.Scanner;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Account Number: ");
        account.accountNumber = input.next();
        System.out.println("Enter Owner Name: ");
        account.owner = input.next();
        System.out.println("Enter Balance: ");
        account.balance = input.nextDouble();
        System.out.println("Enter Interest Rate: ");
        account.interestRate = input.nextDouble();
        System.out.println("Enter Account Type: ");
        account.accountType = input.next();
        System.out.println("Enter Creation Date: ");
        account.creationDate = input.next();

        System.out.println("\nBank Account Details:");
        System.out.println("Account Number: " + account.accountNumber);
        System.out.println("Owner: " + account.owner);
        System.out.println("Balance: " + account.balance);
        System.out.println("Interest Rate: " + account.interestRate);
        System.out.println("Account Type: " + account.accountType);
        System.out.println("Creation Date: " + account.creationDate);
    }
}
