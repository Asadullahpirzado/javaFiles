import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Employee Name: ");
        employee.name = input.next();
        System.out.println("Enter Employee ID: ");
        employee.id = input.next();
        System.out.println("Enter Department: ");
        employee.department = input.next();
        System.out.println("Enter Salary: ");
        employee.salary = input.nextDouble();
        System.out.println("Enter Hire Date: ");
        employee.hireDate = input.next();
        System.out.println("Enter Position: ");
        employee.position = input.next();
        System.out.println("Enter Manager Name: ");
        employee.manager = input.next();

        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + employee.name);
        System.out.println("ID: " + employee.id);
        System.out.println("Department: " + employee.department);
        System.out.println("Salary: " + employee.salary);
        System.out.println("Hire Date: " + employee.hireDate);
        System.out.println("Position: " + employee.position);
        System.out.println("Manager: " + employee.manager);
    }
}
