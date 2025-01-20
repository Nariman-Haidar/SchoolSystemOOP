import java.util.Scanner;

public class Teacher extends User {
    private static Scanner sc = new Scanner(System.in);

    public Teacher(String username, String password, String role) {
        super(username, password, Role.TEACHER);
    }

    @Override
    public void menu() {
        boolean active = true;
        while (active) {
            System.out.println("\nTeacher Menu:");
            System.out.println("1. Create Course");
            System.out.println("2. Add Student to Course");
            System.out.println("3. List All Courses");
            System.out.println("4. Log out");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    createCourse();
                    break;
                case 2:
                    addStudentToCourse();
                    break;
                case 3:
                    listAllCourses();
                    break;
                case 4:
                    active = false;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }
    }

    private void createCourse() {
        System.out.println("Create course.");
    }

    private void addStudentToCourse() {
        System.out.println("Add student to course.");
    }

    private void listAllCourses() {
        System.out.println("List all courses.");
    }
}
