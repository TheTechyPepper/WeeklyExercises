package week5.Section43;

public class IsRightEmailDomain {
    public static boolean checkEmailDomain(String emailAddress) {
       return emailAddress.contains("devxschool.com")||
        emailAddress.contains("wedevx.co")||
        emailAddress.contains("wedevx.com");

    }

    public static void main(String[] args) {
        boolean doesEmailContain = checkEmailDomain("wedevx.com");
        System.out.println(doesEmailContain);
    }


}
