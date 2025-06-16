import java.util.Scanner;

public class CourseMain {
    public static void main(String[] args) {
        Course course = new Course();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Course Name: ");
        course.name = input.next();
        System.out.println("Enter Course Code: ");
        course.code = input.next();
        System.out.println("Enter Department: ");
        course.department = input.next();
        System.out.println("Enter Instructor: ");
        course.instructor = input.next();
        System.out.println("Enter Credits: ");
        course.credits = input.nextInt();
        System.out.println("Enter Prerequisite: ");
        course.prerequisite = input.next();
        System.out.println("Enter Semester: ");
        course.semester = input.next();

        System.out.println("\nCourse Details:");
        System.out.println("Name: " + course.name);
        System.out.println("Code: " + course.code);
        System.out.println("Department: " + course.department);
        System.out.println("Instructor: " + course.instructor);
        System.out.println("Credits: " + course.credits);
        System.out.println("Prerequisite: " + course.prerequisite);
        System.out.println("Semester: " + course.semester);
    }
}
