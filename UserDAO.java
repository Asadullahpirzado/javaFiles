import java.sql.*;

public class UserDAO {
    public void createUser(String name, String email, String password, String userMode) throws SQLException {
        String sql = "INSERT INTO Users (name, email, password_hash, user_mode) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setString(3, password);
            stmt.setString(4, userMode);
            stmt.executeUpdate();
        }
    }

    public User getUserByEmail(String email) throws SQLException {
        String sql = "SELECT * FROM Users WHERE email = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, email);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new User(rs.getInt("user_id"), rs.getString("name"), rs.getString("email"),
                            rs.getString("password"), rs.getString("user_mode"));
                }
            }
        }
        return null;
    }
}
