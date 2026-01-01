package week3.Section52;

public class ExtractFirstNameFromFullname {
    public static String extractFirstName(String fullName) {
        int spaceIndex = fullName.indexOf(' ');

        return fullName.substring(0, spaceIndex);
    }

    public static void main(String[] args) {
        System.out.println(extractFirstName("John Doe"));
    }
}