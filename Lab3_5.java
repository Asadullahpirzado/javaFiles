import java.util.Scanner;

import static java.lang.StrictMath.round;

public class Lab3_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        var num1=input.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();
        double result = num1/num2;
        System.out.println(round(result));


        input.close();
    }
}
