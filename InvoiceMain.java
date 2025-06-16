import java.util.Scanner;

public class InvoiceMain {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Invoice Number: ");
        invoice.number = input.next();
        System.out.println("Enter Customer Name: ");
        invoice.customer = input.next();
        System.out.println("Enter Amount: ");
        invoice.amount = input.nextDouble();
        System.out.println("Enter Issue Date: ");
        invoice.issueDate = input.next();
        System.out.println("Enter Due Date: ");
        invoice.dueDate = input.next();
        System.out.println("Enter Items: ");
        invoice.items = input.next();
        System.out.println("Enter Payment Status: ");
        invoice.paymentStatus = input.next();

        System.out.println("\nInvoice Details:");
        System.out.println("Number: " + invoice.number);
        System.out.println("Customer: " + invoice.customer);
        System.out.println("Amount: $" + invoice.amount);
        System.out.println("Issue Date: " + invoice.issueDate);
        System.out.println("Due Date: " + invoice.dueDate);
        System.out.println("Items: " + invoice.items);
        System.out.println("Payment Status: " + invoice.paymentStatus);
    }
}
