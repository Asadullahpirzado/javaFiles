public class Teacher extends Preson{
    private String subject;
    private double salary;

    public Teacher(String firstName, String lastName, String subject, double salary) {
        super(firstName, lastName);
        this.subject = subject;
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Subject :"+subject);
        System.out.println("Salary :"+salary);
    }
}
