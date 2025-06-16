// Defining a class named Student
public class StudentClass {
    // Attributes (Instance Variables)
    String name;
    int id;
    double gpa;

    // Constructor (Initializes attributes)
    public StudentClass(String studentName, int studentId, double studentGpa) {
        name = studentName;
        id = studentId;
        gpa = studentGpa;
    }

    // Method to display student details
    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("GPA: " + gpa);
    }

    // Main method to test the Student class
    public static void main(String[] args) {
        // Creating an object of the Student class
        StudentClass s1 = new StudentClass("Ali", 101, 3.8);
        s1.displayStudentInfo();
    }
}
