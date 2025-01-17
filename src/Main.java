import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        login();

    }
    static User login(){
        UserDatabase db = new UserDatabase();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = in.nextLine();
        System.out.print("Enter password: ");
        String password = in.nextLine();
        for(User user: db.users){
            if (user.username.equals(username) && user.password.equals(password)){
                return user;
            }
        }
        return null;
    }
}