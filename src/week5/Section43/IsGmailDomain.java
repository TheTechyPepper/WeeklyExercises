package week5.Section43;

public class IsGmailDomain {
    public static boolean checkGmailDomain(String email ) {
        boolean doesContainGmail = email.contains("@gmail.com");
        return doesContainGmail;
    }

    public static void main(String[] args) {
        boolean isGmailAccount = checkGmailDomain("tcook@gmail.com");
        System.out.println(isGmailAccount);
    }
}
