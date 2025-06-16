import java.util.Random;
import java.util.Scanner;

public class Lab3_6 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int num = rand.nextInt(2);
        int num1;
        char c;
        do {

            System.out.println("Enter the number  0 and 1 ");
            num1= input.nextInt();
            if(num==num1)
                System.out.println("You win");
            else
                System.out.println("Sorry try again");
            System.out.println("You want play again Y and n");
            c=input.next().charAt(0);


        }while (c=='y');

    }
}
