public class Student {
    private String name, studentId, email;

    public Student(String name, String studentId, String email) {
        this.name = name;
        this.studentId = studentId;
        this.email = email;
    }

    public String getName() {
        return name; // Getter for name
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Email: " + email);
    }
}
