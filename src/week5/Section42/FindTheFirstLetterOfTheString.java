package week5.Section42;



public class FindTheFirstLetterOfTheString {
    public static String findFirstLetter(String sentence) {
        char firstInitial = sentence.charAt(0);
        return "" + firstInitial;
    }

    public static void main(String[] args) {
        String initial = findFirstLetter("Hello World");
        System.out.println(initial);
    }
}
