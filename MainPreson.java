public class MainPreson {
    public static void main(String[] args) {
        // Create two Student objects
        Student student1 = new Student("John", "Doe", "1001", "Computer Science", "Dr. Smith");
        Student student2 = new Student("Jane", "Smith", "1002", "Mathematics", "Prof. Johnson");

        // Create two Teacher objects
        Teacher teacher1 = new Teacher("Mary", "Johnson", "Physics", 75000.00);
        Teacher teacher2 = new Teacher("Robert", "Brown", "English", 82000.00);

        // Display details for each object
        System.out.println("Student 1 Details:");
        student1.displayDetails();
        System.out.println();

        System.out.println("Student 2 Details:");
        student2.displayDetails();
        System.out.println();

        System.out.println("Teacher 1 Details:");
        teacher1.displayDetails();
        System.out.println();

        System.out.println("Teacher 2 Details:");
        teacher2.displayDetails();
    }
}
