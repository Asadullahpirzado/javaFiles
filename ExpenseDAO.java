import java.sql.*;

public class ExpenseDAO {

    // Method to add an expense
    public void addExpense(int userId, int categoryId, double amount, String description, Timestamp expenseDate) throws SQLException {
        String sql = "INSERT INTO Expenses (user_id, category_id, amount, description, expense_date) VALUES (?, ?, ?, ?, ?)";

        // Ensure proper database connection and query execution
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, userId);
            stmt.setInt(2, categoryId);
            stmt.setDouble(3, amount);
            stmt.setString(4, description);
            stmt.setTimestamp(5, expenseDate);

            // Execute the update query
            stmt.executeUpdate();
        } catch (SQLException ex) {
            // Handle any SQL exceptions here (e.g., log the error)
            ex.printStackTrace();
            throw new SQLException("Error while adding expense", ex);
        }
    }

    // Method to get category ID by category name
    public int getCategoryId(String categoryName) throws SQLException {
        String sql = "SELECT category_id FROM Categories WHERE name = ?";

        // Using try-with-resources to automatically close resources
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, categoryName);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("category_id");
                } else {
                    // Return -1 if category is not found
                    return -1;
                }
            }
        } catch (SQLException ex) {
            // Handle SQL exception (e.g., log the error)
            ex.printStackTrace();
            throw new SQLException("Error while retrieving category ID", ex);
        }
    }
}
