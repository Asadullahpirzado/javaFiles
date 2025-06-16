public class EmployeeDemo {
    // Employee class
    static class Employee {
        private String employeeID;
        private String name;
        private String position;
        private double salary;

        // Constructor
        public Employee(String employeeID, String name, String position, double salary) {
            this.employeeID = employeeID;
            this.name = name;
            this.position = position;
            this.salary = salary >= 0 ? salary : 0; // Ensure salary is non-negative
        }

        // Getters and setters
        public String getEmployeeID() { return employeeID; }
        public void setEmployeeID(String employeeID) { this.employeeID = employeeID; }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public String getPosition() { return position; }
        public void setPosition(String position) { this.position = position; }
        public double getSalary() { return salary; }
        public void setSalary(double salary) { this.salary = salary >= 0 ? salary : 0; }

        // Static method to promote employee
        public static Employee promoteEmployee(Employee employee, String newPosition) {
            if (employee == null || newPosition == null || newPosition.trim().isEmpty()) {
                System.out.println("Error: Invalid employee or position.");
                return null;
            }
            return new Employee(employee.getEmployeeID(), employee.getName(), newPosition, employee.getSalary());
        }

        // Static method to calculate bonus
        public static Employee calculateBonus(Employee employee, double bonusPercentage) {
            if (employee == null || bonusPercentage < 0 || bonusPercentage > 100) {
                System.out.println("Error: Invalid employee or bonus percentage.");
                return null;
            }
            double bonusAmount = employee.getSalary() * (bonusPercentage / 100);
            double newSalary = employee.getSalary() + bonusAmount;
            return new Employee(employee.getEmployeeID(), employee.getName(), employee.getPosition(), newSalary);
        }

        // toString method for easy printing
        @Override
        public String toString() {
            return "Employee{ID: " + employeeID + ", Name: " + name + ", Position: " + position + ", Salary: $" + salary + "}";
        }
    }

    // Main method to test the classes
    public static void main(String[] args) {
        // Create an initial employee
        Employee emp = new Employee("E001", "John Doe", "Developer", 50000.0);

        // Display initial employee details
        System.out.println("Employee Management at 04:02 PM PKT, Tuesday, May 20, 2025:\n");
        System.out.println("Initial Employee: " + emp);
        System.out.println();

        // Promote the employee
        Employee promotedEmp = Employee.promoteEmployee(emp, "Senior Developer");
        if (promotedEmp != null) {
            System.out.println("After Promotion: " + promotedEmp);
        }
        System.out.println();

        // Calculate bonus
        Employee bonusEmp = Employee.calculateBonus(promotedEmp, 10.0); // 10% bonus
        if (bonusEmp != null) {
            System.out.println("After 10% Bonus: " + bonusEmp);
        }

        // Test with invalid inputs
        System.out.println("\nTesting invalid cases:");
        Employee invalidPromotion = Employee.promoteEmployee(null, "Manager");
        Employee invalidBonus = Employee.calculateBonus(emp, -5.0);
    }
}