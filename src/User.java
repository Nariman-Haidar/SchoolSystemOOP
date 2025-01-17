import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Enum for Roles
enum Role {
    ADMIN, TEACHER, STUDENT
}

// Abstract Base Class
abstract class User {
    protected String username;
    protected String password;
    protected Role role;

    public User(String username, String password, Role role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    // Abstract method to display the menu
    public abstract void menu();
}