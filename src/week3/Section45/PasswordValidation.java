package week3.Section45;

public class PasswordValidation {
    public static void login(String username, String password) {
        if (username.isEmpty()) {
            System.out.println("Username is empty");
        } else if (password.isEmpty()) {
            System.out.println("Password is empty");
        } else if (username.equals("superstar") && password.equals("password123")) {
            System.out.println("Logging in");
        } else {
            System.out.println("Invalid credentials");
        }
    }


    public static void main(String[] args) {
        login("", "password123");
        login("superstar", "");
        login("superstar", "password123");
        login("superstar", "wrongpassword");
    }
}
