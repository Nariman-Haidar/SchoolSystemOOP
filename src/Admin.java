import java.util.Scanner;

public class Admin extends User {
    private static Scanner sc = new Scanner(System.in);

    public Admin(String username, String password, String role) {
        super(username, password, Role.ADMIN);
    }

    @Override
    public void menu() {
        boolean active = true;
        while (active) {
            System.out.println("\nAdmin Menu:");
            System.out.println("1. Create User");
            System.out.println("2. Move Student");
            System.out.println("3. Remove Student");
            System.out.println("4. Log out");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    createUser();
                    break;
                case 2:
                    moveStudent();
                    break;
                case 3:
                    removeStudent();
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

    private void createUser() {
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();
        System.out.print("Enter role (ADMIN/TEACHER/STUDENT): ");
        String role = sc.nextLine();
        UserDatabase db = new UserDatabase();
        switch (role.toUpperCase()) {
            case "ADMIN":
                db.users.add(new Admin(username, password, role));
                break;
            case "TEACHER":
                db.users.add(new Teacher(username, password, role));
                break;
            case "STUDENT":
                db.users.add(new Student(username, password, role));
                break;
            default:
                System.out.println("Invalid role.");
                break;
        }
        System.out.println("User created successfully.");
    }

    private void moveStudent() {
        System.out.println("Move student functionality.");
    }

    private void removeStudent() {
        System.out.print("Enter student username to remove: ");
        String username = sc.nextLine();
        UserDatabase db = new UserDatabase();
        db.users.removeIf(user -> user.username.equals(username) && user.role == Role.STUDENT);
        System.out.println("Student removed successfully.");
    }
}

