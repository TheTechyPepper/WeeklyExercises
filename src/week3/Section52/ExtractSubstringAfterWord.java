package week3.Section52;

public class ExtractSubstringAfterWord {
    public static String extractSubstringAfterWord(String sentence, String extractedSubstring) {
        int substringWord = sentence.indexOf(extractedSubstring);
        if (substringWord == -1) {
            return "";
        } else {
            return sentence.substring(substringWord + extractedSubstring.length());
        }
    }

    public static void main(String[] args) {
        System.out.println(extractSubstringAfterWord("I love programming and coding", "programming"));
    }
}
       
