import java.sql.*;

public class DatabaseOperations {

    // Method to insert a student
    public static void insertStudent(Connection connection, String studentId, String name, String email) {
        String query = "INSERT INTO students (student_id, name, email) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, studentId);
            stmt.setString(2, name);
            stmt.setString(3, email);
            stmt.executeUpdate();
            System.out.println("Student inserted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to insert a counselor
    public static void insertCounselor(Connection connection, String counselorId, String name, String email) {
        String query = "INSERT INTO counselors (counselor_id, name, email) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, counselorId);
            stmt.setString(2, name);
            stmt.setString(3, email);
            stmt.executeUpdate();
            System.out.println("Counselor inserted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to insert a session
    public static void insertSession(Connection connection, String studentId, String counselorId, String sessionDate, String feedback) {
        String query = "INSERT INTO sessions (student_id, counselor_id, session_date, feedback) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, studentId);
            stmt.setString(2, counselorId);
            stmt.setString(3, sessionDate);
            stmt.setString(4, feedback);
            stmt.executeUpdate();
            System.out.println("Session inserted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to query all students
    public static void queryStudents(Connection connection) {
        String query = "SELECT * FROM students";
        try (Statement stmt = connection.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println("Student ID: " + rs.getString("student_id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Email: " + rs.getString("email"));
                System.out.println("-------------------------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to query all sessions
    public static void querySessions(Connection connection) {
        String query = "SELECT * FROM sessions";
        try (Statement stmt = connection.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println("Session ID: " + rs.getInt("session_id"));
                System.out.println("Student ID: " + rs.getString("student_id"));
                System.out.println("Counselor ID: " + rs.getString("counselor_id"));
                System.out.println("Session Date: " + rs.getString("session_date"));
                System.out.println("Feedback: " + rs.getString("feedback"));
                System.out.println("-------------------------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
