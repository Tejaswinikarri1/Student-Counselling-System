import java.sql.*;

public class Main {

    public static void main(String[] args) {
        // Establish the connection to MySQL
        Connection connection = DatabaseConnection.connect();

        if (connection != null) {
            // Example of inserting a student
            DatabaseOperations.insertStudent(connection, "S124", "Amala", "Amala@example.com");

            // Example of inserting a counselor
            DatabaseOperations.insertCounselor(connection, "C456", "Dr. Rao", "rao@example.com");

            // Example of inserting a session
            DatabaseOperations.insertSession(connection, "S124", "C456", "2025-05-12 13:44:46", "Good!");

            // Example of querying all students
            System.out.println("Fetching all students...");
            DatabaseOperations.queryStudents(connection);

            // Example of querying all sessions
            System.out.println("Fetching all sessions...");
            DatabaseOperations.querySessions(connection);
        }
    }
}
