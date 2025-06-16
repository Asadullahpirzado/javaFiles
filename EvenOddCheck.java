import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        switch (num % 2) {
            case 0:
                System.out.println(num + " is an Even number.");
                break;
            case 1:
            case -1:

                System.out.println(num + " is an Odd number.");
                break;
            default:
                System.out.println("Invalid input!");
        }

        scanner.close();
    }
}
