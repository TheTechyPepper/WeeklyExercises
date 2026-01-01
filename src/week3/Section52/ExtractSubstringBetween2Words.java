package week3.Section52;

public class ExtractSubstringBetween2Words {

    public static String extractBetween2Words(String sentence, String startWord, String endWord) {
        int startIndex = sentence.indexOf(startWord);
        int endIndex = sentence.indexOf(endWord);

        // Case 1: Both words are missing
        if (startIndex == -1 && endIndex == -1) {
            return "Invalid input, starting word and ending words not found";
        }

        // Case 2: Starting word not found — return from beginning to endWord
        if (startIndex == -1 && endIndex != -1) {
            return sentence.substring(0, endIndex);
        }

        // Case 3: Ending word not found — return from startWord to end of string
        if (startIndex != -1 && endIndex == -1) {
            return sentence.substring(startIndex + startWord.length());
        }

        // Case 4: Both found — extract substring between them
        return sentence.substring(startIndex + startWord.length(), endIndex);
    }

    public static void main(String[] args) {
        System.out.println(extractBetween2Words("I like to eat pizza", "I", "pizza")); // " like to eat "
        System.out.println(extractBetween2Words("The cat in the hat", "cat", "hat")); // " in the "
        System.out.println(extractBetween2Words("The quick brown fox jumps over the lazy dog.", "quick", "over")); // " brown fox jumps "
        System.out.println(extractBetween2Words("Hello wedevx SDET Superstar", "wedevx", "astronaut")); // " SDET Superstar"
        System.out.println(extractBetween2Words("Hello wedevx SDET Superstar", "SpaceX", "SDET")); // "Hello wedevx "
        System.out.println(extractBetween2Words("No match here", "rocket", "moon")); // "Invalid input, starting word and ending words not found"
    }
}
