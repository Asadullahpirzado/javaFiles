import java.util.Scanner;

public class Lab2_2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String fullName= input.nextLine();
        String[] words = fullName.split(" ");
        System.out.println("Your Full name is "+fullName);
        for(String word : words){
            System.out.print(word.charAt(0) +" ");
        }
    }
}
