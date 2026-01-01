package week3.Section53;

public class GetUserInitials {
    public static String getUserInitials(String name, String surname) {
        char firstName = name.charAt(0);
        char lastName = surname.charAt(0);
        String nameInitials = "" + firstName + lastName;
        return nameInitials.toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(getUserInitials("John", "Doe"));
        System.out.println(getUserInitials("steve", "harvey"));
        System.out.println(getUserInitials("dENNis", "KinBRO"));
    }
}
