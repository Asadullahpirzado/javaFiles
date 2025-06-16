import java.util.Scanner;

public class Lab3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number one : ");
        var num1 =input.nextDouble();
        System.out.print("Enter the number two : ");
        var num2 =input.nextDouble();
        num1 = (int) num1*1000;
        num2 = (int) num2*1000;
        if (num1==num2){
            System.out.println("Numbers are same ");
        }else {
            System.out.println("numbers are different");
        }



        input.close();
    }
}
