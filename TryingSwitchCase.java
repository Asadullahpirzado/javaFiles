import java.util.Scanner;

public class TryingSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the any number 1 to 7:  ");
        int num= input.nextInt();
       String DayName= switch (num){
         case 1->{
             yield "Monday";
         }
         case 2->{
             yield "Thusday";
         }
         case 3->{
             yield "W";
         }
         case 4->{
             yield "Thurday";
         }
         case 5->{
             yield "Friday";
         }
         case 6->{
             yield "saturday";
         }
         case 7->{
             yield "Sunday";
         }
           default -> {
             yield "Invalid";
           }
       };
        System.out.println(DayName);
    }
}
