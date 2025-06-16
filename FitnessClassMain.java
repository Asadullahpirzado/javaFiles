import java.util.Scanner;

public class FitnessClassMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FitnessClass fitnessClass = new FitnessClass();

        System.out.print("Enter Fitness Class Name: ");
        fitnessClass.name = input.nextLine();
        System.out.print("Enter Instructor Name: ");
        fitnessClass.instructor = input.nextLine();
        System.out.print("Enter Duration (minutes): ");
        fitnessClass.duration = input.nextInt();
        System.out.print("Enter Calories Burned: ");
        fitnessClass.caloriesBurned = input.nextInt();
        input.nextLine();
        System.out.print("Enter Difficulty Level: ");
        fitnessClass.difficulty = input.nextLine();
        System.out.print("Enter Equipment Needed: ");
        fitnessClass.equipment = input.nextLine();
        System.out.print("Enter Class Capacity: ");
        fitnessClass.capacity = input.nextInt();

        System.out.println("\nFitness Class Details:");
        System.out.println("Name: " + fitnessClass.name);
        System.out.println("Instructor: " + fitnessClass.instructor);
        System.out.println("Duration: " + fitnessClass.duration + " minutes");
        System.out.println("Calories Burned: " + fitnessClass.caloriesBurned);
        System.out.println("Difficulty: " + fitnessClass.difficulty);
        System.out.println("Equipment: " + fitnessClass.equipment);
        System.out.println("Capacity: " + fitnessClass.capacity);
    }
}
