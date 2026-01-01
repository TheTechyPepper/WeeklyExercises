package week3.Section52;

public class ExtractFirstNamefromFullName {
    public static String extractFirstName(String fullName) {
        int indexOfSpace = fullName.indexOf(" ");
        return fullName.substring(0, indexOfSpace);
    }

    public static void main(String[] args) {
        System.out.println(extractFirstName("John"));
    }
}
