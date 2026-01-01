package week3.Section46;

public class MiddleCharacter {
    public static String getMiddleChars(String str) {
        if (str.isEmpty()) {
            return "???";
        }
        if (str.length() <= 2) {
            return str;
        }

        String results = "";

        if (str.length() % 2 == 0) {
            results = "" + str.charAt((str.length() / 2) - 1) + str.charAt((str.length() / 2));
        }else {
            results = "" + str.charAt(str.length() / 2);
        }
        return results;
    }
}
