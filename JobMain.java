import java.util.Scanner;

public class JobMain {
    public static void main(String[] args) {
        Job job = new Job();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Job Title: ");
        job.title = input.next();
        System.out.println("Enter Company Name: ");
        job.company = input.next();
        System.out.println("Enter Requirements: ");
        job.requirements = input.next();
        System.out.println("Enter Salary: ");
        job.salary = input.nextDouble();
        System.out.println("Enter Location: ");
        job.location = input.next();
        System.out.println("Enter Benefits: ");
        job.benefits = input.next();
        System.out.println("Enter Working Hours: ");
        job.workingHours = input.next();

        System.out.println("\nJob Details:");
        System.out.println("Title: " + job.title);
        System.out.println("Company: " + job.company);
        System.out.println("Requirements: " + job.requirements);
        System.out.println("Salary: $" + job.salary);
        System.out.println("Location: " + job.location);
        System.out.println("Benefits: " + job.benefits);
        System.out.println("Working Hours: " + job.workingHours);
    }
}
