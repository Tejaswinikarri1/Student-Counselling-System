public class Counselor {
    private String name, counselorId, email;

    public Counselor(String name, String counselorId, String email) {
        this.name = name;
        this.counselorId = counselorId;
        this.email = email;
    }

    public String getName() {
        return name; // Getter for name
    }

    public void displayInfo() {
        System.out.println("Counselor Name: " + name);
        System.out.println("Counselor ID: " + counselorId);
        System.out.println("Email: " + email);
    }
}
