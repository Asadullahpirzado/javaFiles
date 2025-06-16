import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Library Name: ");
        library.name = input.next();
        System.out.println("Enter Address: ");
        library.address = input.next();
        System.out.println("Enter Book Count: ");
        library.bookCount = input.nextInt();
        System.out.println("Enter Number of Members: ");
        library.members = input.nextInt();
        System.out.println("Enter Opening Hours: ");
        library.openingHours = input.next();
        System.out.println("Enter Number of Staff: ");
        library.staff = input.nextInt();
        System.out.println("Enter Founding Year: ");
        library.foundingYear = input.nextInt();

        System.out.println("\nLibrary Details:");
        System.out.println("Name: " + library.name);
        System.out.println("Address: " + library.address);
        System.out.println("Book Count: " + library.bookCount);
        System.out.println("Members: " + library.members);
        System.out.println("Opening Hours: " + library.openingHours);
        System.out.println("Staff: " + library.staff);
        System.out.println("Founding Year: " + library.foundingYear);
    }
}
