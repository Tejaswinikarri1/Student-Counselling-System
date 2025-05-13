import java.util.Date;

public class Session {
    Student student;
    Counselor counselor;
    Date date;
    String feedback;

    public Session(Student student, Counselor counselor) {
        this.student = student;
        this.counselor = counselor;
        this.date = new Date();
        this.feedback = "No feedback yet";
    }

    public void addFeedback(String feedback) {
        this.feedback = feedback;
    }

    public void displaySessionDetails() {
        System.out.println("Session Date: " + date);
        System.out.println("Student: " + student.getName()); // Use getter
        System.out.println("Counselor: " + counselor.getName()); // Use getter
        System.out.println("Feedback: " + feedback);
        System.out.println("---------------");
    }
}
