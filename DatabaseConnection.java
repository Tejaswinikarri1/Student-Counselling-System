import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    
    // Database URL, username, and password
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/counseling_system"; // Change if your DB name or connection details are different
    private static final String USER = "root"; // Your MySQL username
    private static final String PASSWORD = "12345"; // Your MySQL password
    
    public static Connection connect() {
        Connection connection = null;
        
        try {
            // Load and register MySQL JDBC driver (Class.forName may be optional with newer versions of MySQL connector)
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish the connection to the database
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connection to MySQL has been established successfully.");
            
        } catch (SQLException e) {
            System.err.println("SQL Exception: Unable to connect to database.");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found.");
            e.printStackTrace();
        }
        
        return connection;
    }
    
    public static void main(String[] args) {
        // Try to connect to the database
        connect();
    }
}
