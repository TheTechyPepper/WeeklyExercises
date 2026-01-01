package week3.Section47;

public class LoginCredentials {
    public static boolean checkCredentials(String username, String password) {
        if (username.equalsIgnoreCase("Superstar") & password.equals("Hardpassword!")) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean checkLoginInfo = checkCredentials("Superstar", "Hardpassword!");
        System.out.println(checkLoginInfo);

        boolean checkLoginInfo2 = checkCredentials("superstar", "Hardpassword!");
        System.out.println(checkLoginInfo2);

        boolean checkLoginInfo3 = checkCredentials("Superstar", "hardpassword!");
        System.out.println(checkLoginInfo3);

        boolean checkLoginInfo4 = checkCredentials("johnsmith", "Hardpassword!");
        System.out.println(checkLoginInfo4);
    }
}