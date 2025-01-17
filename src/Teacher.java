public class Teacher extends User{
    public Teacher(String username, String password, String role) {
        super(username, password, Role.TEACHER);
    }

    @Override
    public void menu() {

    }
}
