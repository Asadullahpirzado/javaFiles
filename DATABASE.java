import java.sql.*;

public class DATABASE {
    private static final String URL = "jdbc:mysql://localHost:3306/studentmanagement";
    private static final String USER = "root";
    private static final String PASSWORD = "asad";

    public static void addStudent(String firstName, String lastName, String email, String phone, String address, String department, String Batch, String GPA, String password) {
        String query = "INSERT INTO Student (FirstName, LastName, Email, PhoneNumber, Address ,Department, Batch, GPA , password)" +
                " VALUES ( ?, ?, ?, ?, ?, ?, ?, ? , ?)";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, firstName);
            pstmt.setString(2, lastName);
            pstmt.setString(3, email);
            pstmt.setString(4, phone);
            //  pstmt.setString(5, dob);
            pstmt.setString(5, address);
            pstmt.setString(6, department);
            pstmt.setString(7, Batch);
            pstmt.setString(8, GPA);
            pstmt.setString(9, password);

            pstmt.executeUpdate();
            System.out.println("✅ Student added successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
    public static void viewStudentInfo() {
        String sql = "SELECT * FROM Student ";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            ResultSet rs = pstmt.executeQuery(sql);

            if (rs.next()) {
                System.out.println("\n===== Student Information =====");
                System.out.println("🆔 Student ID: " + rs.getInt("StudentID"));
                System.out.println("👤 Name: " + rs.getString("FirstName") + " " + rs.getString("LastName"));
                System.out.println("📧 Email: " + rs.getString("Email"));
                System.out.println("📞 Phone: " + rs.getString("PhoneNumber"));
                System.out.println("📅 DOB: " + rs.getDate("DateOfBirth"));
                System.out.println("🏠 Address: " + rs.getString("Address"));
                System.out.println("🏫 Department: " + rs.getString("Department"));
                System.out.println("🎓 Batch: " + rs.getString("Batch"));
                System.out.println("📊 GPA: " + rs.getDouble("GPA"));
            } else {
                System.out.println("❌ Student not found!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


