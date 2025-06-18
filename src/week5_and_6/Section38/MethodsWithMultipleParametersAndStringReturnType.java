package week5_and_6.Section38;

public class MethodsWithMultipleParametersAndStringReturnType {
    public static void main(String[] args) {
        String str = login("Temetrius@automation.com", "Hello123");
        System.out.println(str);

        String str2 = login("hello@wedvx.co", "ABC123$$");
        System.out.println(str2);

    }

    public static String login(String username, String password) {
        if (username.equals("hello@wedvx.co") && password.equals("ABC123$$")) {
            return "Welcome " + username;
        }
        else {
            return "Invalid username or password";
        }
    }
}
