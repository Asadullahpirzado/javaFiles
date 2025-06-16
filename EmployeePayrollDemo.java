public class EmployeePayrollDemo {
    // Step 1: Define Employee Class
    static class Employee {
        private String firstName;
        private String lastName;
        private String CNIC;

        // Default constructor
        public Employee() {
            this.firstName = "";
            this.lastName = "";
            this.CNIC = "";
        }

        // Parameterized constructor
        public Employee(String firstName, String lastName, String CNIC) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.CNIC = CNIC;
        }

        // Getters and setters
        public String getFirstName() { return firstName; }
        public void setFirstName(String firstName) { this.firstName = firstName; }
        public String getLastName() { return lastName; }
        public void setLastName(String lastName) { this.lastName = lastName; }
        public String getCNIC() { return CNIC; }
        public void setCNIC(String CNIC) { this.CNIC = CNIC; }

        // Override toString method
        @Override
        public String toString() {
            return "Employee: " + firstName + " " + lastName + " (CNIC: " + CNIC + ")";
        }

        // earnings method (default implementation)
        public double earnings() {
            return 0.0;
        }
    }

    // Step 2: Define SalariedEmployee Class
    static class SalariedEmployee extends Employee {
        private double weeklySalary;

        public SalariedEmployee(String firstName, String lastName, String CNIC, double weeklySalary) {
            super(firstName, lastName, CNIC);
            setWeeklySalary(weeklySalary); // Use setter for validation
        }

        // Getter and setter
        public double getWeeklySalary() { return weeklySalary; }
        public void setWeeklySalary(double weeklySalary) {
            if (weeklySalary >= 0.0) {
                this.weeklySalary = weeklySalary;
            }
        }

        // Override toString method
        @Override
        public String toString() {
            return "Salaried " + super.toString() + ", Weekly Salary: $" + weeklySalary;
        }

        // Override earnings method
        @Override
        public double earnings() {
            return weeklySalary;
        }
    }

    // Step 3: Define HourlyEmployee Class
    static class HourlyEmployee extends Employee {
        private double wage;
        private double hours;

        public HourlyEmployee(String firstName, String lastName, String CNIC, double wage, double hours) {
            super(firstName, lastName, CNIC);
            setWage(wage);
            setHours(hours); // Use setters for validation
        }

        // Getters and setters
        public double getWage() { return wage; }
        public void setWage(double wage) {
            if (wage >= 0.0) {
                this.wage = wage;
            }
        }

        public double getHours() { return hours; }
        public void setHours(double hours) {
            if (hours >= 0.0 && hours <= 168.0) { // Assuming max 168 hours per week
                this.hours = hours;
            }
        }

        // Override toString method
        @Override
        public String toString() {
            return "Hourly " + super.toString() + ", Wage: $" + wage + ", Hours: " + hours;
        }

        // Override earnings method
        @Override
        public double earnings() {
            if (hours <= 40) {
                return wage * hours;
            } else {
                return 40 * wage + (hours - 40) * wage * 1.5;
            }
        }
    }

    // Step 4: Define CommissionEmployee Class
    static class CommissionEmployee extends Employee {
        private double grossSales;
        private double commissionRate;

        public CommissionEmployee(String firstName, String lastName, String CNIC, double grossSales, double commissionRate) {
            super(firstName, lastName, CNIC);
            setGrossSales(grossSales);
            setCommissionRate(commissionRate); // Use setters for validation
        }

        // Getters and setters
        public double getGrossSales() { return grossSales; }
        public void setGrossSales(double grossSales) {
            if (grossSales >= 0.0) {
                this.grossSales = grossSales;
            }
        }

        public double getCommissionRate() { return commissionRate; }
        public void setCommissionRate(double commissionRate) {
            if (commissionRate > 0.0 && commissionRate <= 1.0) {
                this.commissionRate = commissionRate;
            }
        }

        // Override toString method
        @Override
        public String toString() {
            return "Commission " + super.toString() + ", Gross Sales: $" + grossSales + ", Commission Rate: " + (commissionRate * 100) + "%";
        }

        // Override earnings method
        @Override
        public double earnings() {
            return grossSales * commissionRate;
        }
    }

    // Step 4 (continued): Define BasePlusCommissionEmployee Class
    static class BasePlusCommissionEmployee extends CommissionEmployee {
        private double baseSalary;

        public BasePlusCommissionEmployee(String firstName, String lastName, String CNIC, double grossSales, double commissionRate, double baseSalary) {
            super(firstName, lastName, CNIC, grossSales, commissionRate);
            setBaseSalary(baseSalary); // Use setter for validation
        }

        // Getter and setter
        public double getBaseSalary() { return baseSalary; }
        public void setBaseSalary(double baseSalary) {
            if (baseSalary >= 0.0) {
                this.baseSalary = baseSalary;
            }
        }

        // Override toString method
        @Override
        public String toString() {
            return "BasePlus " + super.toString() + ", Base Salary: $" + baseSalary;
        }

        // Override earnings method
        @Override
        public double earnings() {
            return super.earnings() + baseSalary;
        }
    }

    // Main method to test the classes
    public static void main(String[] args) {
        // Create instances of different employee types
        Employee[] employees = new Employee[4];
        employees[0] = new SalariedEmployee("John", "Doe", "12345", 1000.0);
        employees[1] = new HourlyEmployee("Jane", "Smith", "67890", 15.0, 45.0); // 5 overtime hours
        employees[2] = new CommissionEmployee("Bob", "Johnson", "11111", 5000.0, 0.1); // 10% commission
        employees[3] = new BasePlusCommissionEmployee("Alice", "Brown", "22222", 8000.0, 0.15, 500.0); // 15% commission + base

        // Display details and earnings for each employee
        System.out.println("Employee Payroll at 12:27 PM PKT, Tuesday, May 20, 2025:\n");
        for (Employee employee : employees) {
            System.out.println(employee.toString());
            System.out.println("Earnings: $" + employee.earnings() + "\n");
        }
    }
}