package week3.Section46;

public class NumberOfCharacters {
    public static int countCharacter(String strCharacters) {
        int strLength = strCharacters.length();
        return strLength;
    }

    public static void main(String[] args) {
        int length1 = countCharacter("hello");
        System.out.println(length1);

        int length2 = countCharacter("");
        System.out.println(length2);

        int length3 = countCharacter("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce finibus erat enim, ut ultrices mauris fringilla ut.");
        System.out.println(length3);
    }
}
