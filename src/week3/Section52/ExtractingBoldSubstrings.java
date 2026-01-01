package week3.Section52;

public class ExtractingBoldSubstrings {
    public static String extractBoldSubstrings(String input) {


        int firstIndex = input.indexOf("**");//8
        int lastIndex = input.lastIndexOf("**");//14

        if(firstIndex != lastIndex) {
            return input.substring((firstIndex + 2), lastIndex);
        }
        else {
            return "";
        }
    }

    public static void main(String[] args) {
        System.out.println(extractBoldSubstrings("This is **bold** text"));
        System.out.println(extractBoldSubstrings("This is not *bold* text"));
    }
}
