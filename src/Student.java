public class Student extends User {
    public Student(String username, String password, String role) {
        super(username, password, Role.STUDENT);
    }

    @Override
    public void menu() {
        System.out.println("Student Menu.");
    }
}

