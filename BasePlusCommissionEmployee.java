public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee() {

    }

    public BasePlusCommissionEmployee(String name, String cnic, double grossSales, double commissionRate, double baseSalary) {
        super(name, cnic, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public double earnings( ) {
        return baseSalary + super.earning();
    }
    public String toString( ) {
        return "\nBase plus Commission employee: " + super.toString();
    }

}
