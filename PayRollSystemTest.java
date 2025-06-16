public class PayRollSystemTest {
    public static void main(String[] args) {
        Employee firstEmployee = new SalariedEmployee("Muhammad", "Ali",  800.00);
                Employee secondEmployee = new CommissionEmployee("Tarwan", "6435745", 10000, 0.06);
        Employee thirdEmployee = new BasePlusCommissionEmployee("Fabeeha", "4645776",  5000, 0.04, 300);
        Employee fourthEmployee = new HourlyEmployee("Hasnain", "47446867", 16.75, 40);
// polymorphism: calling toString() and earning() on Employee’s reference
                System.out.println(firstEmployee);
        System.out.println(firstEmployee.earning());
        System.out.println(secondEmployee);
        System.out.println(secondEmployee.earning());
        System.out.println(thirdEmployee);
        BasePlusCommissionEmployee currentEmployee =
                (BasePlusCommissionEmployee) thirdEmployee;
        double oldBaseSalary = currentEmployee.getBaseSalary();
        System.out.println("old base salary: " + oldBaseSalary);
        currentEmployee.setBaseSalary(1.10 * oldBaseSalary);
        System.out.println("new base salary with 10% increase is:" +
                currentEmployee.getBaseSalary());
        System.out.println(thirdEmployee.earning());
        System.out.println(fourthEmployee);
        System.out.println(fourthEmployee.earning());
    } // end main
}