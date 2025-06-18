package week5_and_6.Section38;

public class ConcatenateTwoStrings {
    public static void main(String[] args) {
        String strAnswer = concatenateStrings("Hello", "World");
        System.out.println(strAnswer);
    }

    public static String concatenateStrings(String str1, String str2) {
        return (str1 + str2);
    }
}