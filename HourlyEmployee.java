public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;


    public HourlyEmployee() {
        super(null,null);
        this.wage = 0.0;
        this.hours = 0.0;
    }

    public HourlyEmployee(String name, String cnic, double wage, double hours) {
        super(name,cnic);
        setWage(wage);
        setHours(hours);
    }

    public void setWage(double wage) {
        if (wage >= 0.0) {
            this.wage = wage;
        } else {
            System.out.println("Wage cannot be negative.");
            this.wage = 0.0;
        }
    }

    public void setHours(double hours) {
        if (hours >= 0.0) {
            this.hours = hours;
        } else {
            System.out.println("Hours cannot be negative.");
            this.hours = 0.0;
        }
    }

    public double getWage() {
        return wage;
    }

    public double getHours() {
        return hours;
    }

    // Override toString
    @Override
    public String toString() {
        return "\nHourly employee: " + super.toString() +
                "\nWage: " + wage +
                "\nHours worked: " + hours;
    }

    // Override earnings
    @Override
    public double earning() {
        if (hours <= 40) {
            return wage * hours;
        } else {
            return 40 * wage + (hours - 40) * wage * 1.5;
        }
    }
}
