public class Employee {
    private  String name;
    private  String cnic;

    public Employee() {
    }

    public Employee(String name, String cnic) {
        this.name = name;
        this.cnic = cnic;
    }


    public String getName() {
        return name;
    }

    public String getCnic() {
        return cnic;
    }
    public double earning(){
        return 0.0;
    }

    @Override
    public String toString() {
        return name + " "+ cnic;
    }
}
