public class Admin extends User {

    public Admin(String name, String password, String role) {
        super(name, password, Role.ADMIN);

    }

    @Override
    public void menu() {

    }
}
