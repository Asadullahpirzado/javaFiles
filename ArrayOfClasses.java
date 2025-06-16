import java.util.Scanner;

public class ArrayOfClasses {
    public static void main(String[] args) {
        String firstName;
        String lastName;
        int age;
        Scanner sc = new Scanner(System.in);
        StudentForArrsy[] students = new StudentForArrsy[3];
        for (int i = 0; i < 3; i++) {
            System.out.printf("Enter First Name: ");
            firstName = sc.nextLine();
            System.out.printf("Enter Last Name: ");
            lastName = sc.nextLine();
           // sc.nextLine();
            System.out.printf("Enter Age: ");
            age = sc.nextInt();
            sc.nextLine();

            students[i]= new StudentForArrsy(firstName, lastName, age);
        }
        for(StudentForArrsy s : students) {
            System.out.println(s.getFirstName() + " " + s.getLastName() + " " + s.getAge());

        }

    }
}
