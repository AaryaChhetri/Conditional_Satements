import java.util.Scanner;

public class Login_system {
    public static void main(String[] args) {
        System.out.println("Login");
        String required_username, required_password, username, password;
        required_username = "Aarya";
        required_password = "9803525288";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username:");
        username = sc.next();
        System.out.println("Enter your password:");
        password = sc.next();

        if(username == required_username){
            System.out.println("correct username");
        } else if (password == required_password) {
            System.out.println("correct password");
        }

        if(username == required_username && password == required_password){
            System.out.println("login successful");
        }

    }

}
