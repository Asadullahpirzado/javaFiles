import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {
        User account = new User();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Username: ");
        account.username = input.next();
        System.out.println("Enter Email: ");
        account.email = input.next();
        System.out.println("Enter Password: ");
        account.password = input.next();
        System.out.println("Enter Account Creation Date: ");
        account.creationDate = input.next();
        System.out.println("Enter Last Login Date: ");
        account.lastLogin = input.next();
        System.out.println("Enter Profile Picture URL: ");
        account.profilePicture = input.next();
        System.out.println("Enter Account Status (Active/Inactive): ");
        account.status = input.next();

        System.out.println("\nUser Details:");
        System.out.println("Username: " + account.username);
        System.out.println("Email: " + account.email);
        System.out.println("Creation Date: " + account.creationDate);
        System.out.println("Last Login: " + account.lastLogin);
        System.out.println("Profile Picture: " + account.profilePicture);
        System.out.println("Status: " + account.status);
    }
}
