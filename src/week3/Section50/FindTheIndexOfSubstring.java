package week3.Section50;

public class FindTheIndexOfSubstring {
    public static int findSubstringIndex(String input, String str) {
        return input.indexOf(str);
    }

    public static void main(String[] args) {
        System.out.println(findSubstringIndex("Hello World!", " world"));
    }
}
