package week5_and_6.Section43;

public class ConcatTwoStrings {
    public static String concatWithSpace( String str1, String str2) {
        String finalString = str1.concat(" ").concat(str2);
        return finalString;
    }

    public static void main(String[] args) {
        String combineWords = concatWithSpace("Hello", "World");
        System.out.println(combineWords);
    }
}
