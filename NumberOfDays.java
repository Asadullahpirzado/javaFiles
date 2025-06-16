import java.util.Calendar;
import java.util.Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calendar in = Calendar.getInstance();

        System.out.println("Enter the number 1 to 30 ");
        int num = input.nextInt();
        switch (num){
            case 3,10,17,24 :
                System.out.println("In 2025 mArch this day is Monday ");
                break;
            case 4, 11, 18 ,25 :
                System.out.println("In 2025 mArch this day is Tuesady ");
        }
    }
}
