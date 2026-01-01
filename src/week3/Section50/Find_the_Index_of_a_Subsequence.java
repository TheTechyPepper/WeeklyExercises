package week3.Section50;

public class Find_the_Index_of_a_Subsequence {
    public static int findSubsequenceIndex(String input, String subsequence, int startIndex) {
        return input.indexOf(subsequence, startIndex);
    }

    public static void main(String[] args) {
        System.out.println(findSubsequenceIndex("Hello World!", "l", 5));
    }
}
