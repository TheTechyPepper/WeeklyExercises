package week3.Section53;

public class ToUpperCase {
    public static String convertToUpperCase(String sentence) {
        return sentence.toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(convertToUpperCase("Hello, World!"));
        System.out.println(convertToUpperCase("Java is fun"));
        System.out.println(convertToUpperCase("1 2 3 GO!"));
    }
}
