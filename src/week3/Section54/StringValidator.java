package week3.Section54;

public class StringValidator {
    public static boolean validateString(String input) {
        if (input.trim().length() == input.length()) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(validateString("Hello World!"));
        System.out.println(validateString(" Hello World!"));
    }
}
