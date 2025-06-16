import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first name: ");
        String firstName=in.next();
        System.out.println("Enter the last name: ");
        String lastName=in.next();
        System.out.println(firstName+" "+lastName);
    }
}
