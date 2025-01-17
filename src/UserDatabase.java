import java.util.ArrayList;

public class UserDatabase {
    ArrayList<User> users = new ArrayList<>();

    public UserDatabase() {
        users.add(new Admin("Laila", "123", "Admin" ));
        users.add(new Admin("Salma", "123", "Admin" ));
        users.add(new Admin("Ali", "123", "Admin" ));
        users.add(new Teacher("Sami", "123", "Teacher"));
        users.add(new Teacher("Hain", "123", "Teacher"));
        users.add(new Teacher("Sara", "123", "Teacher"));
        users.add(new Student("Hiba", "123", "Student"));
        users.add(new Student("Rafi", "123", "Student"));
        users.add(new Student("stig", "123", "Student"));
        users.add(new Teacher("Malen", "123", "Student"));
        users.add(new Teacher("Lolo", "123", "Student"));
        users.add(new Teacher("Momo", "123", "Student"));
        users.add(new Student("Soso", "123", "Student"));
        users.add(new Student("Saso", "123", "Student"));
        users.add(new Student("Km", "123", "Student"));



    }
}
