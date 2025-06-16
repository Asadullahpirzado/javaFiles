public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;
    public CommissionEmployee() {
        //  super(null, null);
    }
    public CommissionEmployee(String name, String cnic, double grossSales, double commissionRate) {
        super(name, cnic);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }



    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public double earning() {
        if (getCommissionRate()*getGrossSales()>0)
            return getGrossSales()*getCommissionRate();
        else
            return 0.0;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
