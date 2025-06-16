import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Student Name: ");
        student.name = input.next();
        System.out.println("Enter Student ID: ");
        student.id = input.next();
        System.out.println("Enter Grade: ");
        student.grade = input.next();
        System.out.println("Enter Major: ");
        student.major = input.next();
        System.out.println("Enter GPA: ");
        student.gpa = input.nextDouble();
        System.out.println("Enter Enrollment Date: ");
        student.enrollmentDate = input.next();
        System.out.println("Enter Graduation Year: ");
        student.graduationYear = input.nextInt();

        System.out.println("\nStudent Details:");
        System.out.println("Name: " + student.name);
        System.out.println("ID: " + student.id);
        System.out.println("Grade: " + student.grade);
        System.out.println("Major: " + student.major);
        System.out.println("GPA: " + student.gpa);
        System.out.println("Enrollment Date: " + student.enrollmentDate);
        System.out.println("Graduation Year: " + student.graduationYear);
    }
}
