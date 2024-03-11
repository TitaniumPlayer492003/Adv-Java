import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {
    public static void main(String[] args) {
        // SQLite connection string
        String url = "jdbc:sqlite:/path/to/your/database.db";
        
        // SQL statement to update data
        String sql = "UPDATE your_table_name SET column1 = ?, column2 = ? WHERE condition;";

        try (Connection conn = DriverManager.getConnection(url);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            // Set new values for columns
            pstmt.setString(1, "new_value_for_column1");
            pstmt.setString(2, "new_value_for_column2");

            // Set condition to identify the rows to update
            // For example, if you want to update a row where the id is 1:
            // pstmt.setInt(3, 1);
            
            // Execute the update statement
            pstmt.executeUpdate();
            
            System.out.println("Data updated successfully!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}