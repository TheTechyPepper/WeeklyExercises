package week3.Section46;

public class LastCharacter {
    public static char getLastCharacter(String strWord) {
        if (strWord.isEmpty()) {
            return '?';
        } else {
            return strWord.charAt(strWord.length()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(getLastCharacter("Superstar"));
        System.out.println(getLastCharacter("wedevx"));
        System.out.println(getLastCharacter(""));
        System.out.println(getLastCharacter("A"));

    }
}
