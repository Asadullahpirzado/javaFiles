public class Preson {
    private String firstName;
    private String lastName;

    public Preson(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void displayDetails(){
        System.out.println("First Name :" + firstName );
        System.out.println("Last Name :" + lastName );
    }
}
