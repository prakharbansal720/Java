import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateDatabase {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String user = "root";  // Change to your MySQL username
        String password = "1234";  // Change to your MySQL password

        try {
            // Load MySQL JDBC Driver (Not needed for Java 8+)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish Connection
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to MySQL database successfully!");

            // Close Connection
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database connection error!");
            e.printStackTrace();
        }
    }
}
