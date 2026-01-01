package week3.Section43;

public class CombineFullName {
    public static String combineNames(String firstName, String lastName) {
        String wholeName = firstName.concat(" ").concat(lastName);
        return wholeName;
    }

    public static void main(String[] args) {
        String fullName = combineNames("John", "Doe");
        System.out.println(fullName);
    }
}
