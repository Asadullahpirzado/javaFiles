public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String name, String cnic, double weeklySalary) {
        super(name, cnic);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double earning() {
        if(getWeeklySalary()>0)
        return super.earning();
        else
            return 0.0;
    }

    @Override
    public String toString() {
        return  super.toString() + earning();
    }
}
