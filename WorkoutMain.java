import java.util.Scanner;

public class WorkoutMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Workout workout = new Workout();

        System.out.print("Enter Workout Type: ");
        workout.type = input.next();
        System.out.print("Enter Duration (in minutes): ");
        workout.duration = input.nextInt();
        System.out.print("Enter Calories Burned: ");
        workout.caloriesBurned = input.nextInt();
        System.out.print("Enter Exercises: ");
        input.nextLine();
        workout.exercises = input.nextLine();
        System.out.print("Enter Difficulty Level: ");
        workout.difficulty = input.next();
        System.out.print("Enter Target Muscle Groups: ");
        input.nextLine();
        workout.targetMuscleGroups = input.nextLine();
        System.out.print("Enter Equipment Needed: ");
        workout.equipment = input.nextLine();

        System.out.println("\nWorkout Details:");
        System.out.println("Type: " + workout.type);
        System.out.println("Duration: " + workout.duration + " minutes");
        System.out.println("Calories Burned: " + workout.caloriesBurned);
        System.out.println("Exercises: " + workout.exercises);
        System.out.println("Difficulty: " + workout.difficulty);
        System.out.println("Target Muscle Groups: " + workout.targetMuscleGroups);
        System.out.println("Equipment: " + workout.equipment);
    }
}
