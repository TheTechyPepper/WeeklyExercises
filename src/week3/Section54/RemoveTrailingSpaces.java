package week3.Section54;

public class RemoveTrailingSpaces {
    public static String removeWhitespaces(String input) {
        return input.trim();
    }

    public static void main(String[] args) {
        System.out.println(removeWhitespaces("    Hello, World!   "));
        System.out.println(removeWhitespaces("     Welcome to Wedevx     "));
        System.out.println(removeWhitespaces("  This is a sentence with no whitespaces  "));
        System.out.println(removeWhitespaces(" Wedevx   is    awesome   "));
    }
}
