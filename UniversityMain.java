import java.util.Scanner;

public class UniversityMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        University university = new University();

        System.out.print("Enter University Name: ");
        university.name = input.nextLine();
        System.out.print("Enter Location: ");
        university.location = input.nextLine();
        System.out.print("Enter Founding Year: ");
        university.foundingYear = input.nextInt();
        System.out.print("Enter Enrollment: ");
        university.enrollment = input.nextInt();
        input.nextLine();
        System.out.print("Enter Departments: ");
        university.departments = input.nextLine();
        System.out.print("Enter Ranking: ");
        university.ranking = input.nextInt();
        System.out.print("Enter Tuition Fee: ");
        university.tuition = input.nextDouble();

        System.out.println("\nUniversity Details:");
        System.out.println("Name: " + university.name);
        System.out.println("Location: " + university.location);
        System.out.println("Founding Year: " + university.foundingYear);
        System.out.println("Enrollment: " + university.enrollment);
        System.out.println("Departments: " + university.departments);
        System.out.println("Ranking: " + university.ranking);
        System.out.println("Tuition Fee: $" + university.tuition);
    }
}
