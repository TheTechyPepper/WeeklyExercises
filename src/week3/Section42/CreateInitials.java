package week3.Section42;

public class CreateInitials {
    public static String createInitials(String firstName, String lastName) {
        char firstNameInitial = firstName.charAt(0);
        char lastNameInitial = lastName.charAt(0);

        return "" + firstNameInitial + lastNameInitial;
    }


    public static void main(String[] args) {
        String initials = createInitials("James", "Brown");
        System.out.println(initials);

        String initial2 = createInitials("Maya", "Angelou");
        System.out.println(initial2);
    }
}
