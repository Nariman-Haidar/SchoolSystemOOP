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