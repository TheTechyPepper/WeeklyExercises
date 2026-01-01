package week3.Section54;

public class WhitespaceCounter {
    public static int countWhitespaces(String sentence) {
        // Step 1: Remove leading and trailing spaces
        String trimmedSentence = sentence.trim();

        // Step 2: Length before removing spaces
        int originalLength = trimmedSentence.length();

        // Step 3: Remove all space characters
        String withoutSpaces = trimmedSentence.replace(" ", "");

        // Step 4: Length after removing spaces
        int newLength = withoutSpaces.length();

        // Step 5: Difference = total spaces
        return originalLength - newLength;
    }

    public static void main(String[] args) {
        System.out.println(countWhitespaces("      There are many spaces here.  "));
    }
}