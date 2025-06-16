import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class sqlFile {
    public static void main(String[] args) {
        String[] statuses = {"Enrolled", "Completed", "Dropped"};
        Random random = new Random();

        try (FileWriter writer = new FileWriter("EnrollmentData.sql")) {
            writer.write("INSERT INTO Enrollment (StudentID, CourseID, Status, Marks) VALUES\n");

            for (int studentID = 1; studentID <= 51; studentID++) {
                for (int courseID = 1; courseID <= 20; courseID++) {
                    String status = statuses[random.nextInt(statuses.length)];
                    int marks = random.nextInt(41) + 60; // Marks range: 60-100
                    writer.write(String.format("(%d, %d, '%s', %d),\n", studentID, courseID, status, marks));
                }
            }

            writer.write(";");
            System.out.println("SQL script generated successfully: EnrollmentData.sql");
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
}
