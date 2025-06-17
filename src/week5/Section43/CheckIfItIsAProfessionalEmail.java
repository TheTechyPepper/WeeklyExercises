package week5.Section43;

public class CheckIfItIsAProfessionalEmail {
    public static boolean isProfessionalEmail(String emailAddress) {
        return !emailAddress.contains("@gmail.com") &&
                !emailAddress.contains("@yahoo.com") &&
                !emailAddress.contains("@hotmail.com");
    }

    public static void main(String[] args) {
        boolean isEmailValid = isProfessionalEmail("QA_Automator@yahoo.com");
        System.out.println(isEmailValid);
    }
}
